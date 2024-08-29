package TestPizza;

import OOP.App;
import OOP.Pizza;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/*var pizza = OOP.App.getPizza();

pizza.getSize(); // big
pizza.getDough(); // thin
pizza.getSauce(); // tomato
pizza.getVegetableTopping(); // basil
pizza.getCheeseTopping(); // mozzarella*/

public class TestPizza {

    @Test
    public void testPizzaWithAllParams() {
        var pizza = Pizza.builder()
                .size("big")
                .dough("thin")
                .sauce("tomato")
                .vegetableTopping("pepper")
                .meatTopping("ham")
                .cheeseTopping("cheddar")
                .build();

        assertThat(pizza.getSize()).isEqualTo("big");
        assertThat(pizza.getDough()).isEqualTo("thin");
        assertThat(pizza.getSauce()).isEqualTo("tomato");
        assertThat(pizza.getVegetableTopping()).isEqualTo("pepper");
        assertThat(pizza.getMeatTopping()).isEqualTo("ham");
        assertThat(pizza.getCheeseTopping()).isEqualTo("cheddar");
    }

    @Test
    public void testPizzaWithoutAllParams1() {
        var pizza = Pizza.builder()
                .size("small")
                .dough("thin")
                .sauce("tomato")
                .cheeseTopping("cheddar")
                .build();

        assertThat(pizza.getSize()).isEqualTo("small");
        assertThat(pizza.getDough()).isEqualTo("thin");
        assertThat(pizza.getSauce()).isEqualTo("tomato");
        assertThat(pizza.getCheeseTopping()).isEqualTo("cheddar");
    }

    @Test
    public void testPizzaWithoutAllParams2() {
        var pizza = Pizza.builder()
                .size("small")
                .dough("thin")
                .sauce("tomato")
                .meatTopping("salami")
                .cheeseTopping("mozzarella")
                .build();

        assertThat(pizza.getSize()).isEqualTo("small");
        assertThat(pizza.getDough()).isEqualTo("thin");
        assertThat(pizza.getSauce()).isEqualTo("tomato");
        assertThat(pizza.getMeatTopping()).isEqualTo("salami");
        assertThat(pizza.getCheeseTopping()).isEqualTo("mozzarella");
    }

    @Test
    public void testGetApp() {
        var pizza = App.getPizza();

        assertThat(pizza.getSize()).isEqualTo("big");
        assertThat(pizza.getDough()).isEqualTo("thin");
        assertThat(pizza.getSauce()).isEqualTo("tomato");
        assertThat(pizza.getVegetableTopping()).isEqualTo("basil");
        assertThat(pizza.getCheeseTopping()).isEqualTo("mozzarella");
    }
}



