package TestPizza;

import OOP.Pizza;
import org.junit.jupiter.api.Test;

import static OOP.App.getPizza;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*var pizza = OOP.App.getPizza();

pizza.getSize(); // big
pizza.getDough(); // thin
pizza.getSauce(); // tomato
pizza.getVegetableTopping(); // basil
pizza.getCheeseTopping(); // mozzarella*/

public class TestPizza {

    //Pizza pizza;


    @Test
    public void testPizzaVeg() {
        String size = "big";
        String dough = "thin";
        String sauce = "tomato";
        String meatTopping;
        String vegetableTopping = "basil";
        String cheeseTopping = "mozzarella";
        Pizza pizza = getPizza();
        assertEquals ("big", pizza.getSize());
        assert (pizza.getDough().equals("thin"));
        assert (pizza.getSauce().equals("tomato"));
        assert (pizza.getVegetableTopping().equals("basil"));
        assert (pizza.getCheeseTopping().equals("mozzarella"));

    }


}
