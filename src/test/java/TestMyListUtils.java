import MyUtils.MyListUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static MyUtils.MyListUtils.indexOf;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMyListUtils {

    List<Integer> coll;
    MyListUtils<Integer> myListUtils;
    ArrayList<Integer> list;

    @BeforeEach
    public void setUp(){
        coll = Arrays.asList(1, 2, 3, 4);
        myListUtils = new MyListUtils<>();
        list = new ArrayList<>(coll);
    }

    /**var coll = Arrays.asList("a", "b", "c", "d");

     // Все вызовы нужно рассматривать, как независимые
     fill(coll, "*", 1, 3);
     System.out.println(coll); // => ["a", "*", "*", "d"]

     fill(coll, "*");
     System.out.println(coll); // => ["*", "*", "*", "*"]

     fill(coll, "*", 4, 6);
     System.out.println(coll); // => ["a", "b", "c", "d"]

     fill(coll, "*", 0, 10);
     System.out.println(coll); // => ["*", "*", "*", "*"]*/
    @Test
    public void testFill() {

    }


    @Test
    public void testIndexOf() {
        List<Integer> coll;
        int actual;

        coll = List.of(1, 2, 3, 2, 4);
        actual = indexOf(coll, 2, 2);
        assertEquals(3, actual);

        coll = List.of();
        actual = indexOf(coll, 2, 2);
        assertEquals(-1, actual);

        coll = List.of(1, 2, 3, 2, 4, 5, 6);
        actual = indexOf(coll, 2, -3);
        assertEquals(-1, actual);

        coll = List.of(1, 2, 3, 2, 4);
        actual = indexOf(coll, 2, -9);
        assertEquals(1, actual);

        coll = List.of(1, 2, 3, 2, 4);
        actual = indexOf(coll, 2);
        assertEquals(1, actual);



        // BEGIN (write your solution here)

        // END
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
        assertThrows(IndexOutOfBoundsException.class, () -> MyListUtils.add(list, 5, 10));
    }





}
