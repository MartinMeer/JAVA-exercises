

/*В классе App реализуйте публичный статический метод sortBooks(),
который принимает на вход список книг List<Book> и сортирует его по названию книги в обратном порядке.
Метод должен вернуть новый список*/


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {
        var tr = new SimpleTriple("str", 1, true);

        tr.getLeft(); // str
        tr.getRight(); // true
        tr.getMiddle(); // 1

        System.out.println(tr.getLeft());
    }

    public static List<Integer> duplicate(List<Integer> numbers) {
        var duplicated = new ArrayList<Integer>(numbers);
        duplicated.replaceAll((a) -> a * 2);
        return duplicated;
    }
}
