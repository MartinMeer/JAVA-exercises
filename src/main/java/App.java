import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

/*В классе App реализуйте публичный статический метод calculateAverage(), который принимает в качестве параметра массив целых чисел.
Метод должен вернуть среднее арифметическое значение всех чисел в массиве, число типа Double.
Так как предполагается, что данные в массиве мы получили от пользователей, на их надежность полагаться не стоит.
На вход метода может прийти пустой массив, или массив, содержащий значения null.
В этом случае вычислить среднее значение невозможно и метод должен вернуть null*/
public class App {
    public static void main(String[] args) {
        int[] numbers = {5, 8 ,2, 4, 7, 1, 6, 9, 3};
        Integer[] num1 = new Integer[] {1, 2, 3, 4}; // 2.5
        Integer[] num2 = new Integer[] {}; // null
        Integer[] num3 = new Integer[] {1, 2, 3, 4, null}; // null

        System.out.println(calculateAverage(num1));
        System.out.println(calculateAverage(num2));
        System.out.println(calculateAverage(num3));
    }

    /*public static Double calculateAverage(Integer[] num) {
        Integer[] clearNum = ArrayUtils.removeAllOccurrences(num, null);
        double length = clearNum.length;
        double sum = 0.0;
        if (length == 0) {
            return null;
        }
        for (Integer givenNUmber : clearNum) {
            if (givenNUmber != null)
                sum += givenNUmber;
        }
        return sum / length;

    }*/
    public static Double calculateAverage(Integer[] numbers) {

        var length = numbers.length;

        if (length == 0) {
            return null;
        }

        var sum = 0.0;

        for (var num : numbers) {

            if (num == null) {
                return null;
            }

            sum += num;
        }

        return sum / length;
    }


}
