import org.apache.commons.lang3.ArrayUtils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**/
public class App {
    public static void main(String[] args) {
        List<User> users = List.of(
                /*new User("Salli", LocalDate.of(1990, 12, 15)),
                new User("Gawen", LocalDate.of(2002, 10, 23)),
                new User("Emmalee", LocalDate.of(1992, 9, 16)),
                new User("Stacee", LocalDate.of(1974, 10, 25)),
                new User("Lydia", LocalDate.of(1987, 5, 10)),
                new User("Annabal", LocalDate.of(1970, 3, 22)),
                new User("Tymon", LocalDate.of(2004, 8, 12)),
                new User("Evania", LocalDate.of(1973, 4, 3))*/
        );
        System.out.println(getOldest(users));

    }
    public static List<User> getOldest(List<User> users) {
        if (users.isEmpty()) {
            return List.of();
        }
        ArrayList<User> oldestUsers= new ArrayList<>(users);
        oldestUsers.sort((v1, v2) -> v1.getBirthday().compareTo(v2.getBirthday()));
        return List.of(oldestUsers.get(0));
    }

    public static List<User> getOldest(List<User> users, int number) {
        if (users.isEmpty()) {
            return List.of();
        }
        ArrayList<User> oldestUsers= new ArrayList<>(users);
        oldestUsers.sort((v1, v2) -> v1.getBirthday().compareTo(v2.getBirthday()));
        return oldestUsers.subList(0, number);
    }

}
