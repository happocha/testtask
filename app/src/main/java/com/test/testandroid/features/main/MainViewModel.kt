package com.test.testandroid.features.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.test.testandroid.models.Category
import com.test.testandroid.models.Product
import com.test.testandroid.repositories.CategoryRepository
import com.test.testandroid.repositories.ProductRepository
import com.test.testandroid.repositories.SessionRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@FlowPreview
class MainViewModel @Inject constructor(
    private val sessionRepository: SessionRepository,
    private val productRepository: ProductRepository,
    private val categoryRepository: CategoryRepository,
    private val converter: MainConverter
) : ViewModel() {

    val screenState = MutableLiveData<MainScreenState>()

    private var cachedProducts = emptyList<Product>()
    private var cachedCategories = emptyList<Category>()

    init {
        fetchCategoriesWithProducts()
    }

    fun onAddClicked(id: Int) {
        addItem(id)
    }

    fun onPlusClicked(id: Int) {
        addItem(id)
    }

    fun onMinusClicked(id: Int) {
        cachedProducts.firstOrNull { it.id == id }?.let { product ->
            product.count = product.count.minus(1)
        }
        screenState.value = MainScreenState.Data(
            converter.convert(cachedCategories, cachedProducts)
        )
    }

    private fun addItem(id: Int) {
        cachedProducts.firstOrNull { it.id == id }?.let { product ->
            product.count = product.count.plus(1)
        }
        screenState.value = MainScreenState.Data(
            converter.convert(cachedCategories, cachedProducts)
        )
    }

    private fun fetchCategoriesWithProducts() {
        viewModelScope.launch(Dispatchers.IO) {
            sessionRepository.getUsers()
                .flatMapConcat { users ->
                    val token = users.first().token.toString()
                    return@flatMapConcat categoryRepository.getCategories(token)
                        .zip(
                            productRepository.getProducts(token)
                                .catch { emitAll(flowOf(emptyList())) }) { categories, products ->
                            cachedCategories = categories
                            cachedProducts = products
                            return@zip converter.convert(categories, products)
                        }
                }
                .catch { screenState.postValue(MainScreenState.Error(it.message)) }
                .collect { screenState.postValue(MainScreenState.Data(it)) }
        }
    }
}
