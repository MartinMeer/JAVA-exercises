public class Woman implements Human {
    private String name;
    private final String sex = "female";

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getSex() {
        return this.sex;
    }

    public Woman(String name) {
        this.name = name;
    }
}
