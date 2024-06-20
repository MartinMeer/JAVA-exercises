/*публичный статический метод normalize(), который будет выполнять нормализацию.
Метод принимает в качестве параметра список List email-адресов и возвращает новый список, в котором каждый email нормализован.
Нормализация заключается в удалении концевых пробелов и приведении адреса к нижнему регистру*/


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        var products = List.of(
                new Product("Smartphone", "electronics", 500),
                new Product("Laptop", "electronics", 1000),
                new Product("Headphones", "electronics", 100),
                new Product("Smart Watch", "electronics", 300),
                new Product("T-Shirt", "cloth", 20),
                new Product("Sneakers", "shoes", 100),
                new Product("Coffee Machine", "kitchen", 200),
                new Product("Sunglasses", "accessories", 50),
                new Product("Book", "books", 15),
                new Product("Gaming Console", "electronics", 400)
        );

        System.out.println(App.getTotalPrice(products)); // 2300

    }

    /*принимает в качестве параметра список товаров на складе List<Product>.
    Метод должен вернуть общую стоимость всех товаров из категории Электроника (electronics) на складе (число типа int)*/
    public static int getTotalPrice(List<Product> products) {
        if (products.isEmpty()) {
            return 0;
        }
        return products.stream()
                .filter(product -> product.getCategory().equals("electronics"))
                .map(Product::getPrice)
                .reduce(0, Integer::sum);
    }





}
