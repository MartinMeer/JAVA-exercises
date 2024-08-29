package OOP;

public class App {
   static String size = "big";
    static String dough = "thin";
    static String sauce = "tomato";
    static String meatTopping = "";
    static String vegetableTopping = "";
    static String cheeseTopping = "mozzarella";

    /*public static void main(String[] args) {

        Pizza pizza = getPizza();

    }*/

    public static Pizza getPizza() {
        Pizza.PizzaBuilder pizzaBuilder = new Pizza.PizzaBuilder()
                .size(size)
                .dough(dough)
                .sauce(sauce)
                .cheeseTopping(cheeseTopping);
        if (!meatTopping.isEmpty()) {
            pizzaBuilder.meatTopping(meatTopping);
            return pizzaBuilder.build();
        } else if (!vegetableTopping.isEmpty()) {
            pizzaBuilder.vegetableTopping(vegetableTopping);
            return pizzaBuilder.build();
        }
        return pizzaBuilder.build();
    }
}