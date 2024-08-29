package OOP;

public class App {

    public static Pizza getPizza() {
        Pizza pizza = Pizza.builder()
                .size("big")
                .dough("thin")
                .sauce("tomato")
                .vegetableTopping("basil")
                .cheeseTopping("mozzarella")
                .build();
        return pizza;
    }
}