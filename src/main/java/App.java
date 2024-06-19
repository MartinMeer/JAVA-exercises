/*В классе ListUtils создайте обобщенный статический метод findFirstIndex(),
который на вход принимает список List неизвестного типа.
Единственное, что известно о типе в списке это то, что он всегда будет унаследован от класса Human.

Метод принимает на вход два параметра:
    - humans - лист неизвестного типа
    - namePrefix - префикс имени для поиска
Метод ищет в списке первого человека, у которого имя начинается с заданного префикса и возвращает его индекс.
В случае если ни одного такого человека нет, нужно вернуть значение -1*/


import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        var people = new ArrayList<>(List.of(
                new Man("Oleg"),
                new Woman("Olga"),
                new Man("German"),
                new Woman("Eugenia")
        ));

        System.out.println(ListUtils.findFirstIndex(people, "G")); // 1
        System.out.println(ListUtils.findFirstIndex(people, "Ol")); // 1
        System.out.println(ListUtils.findFirstIndex(people, "F")); // -1


    }
}
