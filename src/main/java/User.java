import java.util.Objects;

public class User {
    private String name;
    private int age;

    User(String name, int age) {
        this.name = name;
        this. age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean equals (Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        User person = (User) obj;


        return name.equals(person.name) && age == person.getAge();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
