    import java.util.ArrayList;
    import java.util.List;
import java.util.function.Predicate;

public class CollectionsUtils<T> {
    private static final List<Object> filtered = new ArrayList<>();
    public List<Object> filter(List<Object> users, Predicate<Object> fn) {
        ArrayList<Object> filteredList = new ArrayList<>();
        for (Object user : users) {
            if (fn.test(user)) {
                filteredList.add(user);
            }
        }
    return filteredList;
    }
}
