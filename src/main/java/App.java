import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {

    public static void main(String[] args) {
        var numbers = List.of(3, -5, 6, 1, 0, -2, 10);
        var numbers1 = List.of(-100, 1, -12, -1, -56, -34);
        System.out.println(getSecondBiggest(numbers1));
    }
    /*В классе App реализуйте публичный статический метод getSecondBiggest(), который принимает в качестве параметра список целых чисел List<Integer>. \
    Метод должен вернуть второе по величине число из списка.
    Если найти такое число не представляется возможным (например, список пуст или в нем только один элемент), метод должен вернуть null*/

    public static Integer getSecondBiggest(List<Integer> numbers) {
        return numbers.stream()
                .sorted((a, b) -> (Integer.compare(b, a)))
                .skip(1)
                .findFirst()
                .orElse(null);
    }
}















