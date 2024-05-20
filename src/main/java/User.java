public class User {
    private int id;
    private String nick;

    public User(int id, String nick) {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public boolean isEqual(User user2) {


        return false;
    }
}
