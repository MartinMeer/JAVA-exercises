package TestPizza;

/*var pizza = OOP.App.getPizza();

pizza.getSize(); // big
pizza.getDough(); // thin
pizza.getSauce(); // tomato
pizza.getVegetableTopping(); // basil
pizza.getCheeseTopping(); // mozzarella*/

import OOP.Pizza;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPizza {

    static Pizza pizza;

    @BeforeAll
    public static void setUpPizza() {
        pizza = new Pizza.Builder()
                .size("big")
                .dough("thin")
                .sauce("tomato")
                .build();
    }


    @Test
    public void testPizza() {
        var actual = pizza.toString();
        var expected = "Your pizza is big, on thin dough, has a tomato sauce.";
        assertEquals(expected, actual);
    }

}



