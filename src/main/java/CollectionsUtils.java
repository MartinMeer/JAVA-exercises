import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CollectionsUtils {
    private static final List<Object> filtered = new ArrayList<>();
    public static List<User> filter (List<User> users, Predicate<User> fn) {
        ArrayList<User> filteredList = new ArrayList<>();
        for (User user : users) {
            if (fn.test(user)) {
                filteredList.add(user);
            }
        }

        return filteredList;
    }
}
