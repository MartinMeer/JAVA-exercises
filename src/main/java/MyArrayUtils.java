public class MyArrayUtils {

    /**метод get(strings, index, defaultValue) получает элемент массива по индексу, при условии, что он существует. \
    В ином случае возвращается defaultValue.*/
    public static <T> T get(T[] arr, int index, T defaultValue) {
        int stringsLength = arr.length;
        for (int i = 0; i < stringsLength; i++) {
            if (i == index) {
                return arr[i];
            }
        }
        return defaultValue;
    }

    /**take(numbers, n), который возвращает массив из первых n значений массива.*/
    public static int[] take(int [] numbers, int index) {
        int resultLength = numbers.length - index;
        if (resultLength <= 0) {
            return new int[] {};
        }
        var result = new int[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = numbers[i];
        }
        return result;
    }
}
