import MyUtils.MyListUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static MyUtils.MyListUtils.indexOf;
import static MyUtils.MyListUtils.fill;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestMyListUtilsFill {

    /**Метод заполняет элементы списка переданным значением, начиная со старта и заканчивая (но не включая) конечной позицией.
     * Метод меняет исходный список!
     Метод принимает следующие параметры:
     coll – список List, элементы которого будут заполнены
     element – значение, которым будут заполнены элементы списка
     begin – стартовая позиция. Не обязательный параметр. Если стартовая позиция не передана, заполнение будет происходить с начала списка.
     end – конечная позиция. Не обязательный параметр. Если конечная позиция не передана, заполнение будет происходить до конца списка.
     Метод работает только с неотрицательными индексами*/

    List coll;
    String[] expected;

    @BeforeEach
    public void setUp() {
        var items = List.of("a", "b", "c", "d", "e");
        coll = new ArrayList<>(items);
    }

    @Test
    public void testFill1() {
        fill(coll, "*");
        expected = new String[]{"*", "*", "*", "*", "*"};
        assertArrayEquals(expected, coll.toArray());
    }
    @Test
    public void testFill2() {
        fill(coll, "*", 1, 3);
        expected = new String[]{"a", "*", "*", "d", "e"};
        assertArrayEquals(expected, coll.toArray());
    }
    @Test
    public void testFill3() {
        fill(coll, "*", 5, 10);
        expected = new String[]{"a", "b", "c", "d", "e"};
        assertArrayEquals(expected, coll.toArray());
    }
    @Test
    public void testFill4() {
        fill(coll, "*", 1);
        expected = new String[]{"a", "*", "*", "*", "*"};
        assertArrayEquals(expected, coll.toArray());
    }
    @Test
    public void testFill5() {
        fill(coll, "*", 1, 100);
        expected = new String[]{"a", "*", "*", "*", "*"};
        assertArrayEquals(expected, coll.toArray());
    }

    @Test
    public void testFill6() {
        fill(coll, "*", 100, 1);
        expected = new String[]{"a", "b", "c", "d", "e"};
        assertArrayEquals(expected, coll.toArray());
    }
   /* @Test
    public void testFill6() {
        fill(coll, "*", 1, -2);
        expected = new String[]{"a", "b", "*", "*", "e"};
        assertArrayEquals(expected, coll.toArray());
    }*/
   /* @Test
    public void testFillEx1() {
        assertThrows(IllegalArgumentException.class, () -> fill(coll, "*", -1), "Begin index should NOT be negative!");;
    }*/
    /*@Test
    public void testFillEx2() {
        assertThrows(IllegalArgumentException.class, () -> fill(coll, "*", 100, 1), "Begin index should NOT be more than end index!");
    }*/






}
