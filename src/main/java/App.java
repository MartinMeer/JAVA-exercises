import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

/*Реализуйте публичный статический метод getIntersectionOfSortedArrays(),
который принимает на вход два отсортированных массива целых чисел и находит их пересечение.
Пересечение двух массивов A и B — это массив только с теми элементами A и B, которые одновременно принадлежат обоим массивам, без дублей.
Алгоритм
Поиск пересечения двух неотсортированных массивов —
операция, в рамках которой выполняется вложенный цикл с полной проверкой каждого элемента первого массива на вхождение во второй.
Сложность данного алгоритма O(n * m) где n и m — размерности массивов.
Если массивы отсортированы, то можно реализовать алгоритм, сложность которого уже O(n + m), что значительно лучше.

Суть алгоритма довольно проста. В коде вводятся два указателя (индекса) на каждый из массивов.
Начальное значение каждого указателя 0. Затем идёт проверка элементов, находящихся под этими индексами в обоих массивах.
Если они совпадают, то значение заносится в результирующий массив, а оба индекса инкрементируются.
Если значение в первом массиве больше, чем во втором, то инкрементируется указатель второго массива, иначе — первого.
NB метод Arrays.copyOf() позволяет скопировать первые несколько элементов массива*/
public class App {
    public static void main(String[] args) {
        int[] numbers1 = {10, 11, 24};
        int[] numbers2 = {10, 13, 14, 18, 24, 30};
        var result1 = App.getIntersectionOfSortedArrays(numbers1, numbers2);
        System.out.println(Arrays.toString(result1)); // => [10, 24]

        int[] numbers3 = {10, 11, 24};
        int[] numbers4 = {-2, 3, 4};
        var result2 = App.getIntersectionOfSortedArrays(numbers3, numbers4);
        System.out.println(Arrays.toString(result2)); // => []
    }

    public static int[] getIntersectionOfSortedArrays(int[] numbers1, int[] numbers2) {
        int resultLength = Math.max(numbers1.length, numbers2.length);
        int[] result;
        //int cutResultIndex = ArrayUtils.indexOf(result, 0);
        int index1 = 0;
        int index2 = 0;
            for (int i = 0; i < resultLength ; i++) {
                if (numbers1[index1] == numbers2[index2]) {
                    result[i] = numbers1[index1];
                    index1++;
                    index2++;
                } else if (numbers1[index1] > numbers2[index2]) {
                    index1++;
                } else {
                    index2++;
                }
            }

        return result;//Arrays.copyOfRange(result, 0, cutResultIndex);
    }
}
