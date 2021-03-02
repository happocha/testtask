Создать простое приложение с архитектурой MVVM используя ViewModel, Livedata, Coroutines.  
Использовать Dagger как минимум с двумя Subcomponent. В ViewModel использовать inject через конструктор.

### SplashActivity
 * Проверить авторизирован ли пользователь (посмотеть в Room есть ли запись о пользователе)
 * В зависимости от этого отправить на экран авторизации либо сразу в MainActivity

### AuthActivity
 * Реализовать авторизацию
 * Сохранить пользователя в Room и пройти дальше в MainActivity

### MainActivity
Обратиться в CategoryRepository и ProductRep для получения данных и вывести их на экран, используя MainRecyclerAdapter( ProductViewHolder, CategoryViewHolder)
Данные в адаптере должны выглядеть так:
- Category1
  - productOfCategory1
  - productOfCategory1
- Category2
  - productOfCategory2
 
В ProductViewHolder есть кнопки при нажатии на которые происходит следующее:
* addToBasketButton (она становится invisible, а minusButton и plusButton становятся видимыми и кол-во становится 1)
 * minusButton (кнопка регулировки кол-ва продукта, если количество 0 - она становится invisible и plusButton становится invisible)
 * plusButton (кнопка регулировки кол-ва продукта, при нажатии кол-во увеличивается на 1)
p.s Кол-во выводится в productCountTextView (если количество 0 invisible иначе visible)
