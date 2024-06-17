import java.time.LocalDate;
import java.util.ArrayList;

public final class User {

    private String name;
    private LocalDate birthday;

    private ArrayList<User> friends = new ArrayList<>();

    public User(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }


    public LocalDate getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return name + " " + birthday.toString();
    }

    public ArrayList<User> getFriends() {
        return friends;
    }

    public void setFriends(User user) {
        this.friends.add(user);
    }
}
