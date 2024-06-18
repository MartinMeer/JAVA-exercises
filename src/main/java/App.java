

/*В классе App реализуйте публичный статический метод sortBooks(),
который принимает на вход список книг List<Book> и сортирует его по названию книги в обратном порядке.
Метод должен вернуть новый список*/

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Box value1 = new Box("str");
        Box value2 = new Box(1);
        Box value3 = new Box(true);
        Box value4 = new Box('a');
        User user = new User("John", LocalDate.of(2000, 1, 1));
        Box value5 = new Box(user);

        List<Box> list = List.of(value1, value2, value3, value4, value5);

        System.out.println();

    }
}
