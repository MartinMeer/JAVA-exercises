import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*у нас есть список пользователей,
из которого мы хотим получить список возрастов этих пользователей для каких-то дальнейших вычислений или формирования данных по запросу.*/
public class App {

    public static void main(String[] args) {
        User user1 = new User(LocalDate.of(2000, 1, 6));

        List<User> users = List.of(
                user1,
                new User(LocalDate.of(1999, 1, 1)),
                new User(LocalDate.of(2010, 5, 8)),
                new User(LocalDate.of(2008, 10, 11))
        );

        LocalDate currentDate = LocalDate.now();
        LinkedList<Integer> ages = new LinkedList<>();

        for (User givenUser : users) {
            Period fullAge = Period.between(givenUser.getBirthday(), currentDate);
            Integer age = fullAge.getYears();
            ages.add(age);
        }

        System.out.println(ages);






    }




}
