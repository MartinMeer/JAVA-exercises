import java.util.Random;

/*В файле создайте класс MyRandom, который будет представлять собой наш собственный генератор чисел.
Генератор предназначен для получения случайных чисел в в диапазоне от 1 до 100 включительно.
Конфигурацию нашего генератора — верхнюю и нижнюю границы диапазона будем хранить в статических свойствах.
Создайте в классе соответствующие статические свойства.
Реализуйте в классе публичный статический метод generate(), который будет возвращать случайное число типа int в диапазоне, указанном в конфиге класса*/
public class MyRandom {
    private static final int UPPER_BOUND = 100;
    private static final int LOWER_BOUND = 1;

    public static int generate() {
        Random random = new Random();
        return random.nextInt(LOWER_BOUND, UPPER_BOUND);
    }
}
