import OOP.Pizza;

public class App {

    public static void main(String[] args) {





    }
    public static Pizza getPizza(String size, String dough, String sauce, String vegetableTopping, String cheeseTopping) {
        return new Pizza().builder()
                .size(size)
                .dough(dough)
                .sauce(sauce)
                .vegetableTopping(vegetableTopping)
                .cheeseTopping(cheeseTopping)
                .build();
    }
    public static Pizza getPizza(String size, String dough, String sauce, String meatTopping, String cheeseTopping) {
        return new Pizza().builder()
                .size(size)
                .dough(dough)
                .sauce(sauce)
                .meatTopping(meatTopping)
                .cheeseTopping(cheeseTopping)
                .build();
    }
    public static Pizza getPizza(String size, String dough, String sauce, String meatTopping, String vegetableTopping, String cheeseTopping) {
        return new Pizza().builder()
                .size(size)
                .dough(dough)
                .sauce(sauce)
                .meatTopping(meatTopping)
                .vegetableTopping(vegetableTopping)
                .cheeseTopping(cheeseTopping)
                .build();
    }
    public static Pizza getPizza(String size, String dough, String sauce, String cheeseTopping) {
        return new Pizza().builder()
                .size(size)
                .dough(dough)
                .sauce(sauce)
                .cheeseTopping(cheeseTopping)
                .build();
    }







    

}















