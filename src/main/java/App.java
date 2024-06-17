

/*В классе App реализуйте публичный статический метод sortBooks(),
который принимает на вход список книг List<Book> и сортирует его по названию книги в обратном порядке.
Метод должен вернуть новый список*/

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        User user1 = new User("Sam", LocalDate.of(2000, 1, 10));
        User user2 = new User("Bill", LocalDate.of(2000, 1, 10));
        User user3 = new User("Eva", LocalDate.of(2000, 1, 10));
        User user4 = new User("John", LocalDate.of(2000, 1, 10));
        User user5 = new User("Mary", LocalDate.of(2000, 1, 10));
        User user6 = new User("Ann", LocalDate.of(2000, 1, 10));
        user1.setFriends(user2);
        user1.setFriends(user2);
        user1.setFriends(user3);
        user2.setFriends(user1);
        List<User> users = List.of(user1, user2, user3, user4, user5, user6);
        List<User> usersWithoutFriends = CollectionsUtils.filter(users, (user) -> !user.getFriends().isEmpty());
        System.out.println(usersWithoutFriends);




    }

    public static List<User> getUsersWithoutFriends(List<User> users) {
        ArrayList<User> listOfUsers = new ArrayList<>();
        users.forEach((user) -> {
            if (user.getFriends().isEmpty()) {
                listOfUsers.add(user);
            };
        });
        return listOfUsers;
    }




}
