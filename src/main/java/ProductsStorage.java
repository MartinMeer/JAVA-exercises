import lombok.AllArgsConstructor;
import lombok.Getter;

/**В файле создайте класс ProductsStorage, который который представляет собой склад товаров
 goodsQuantity — количество товара на складе
 maxCapacity — максимальная вместимость склада
 Реализуйте в классе конструктор со всеми полями и геттеры

 Реализуйте в классе следующие методы, которые меняют состояние объекта склада:
 placeProducts() — добавляет новые товары на склад. Метод принимает в качестве параметра целое число — количество товара, которое нужно разместить на складе
 takeProducts() — забирает товары со склада. Метод принимает в качестве параметра целое число — количество товара, которое мы изымаем со склада

 Ваша задача — проследить за целостностью состояния объекта, чтобы оно не нарушалась.
 Правила такие:
 1. мы не можем загрузить на склад товаров больше, чем он может вместить.
 2. мы не можем забрать больше, чем есть сейчас.
 При попытке сделать это методы должны вывести на экран сообщение о том, что действие не возможно выполнить, а состояние объекта не должно измениться.
 Содержание сообщения остается на ваше усмотрение*/

@AllArgsConstructor
@Getter
public class ProductsStorage {
    private int goodsQuantity;
    private int maxCapacity;

    public void placeProducts(int inAmount) {
        if (inAmount > (maxCapacity - goodsQuantity)) {
            System.out.println("Склад не может принять "
                    + inAmount
                    + " единиц товаров.\n"
                    + "Максимальное доступно "
                    + (maxCapacity - goodsQuantity)
                    + " мест.");
                    return;
            }
        goodsQuantity += inAmount;
    }

    public void takeProducts(int outAmount) {
        if (outAmount > goodsQuantity) {
            System.out.println("Склад не может выдать "
                    + outAmount
                    + " единиц товаров.\n"
                    + "Максимальное доступно "
                    + goodsQuantity
                    + " единиц товаров.");
        } else {
            goodsQuantity -= outAmount;
        }
    }
}
