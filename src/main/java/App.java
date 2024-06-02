/**/
public class App {
    public static void main(String[] args) {
    User user1 = new User("Oleg", 45);
    User user2 = new User("Marina", 35);
    var user3 = new User("Oleg", 45);
    User user4 = user1;
        System.out.println(user4.hashCode());

    }
}
