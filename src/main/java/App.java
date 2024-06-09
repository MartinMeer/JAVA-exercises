import org.apache.commons.collections4.CollectionUtils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/*Метод должен вернуть список строк - названий автомобилей, выпущенных до указанного года.
Каждое название - это марка + модель, например "Jaguar XK120".
Список должен быть отсортирован по названиям автомобилей в прямом порядке без учета регистра*/
public class App {

    public static void main(String[] args) {
        var cars = List.of(
                new Car("Jaguar", "XK120", LocalDate.of(1950, 8, 21)),
                new Car("Mercedes-Benz", "W114", LocalDate.of(1968, 7, 10)),
                new Car("Fiat", "600", LocalDate.of(1956, 1, 1))
        );

        var result = App.getCars(cars, 1960);
        System.out.println(result); // => [Fiat 600, Jaguar XK120]
    }
    public static List<String> getCars(List<Car> cars, int year) {
        List<String> manufacturedBeforeYear = new ArrayList<>();
        for (Car givenCar : cars) {
            if (givenCar.getManufacturedAt().getYear() < year) {
                manufacturedBeforeYear.add(String.valueOf(givenCar));
            }
        }
        Collections.sort(manufacturedBeforeYear, String.CASE_INSENSITIVE_ORDER);
        return manufacturedBeforeYear;
    }
}
