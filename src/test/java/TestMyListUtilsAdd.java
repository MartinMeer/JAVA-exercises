import MyUtils.MyListUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestMyListUtilsAdd {
    /*
Метод add() добавляет в список, переданный первым аргументом, элемент по указанному индексу.

    - Если в списке уже есть элемент по такому индексу, то он и все следующие элементы сдвигаются вправо.
    - Если индекс не передан, элемент добавляется в конец списка.
    - В случае успешного изменения коллекции метод возвращает true.
    - Метод меняет переданный список

Метод принимает три параметра:
Первый – список List, в который нужно добавить элемент
Второй – добавляемый элемент
Третий (необязательный) - индекс, по которому будет вставлен элемент. Если индекс не передан, элемент будет добавлен в конец списка.
В случае, если индекс элемента выходит за пределы длины массива (index < 0 || index > size()), будет выброшено исключение IndexOutOfBoundsException

List<Integer> coll = Arrays.asList(1, 2, 3, 4);

// Все вызовы нужно рассматривать, как независимые
add(coll, 5); // true
System.out.println(coll); // => [1, 2 ,3, 4, 5]

add(coll, 5, 1); // true
System.out.println(coll); // => [1, 5, 2 ,3, 4]

add(coll, 5, 4); // true
System.out.println(coll); // => [1, 2 ,3, 4, 5]
Подсказки
В этом упражнении нужно будет проверить не только возвращаемое значение, но и то, что метод нужным образом меняет исходный список
Информация по исключению дается для более полного понимания работы метода, проверять это поведение в упражнении не нужно.
 */
    List<Integer> coll = Arrays.asList(1, 2, 3, 4);
    MyListUtils<Integer> myListUtils;
    ArrayList<Integer> list;




    @BeforeEach
    public void setUp(){
        myListUtils = new MyListUtils<>();
        list = new ArrayList<>(coll);
    }


    @Test
    public void TestAddTrue1 () {
        boolean actual = myListUtils.add(list, 5);
        var expectedList = Arrays.asList(1, 2 ,3, 4, 5);

        assertTrue(actual);
        assertIterableEquals(expectedList, list);
        assertEquals(expectedList.getLast(), list.getLast());
    }

    @Test
    public void TestAddTrue2 () throws Exception {
        boolean actual = myListUtils.add(list, 5, 1);
        var expectedList = Arrays.asList(1, 5, 2 ,3, 4);

        assertTrue(actual);
        assertIterableEquals(expectedList, list);
        assertEquals(expectedList.getLast(), list.getLast());
    }

    @Test
    public void TestAddTrue3 () throws Exception {
        boolean actual = myListUtils.add(list, 5, 4);
        var expectedList = Arrays.asList(1, 2, 3, 4, 5);

        assertTrue(actual);
        assertIterableEquals(expectedList, list);
        assertEquals(expectedList.getLast(), list.getLast());
    }

    @Test
    public void TestAddFalse () {
        assertThrows(IndexOutOfBoundsException.class, () -> myListUtils.add(list, 5, 10));
    }





}
