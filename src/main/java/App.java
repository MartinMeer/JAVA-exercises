import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {

        System.out.println(getEvenNumbers(10, 1));
    }
    /*В классе App реализуйте публичный статический метод getSecondBiggest(), который принимает в качестве параметра список целых чисел List<Integer>. \
    Метод должен вернуть второе по величине число из списка.
    Если найти такое число не представляется возможным (например, список пуст или в нем только один элемент), метод должен вернуть null*/

    private static List<Integer> getEvenNumbers(int offset, int limit) {
        return Stream.iterate(111, i -> i + 1)
                .filter(i -> i % 2 == 0)
                .skip(offset)
                .limit(limit)
                .collect(Collectors.toList());
    }


}















