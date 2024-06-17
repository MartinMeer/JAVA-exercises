import org.apache.commons.lang3.ArrayUtils;



/*Создайте функциональный интерфейс BinaryOperation, который будет представлять бинарную операцию.
Так как операция бинарная, единственный метод интерфейса должен принимать два параметра - целые числа и возвращать целое число*/

public class App {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        BinaryOperation add = (v, t) -> v + t;
        System.out.println(calculate(a, b, add));
    }



    public static Integer calculate(Integer a, Integer b, BinaryOperation operation) {
        return operation.operate(a, b);
    }

}
