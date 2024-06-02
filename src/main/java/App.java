import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

/*В классе App создайте публичный статический метод contains(), который принимает два параметра:
Каталог автомобилей — массив Car[]
Автомобиль Car, который мы ищем.
Метод должен вернуть true, если такой же автомобиль есть в каталоге и false в ином случае*/
public class App {
    public static void main(String[] args) {

        Car[] cars = {
            new Car("Aston Martin", "V8 Vantage", 2011),
            new Car("Ford", "VWindstar", 1998),
            new Car("Lotus", "Exige", 2006)
        };

        Car car1 = new Car("GAZ", "Volga", 2006);
        Car car2 = new Car("Lotus", "Exige", 2009);
        Car car3 = new Car("Ford", "VWindstar", 1998);
        Car car4 = car3;

        System.out.println(Arrays.toString(cars) + "\n" + car1 + "\n" + car2 + "\n" + car3 + "\n" + car4);
        System.out.println(contains(cars, car4));
        System.out.println(containsAU(cars, car4));

    }

    public static boolean containsAU(Car[] cars, Car car) {
        return ArrayUtils.contains(cars, car);
    }

    public static boolean contains(Car[] cars, Car car) {
        for (Car givenCar : cars) {
            if (givenCar.equals(car))
            return true;
        }
        return false;
    }
}
