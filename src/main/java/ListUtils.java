import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/*В классе ListUtils создайте обобщенный статический метод filter, который фильтрует коллекцию.
Метод принимает список элементов и лямбда-функцию Predicate, которая содержит логику проверки элемента.
Метод должен вернуть новый список, в котором отсутствуют элементы, не удовлетворяющие условию

 */
public class ListUtils<T> {
   /* private  List<T> list1;
    private  List<T> list2;


    public List<T> merge(List<T> list1, List<T> list2) {
        List<T> mergedList = new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);
        return mergedList;
    }

    public List<T> copy(List<T> listToCopy) {
        var copyList = new ArrayList<T>(listToCopy);
        return copyList;
    }*/
    public static <P extends Number> List<P> filter(List<P> list, Predicate<P> p) {
        ArrayList<P> filteredList = new ArrayList<>();
        for (P element : list) {
            if ((p.test(element))) {
                filteredList.add(element);
            }
        };
        return filteredList;
    }

    public static <T extends Human> int findFirstIndex(List<T> elements, String index) {
        int indexLength = index.length();
        for (T element : elements) {
            String elementName = element.getName();
            if (elementName.substring(0, indexLength).equals(index)) {
                return elements.indexOf(element);
            }
        }
        return -1;
    }
}
