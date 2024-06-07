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

        ArrayList<String> items = new ArrayList<>();
        items.add("java");
        items.add("python");
        items.add("C++");
        items.add("kotlin");
        items.add("scala");
        ArrayList<String> copyOf = new ArrayList<>(items);

        System.out.println(items);
        System.out.println(copyOf);

        items.set(2, "C#");

        System.out.println(items);
        System.out.println(copyOf);

        User user1 = new User(LocalDate.of(1979,3,27), "Oleg");
        User user2 = new User(LocalDate.of(1979,3,27), "Oleg");


        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(new User(LocalDate.of(2111,1,1), "&"));
        users.add(new User(LocalDate.of(2020,4,28), "Maya"));
        users.add(new User(LocalDate.of(2006,12,22), "Victoria"));

        ArrayList<User> copyOfUsers = new ArrayList<>(users);

        System.out.println(users);
        System.out.println(copyOfUsers);

        user1.setName("Nobody");

        System.out.println(users);
        System.out.println(copyOfUsers);

        users.get(1).setName("Nobody");

        System.out.println(users.get(1).getName());
        System.out.println(copyOfUsers.get(1).getName());

        users.set(1, user2);

        System.out.println(users);
        System.out.println(copyOfUsers);








    }
}
