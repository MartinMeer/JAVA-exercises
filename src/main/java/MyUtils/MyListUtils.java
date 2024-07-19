package MyUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**Метод add() добавляет в список, переданный первым аргументом, элемент по указанному индексу.

    - Если в списке уже есть элемент по такому индексу, то он и все следующие элементы сдвигаются вправо.
    - Если индекс не передан, элемент добавляется в конец списка.
    - В случае успешного изменения коллекции метод возвращает true.
    - Метод меняет переданный список

Метод принимает три параметра:
Первый – список List, в который нужно добавить элемент
Второй – добавляемый элемент
Третий (необязательный) - индекс, по которому будет вставлен элемент. Если индекс не передан, элемент будет добавлен в конец списка.
В случае, если индекс элемента выходит за пределы длины массива (index < 0 || index > size()), будет выброшено исключение IndexOutOfBoundsException. */

public class MyListUtils<T> {
    public static <T> boolean add (List<T> list, T element, int index) throws IndexOutOfBoundsException{
        int listSize = list.size();
        if (index < 0 || index > listSize) {
            throw new IndexOutOfBoundsException();
        }
        list.add(index, element);
        return list.get(index) == element;
    }
    public boolean add(List<T> list, T element) {

        return list.add(element);
    }


    public List<T> merge(List<T> list1, List<T> list2) {
        List<T> mergedList = new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);
        return mergedList;
    }

    public List<T> copy(List<T> listToCopy) {
        var copyList = new ArrayList<T>(listToCopy);
        return copyList;
    }

    public static <P extends Number> List<P> filter(List<P> list, Predicate<P> p) {
        ArrayList<P> filteredList = new ArrayList<>();
        for (P element : list) {
            if ((p.test(element))) {
                filteredList.add(element);
            }
        };
        return filteredList;
    }

    /*public static <T extends Human> int findFirstIndex(List<T> elements, String index) {
        int indexLength = index.length();
        for (T element : elements) {
            String elementName = element.getName();
            if (elementName.substring(0, indexLength).equals(index)) {
                return elements.indexOf(element);
            }
        }
        return -1;
    }*/
    public static <T> int indexOf(List<T> coll, T value, int fromIndex) {
        var collLength = coll.size();
        if (collLength == 0) {
            return -1;
        }

        var normalisedIndex = fromIndex;
        if (normalisedIndex < 0) {
            if (-normalisedIndex > collLength) {
                normalisedIndex = 0;
            } else {
                normalisedIndex += collLength;
            }
        }

        var index = -1;
        for (int i = normalisedIndex; i < collLength; i++) {
            var current = coll.get(i);
            if (current.equals(value)) {
                return i;
            }
        }
        return index;
    }

    public static <T> int indexOf(List<T> coll, T value) {
        return coll.indexOf(value);
    }
}
