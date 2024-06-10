
import org.apache.commons.lang3.ArrayUtils;

import java.util.Map;
/*Реализуйте публичный статический метод getPriceWithDiscount(),
который возвращает цену товара с учетом скидки. Метод принимает два параметра:
    - Карта сегодняшних скидок, Map<String, Double>.
Ключ в этой карте - название товара, а значение - скидка на него в процентах
    - Название товара, цену на который мы ищем
Метод должен найти товар в каталоге products и вернуть число типа Double - цену на товар с учетом скидки.
Если товара в каталоге нет, должно вернуться null. Если в карте сегодняшних скидок нет такого товара,
должна вернуться полная цена из каталога*/
public class App {

    private static Map<String, Double> products = Data.getProducts();;

    public static void main(String[] args) {
        Map<String, Double> products = Data.getProducts();

        var discounts = Map.of(
                "Coffee", 10.0,
                "Shrimp", 10.0
        );

        System.out.println(getPriceWithDiscount(discounts, "Salmon"));
    }
    public static Double getPriceWithDiscount(Map<String, Double> discounts, String product) {
            if (!App.products.containsKey(product)) {
                return null;
            }
        double productPrice = App.products.get(product);
        double discount = discounts.getOrDefault(product, 0.0);
            return productPrice - ((productPrice * discount) / 100);
    }
}
