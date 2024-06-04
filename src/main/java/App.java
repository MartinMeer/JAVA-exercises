import java.util.ArrayList;
import java.util.List;

/*В классе App реализуйте публичный статический метод replaceByZero(), который принимает в качестве парамера список List целых чисел.
Метод должен вернуть новый список, в котором все отрицательные числа заменены на нули. Метод не должен менять исходный список*/
public class App {
    public static void main(String[] args) {
        List<Integer> items = List.of(1, 2, -3, -6, -10, 555);
        ArrayList<Integer> testList = new ArrayList<>(items);
        System.out.println(replaceByZero(testList));




    }

    public static List<Integer> replaceByZero(List<Integer> items) {
        List<Integer> replacedNumbers = new ArrayList<>();
        for (Integer givenEl : items) {
            if (givenEl < 0) {
            replacedNumbers.add(0);
            } else {
            replacedNumbers.add(givenEl);
            }
        }
        return replacedNumbers;
    }



}
