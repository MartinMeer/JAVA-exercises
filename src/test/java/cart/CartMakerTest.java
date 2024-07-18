package cart;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CartMakerTest {

    Cart cart;
    Good milk;
    Good bread;

    @BeforeEach
    void setUp() {
        cart = CartMaker.makeCart();
        milk = new Good("milk", 20);
        bread = new Good("bread", 15);
    }

    @Test
    void addItem() {
        cart.addItem(milk, 2);
        assertEquals(1, cart.getItems().size());
    }

    @Test
    void getItems() {
        cart.addItem(milk, 2);
        cart.addItem(bread, 3);
        assertEquals(2, cart.getItems().size());
    }

    @Test
    void getCost() {
        cart.addItem(milk, 2);
        cart.addItem(bread, 3);
        assertEquals(85, cart.getCost());
    }

    @Test
    void getCount() {
        cart.addItem(milk, 2);
        cart.addItem(bread, 3);
        assertEquals(5, cart.getCount());
    }
}