import java.util.ArrayList;
import java.util.List;

/*У списков в Java есть метод get(), который возвращает элемент списка по указанному индексу.
А в случае, если такого индекса нет, выбрасывает исключение.
Вам предстоит создать свой собственный вариант такого метода, но с небольшим отличием в поведении

В классе App реализуйте публичный статический метод getOrDefault(), который принимает на вход три параметра:
- исходная коллекция элементов, список строк List<String>
- индекс элемента, который мы хотим получить, целое число
- дефолтное значение, строка

Метод должен вернуть элемент списка по указанному индексу.
Но, в отличие от стандартного метода списков, в случае, если такого индекса нет, наш метод должен вернуть дефолтное значение, а не выбрасывать исключение*/
public class App {
    public static void main(String[] args) {
        List<String> items = List.of("Mercury", "Venus", "Earth", "Mars");
        List<String> newList = new ArrayList<>(items);
        System.out.println(getOrDefault(newList, 6, "Element does not exist!"));
    }

    public static String getOrDefault(List<String> list, int index, String defaultStr) {
        if (index < 0 || index >= list.size()) {
            return defaultStr;
        }
        return list.get(index);
    }

}
