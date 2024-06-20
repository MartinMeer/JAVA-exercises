/*публичный статический метод normalize(), который будет выполнять нормализацию.
Метод принимает в качестве параметра список List email-адресов и возвращает новый список, в котором каждый email нормализован.
Нормализация заключается в удалении концевых пробелов и приведении адреса к нижнему регистру*/


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        var people = new ArrayList(
                List.of(
                        new Person("John", 17),
                        new Person("Anna", 24),
                        new Person("Alex", 57),
                        new Person("Jun", 32)
                )
        );

        System.out.println(App.getAverageAge(people)); // 32.5



    }
    /*В классе App реализуйте публичный статический метод getAverageAge(),
    который принимает в качестве параметра группу людей — список List<Person>.
    Метод должен вернуть средний возраст людей в нашей группе в виде числа типа Double.
    Если передан пустой список, метод должен вернуть null*/

    public static Double getAverageAge(List<Person> persons) {
        if (persons.isEmpty()) {
            return null;
        }
        var sumStream = persons.stream()
                .reduce(0.0, (sum, person) -> sum + person.getAge(), Double::sum);
        //double avg = sumStream.doubleValue();
        return sumStream / persons.size();






    }





}
