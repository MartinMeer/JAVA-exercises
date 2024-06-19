public class Man implements Human {

    private String name;
    private final String sex = "male";

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getSex() {
        return this.sex;
    }

    public Man(String name) {
        this.name = name;
    }

    /* @Override
    public Object getSex() {
        return null;
    }*/

   /* @Override
    public Object setSex() {
        return null;
    }*/
}
