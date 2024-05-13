import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.StringJoiner;

/*Реализуйте публичный статический метод makeCensored(),
который заменяет каждое вхождение указанного слова (из списка переданных) в предложении
на последовательность $#%! и возвращает полученную строку. Аргументы:
Текст
Массив стоп-слов
Словом считается любая непрерывная последовательность символов, включая любые спецсимволы (без пробелов).*/
public class App {
    public static void main(String[] args) {
        // Общие уникальные элементы: 1, 3, 2
        //App.getSameCount(new int[] {1, 3, 2, 2}, new int[] {3, 1, 1, 2, 5}); // 3

// Общие уникальные элементы: 4
        //App.getSameCount(new int[] {1, 4, 4}, new int[] {4, 8, 4}); // 1

// Общие уникальные элементы: 1, 10
        //getSameCount(new int[] {1, 10, 3}, new int[] {10, 100, 35, 1}); // 2

// Нет элементов
        //getSameCount(new int[] {}, new int[] {}); // 0
        System.out.println(Arrays.toString(getSameCount(new int[] {1, 3, 2, 2}, new int[] {3, 1, 1, 2, 5}))); // [1, 2, 3, 4, 5, 6]
    }
    /*Реализуйте публичный статический метод getSameCount(),
    который принимает на вход два массива целых чисел.
    Метод должен возвращать количество общих уникальных значений в обоих массивах*/
    public static int getSameCount(int[] numbers1, int[] numbers2) {
        int sameCount;
        return sameCount;
    }
}
