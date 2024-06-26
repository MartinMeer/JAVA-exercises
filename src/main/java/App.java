

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class App {

    public static void main(String[] args) {

        var users = List.of(
                        new User(Long.valueOf(1), "John"),
                        new User(Long.valueOf(2), "Anna"),
                        new User(Long.valueOf(3), "Alex")
                        );

        var user = App.findUserById(users, 1L);
        //System.out.println(user.getName()); // John

// Пользователя с таким id нет
        App.findUserById(users, 10L); // Error
    }
    /*В классе App реализуйте публичный статический метод findUserById(), который ищет пользователя в списке по идентификатору.
Метод принимает в качестве параметра список пользователей List<User> и идентификатор пользователя, число типа long.
Он должен вернуть пользователя с таким идентификатором, если он есть в списке.
А если такого пользователя нет, выбросить исключение RuntimeException с сообщением User not found*/
    public static User findUserById(List<User> users, long id) {
        var userById = users.stream()
                .filter(user -> user.getId() == id)
                .findFirst();
        return userById.orElseThrow(() -> new RuntimeException("User not found"));
    }





}















