
/*Реализуйте в классе метод isEqual().
Метод сравнивает текущего пользователя (того, на котором мы вызываем этот метод)
с другим пользователем (переданным в метод в качестве параметра).
Сравнение пользователей происходит на основе их идентификаторов.
Если идентификаторы пользователей равны, то это один и тот же пользователь и метод isEqual() должен вернуть true.
В другом случае метод должен вернуть false.*/


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

    public boolean isEqual(User user) {
        if (user.id == id) {
            return true;
        }
        return false;
    }
}
