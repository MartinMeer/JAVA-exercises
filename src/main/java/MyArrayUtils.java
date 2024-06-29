import java.util.Arrays;

public class MyArrayUtils {

    /*метода get(strings, index, defaultValue),
    который получает элемент массива по индексу, при условии, что он существует. \
    В ином случае возвращается defaultValue.*/

    public static String get(String[] strings, int index, String defaultValue) {
        int stringsLength = strings.length;
        for (int i = 0; i < stringsLength; i++) {
            if (i == index) {
                return strings[i];
            }
        }
        return defaultValue;
    }

}
