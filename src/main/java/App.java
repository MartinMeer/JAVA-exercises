/*В классе App реализуйте публичный статический метод sortWords(), который сортирует список List строк.
Метод должен вернуть новый список, строки в котором отсортированы в алфавитном порядке. Используйте в реализации стримы*/


import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        var fruits = List.of("lemon", "apple", "banana");
        var result = App.sortWords(fruits);
        System.out.println(result); // => [apple, banana, lemon]
    }
    public static List<String> sortWords(List<String> words) {
        var stream = words.stream()
                .sorted()
                .toList();
        return stream;
    }
}
