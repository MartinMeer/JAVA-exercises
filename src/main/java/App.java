
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*В классе App реализуйте публичный статический метод getMostPopulatedCity(),
который находит среди всех городов самый густонаселенный.
Метод принимает в качестве параметра перечень городов Map<String, Integer>,
где ключ - это название города, а значение - его население.
Метод должен вернуть строку, название города с максимальным населением*/
public class App {

    public static void main(String[] args) {
        Map<String, Integer> cities = Map.of(
                "White River", 114958,
                "Kashmor", 210451,
                "Oxford", 152450
                );

        System.out.println(getMostPopulatedCity(cities)); // Kashmor
    }

    public static String getMostPopulatedCity(Map<String, Integer> cities) {
        if (cities.isEmpty()) {
            return null;
        }
        LinkedList<Integer> citiesByValues = new LinkedList<>(cities.values());
        Collections.sort(citiesByValues);
        Integer firstCity = citiesByValues.getLast();
        for (Map.Entry<String, Integer> entry : cities.entrySet()) {
            if (entry.getValue().equals(firstCity)) {
                return entry.getKey();
            }
        }
        return null;
    }
}
