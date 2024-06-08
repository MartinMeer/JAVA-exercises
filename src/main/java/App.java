import org.apache.commons.collections4.CollectionUtils;

import java.util.Collections;
import java.util.List;


/*В классе App реализуйте публичный статический метод getCommonFriends(), который находит общих друзей у двух пользователей.
Метод принимает два параметра - пользователей, у которых мы ищем общих друзей
Метод должен вернуть список List<User> друзей, которые являются общими для двух переданных пользователей*/
public class App {

    public static void main(String[] args) {
        var user1 = new User("John");
        user1.addFriend(new User("Ellery"));

        var user2 = new User("Anna");
        user2.addFriend(new User("Abey"));

// Общий друг двух пользователей
        var friend = new User("Jacky");
        user1.addFriend(friend);
        user2.addFriend(friend);

        List<User> commonFriends = App.getCommonFriends(user1, user2);
        System.out.println(commonFriends); // => ["Jacky"]
    }
    public static List<User> getCommonFriends(User user1, User user2) {
        return (List<User>) CollectionUtils.intersection(user1.getFriends(), user2.getFriends());
    }
}
