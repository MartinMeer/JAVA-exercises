import org.apache.commons.lang3.ArrayUtils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/*публичный статический метод countNumbers(),
который принимает в качестве параметра список List целых чисел
и подсчитывает количество положительных, отрицательных чисел и нулей в этом списке.
Метод должен вернуть Map, где ключом будет строка - тип числа ("positive", "negative" или "zero"),
а значением - количество чисел данного типа*/

public class App {
    public static void main(String[] args) {
        var numbers1 = List.of(-2, -3, 4, 3, 8, 0, 0, 0, 0);
        Map<String, Integer> result1 = App.countNumbers(numbers1);
        System.out.println(result1);
    } // => {"negative"=2, "positive"=3, "zero"=1}

    public static Map<String, Integer> countNumbers(List<Integer> numbers) {
        Map<String, Integer> result = new HashMap<>(Map.of("zero", 0, "positive", 0, "negative", 0));
        numbers.forEach((number) -> {
            var type = convertKey(number);
            result.compute(type, (k, v) -> v + 1);
        });


        return result;
    }

    public static String convertKey(int number) {
        if (number > 0) {
            return "positive";
        } else if (number < 0) {
            return "negative";
        }
        return "zero";
    }

}
