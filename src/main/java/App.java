import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

/*Реализуйте в классе метод isEqual().
Метод сравнивает текущего пользователя (того, на котором мы вызываем этот метод)
с другим пользователем (переданным в метод в качестве параметра).
Сравнение пользователей происходит на основе их идентификаторов.
Если идентификаторы пользователей равны, то это один и тот же пользователь и метод isEqual() должен вернуть true.
В другом случае метод должен вернуть false.*/
public class App {
    public static void main(String[] args) {
        var user1 = new User(1, "Nick12");

// Другой пользователь с такими же id
        var user2 = new User(2, "Nick");

// Сравниваем пользователя user1 с другим пользователем user2
// Так как идентификаторы совпадают, это один и тот же пользователь
        //user1.isEqual(user2); // true

// У пользователя другой id
        var user3 = new User(1, "Nick12");

        //user1.isEqual(user3); // false

        System.out.println(user1.isEqual(user3));


    }
}
