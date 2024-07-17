import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
//import static Without.without;
/**/


class WithoutTest {

    private Without without;

    @BeforeEach
    public void setUp() {
        without = new Without();
    }

    @Test
    public void right() {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] withoutRight = without.without(numbers, 2, 3);
        assertArrayEquals(new int[]{1, 4, 5}, withoutRight);
    }
    @Test
    public void empty() {
        int[] emptyNumbers = {};
        int[] withoutEmpty = without.without(emptyNumbers, 2, 3);
        assertArrayEquals(new int[0], withoutEmpty);
    }
    @Test
    public void withDuplicateNumbers() {
        int[] withDuplicateNumbers = {1, 2, 2, 2, 5};
        int[] withoutEmpty = without.without(withDuplicateNumbers, 2, 3);
        assertArrayEquals(new int[]{1, 5}, withoutEmpty);
    }
    @Test
    public void emptyValues() {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] withoutRight = without.without(numbers);
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, withoutRight);
    }

    @Test
    public void bounds() {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] bounds = without.without(numbers, 1, 5);
        assertArrayEquals(new int[] {2, 3, 4}, bounds);
    }


}
