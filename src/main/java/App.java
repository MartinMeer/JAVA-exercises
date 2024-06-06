import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*у нас есть список пользователей,
из которого мы хотим получить список возрастов этих пользователей для каких-то дальнейших вычислений или формирования данных по запросу.*/
public class App {

    public static void main(String[] args) {
        User user1 = new User(LocalDate.of(1979, 3, 27));

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

        /*сформировать список пользователей, которые родились после 2000 года.*/

        Year year = Year.of(2000);
        LinkedList<User> millenials = new LinkedList<>();

        for (User givenUser : users) {
            if (givenUser.getBirthday().getYear() > 2000) {
                millenials.add(givenUser);
            }
        }
        System.out.println(millenials.size());






    }




}
