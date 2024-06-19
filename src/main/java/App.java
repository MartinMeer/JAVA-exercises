/*В классе App реализуйте публичный статический метод sortBooks(),
который принимает на вход список книг List<Book> и сортирует его по названию книги в обратном порядке.
Метод должен вернуть новый список*/


import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        var fruits = new ArrayList<>(List.of("apple", "lemon", "pear", "avocado", "mango"));
        ListUtils.filter(fruits, e -> e.startsWith("a"));
        System.out.println(fruits);
        var numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 8));
        ListUtils.filter(numbers, e -> e % 2 == 0);
        System.out.println(numbers);

        var numbers1 = new ArrayList<>(List.of(1.5, 2.3, 15.8, 10.2, 0.5));
        ListUtils.filter(numbers1, e -> e > 10.1);
        System.out.println(numbers1);
    }
}
