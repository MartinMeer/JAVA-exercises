import OOP.Pizza;

public class TestPizza {

    Pizza pizza1;


    public void testPizzaVeg() {
        pizza1 = App.getPizza("big", "thin", "tomato", "j", "mozzarella");

    }

    public void testPizzaMeat() {
        pizza1 = App.getPizza("big", "thin", "tomato", "pork", "basil", "dorblue");

    }
}
