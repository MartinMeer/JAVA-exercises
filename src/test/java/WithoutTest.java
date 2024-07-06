import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
//import static Without.without;
/**Напишите тесты для метода without(int[] numbers, int... values),
 * который принимает в качестве первого аргумента массив чисел и возвращает его копию,
 * из которой исключены значения, переданные вторым и последующими аргументами.
 * Если массив содержит повторяющиеся элементы с искомым значением, они все исключаются из массива (изучите примеры).
 * Метод without() уже импортирован в файл с тестами.

 Метод without() принимает на вход:

 массив чисел int[] numbers
 любое количество чисел, которые нужно исключить из массива int... values
 Идея метода взята из библиотеки lodash на JavaScript — _.without()

 int[] numbers = {1, 2, 3, 4, 5};
 without(numbers, 2, 3); // [1, 4, 5]

 int[] emptyNumbers = {};
 without(emptyNumbers, 3, 4, 5); // []

 int[] withDuplicateNumbers = {1, 2, 2, 2, 5};
 without(withDuplicateNumbers, 2); // [1, 5]
 Подсказки
 Для сравнения массивов используйте ассерт assertArrayEquals().*/


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
