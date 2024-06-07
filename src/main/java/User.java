import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class User {
    private LocalDate birthday;
    private List<User> friends;

    public User(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void setFriends(List<User> friends) {
        this.friends = friends;
    }

    public List<User> getFriends() {
        return friends;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
}
