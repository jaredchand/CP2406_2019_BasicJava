package week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestSandwich {

    @Test
    void setMain_Ingredient() {
        Sandwich sandwich = new Sandwich();
        sandwich.setMain_ingredient("Tuna");
        assertNotNull(sandwich.main_ingredient);
    }

    @Test
    void setBread() {
        Sandwich sandwich = new Sandwich();
        sandwich.setBread("Wholemeal");
        assertNotNull(sandwich.bread);

    }

    @Test
    void setPrice() {
        Sandwich sandwich = new Sandwich();
        double price = 4.99;
        sandwich.setPrice(price);
        assertEquals(price, sandwich.price);
    }

    @Test
    void getMain_Ingredient() {
        Sandwich sandwich = new Sandwich();
        sandwich.setMain_ingredient("Tuna");
        String main_ingredient = sandwich.getMain_Ingredient();
        assertEquals(main_ingredient, "Tuna");
    }

    @Test
    void getBread() {
        Sandwich sandwich = new Sandwich();
        sandwich.setBread("Wholemeal");
        String bread = sandwich.getBread();
        assertEquals(bread, "Wholemeal");
    }

    @Test
    void getPrice() {
        Sandwich sandwich = new Sandwich();
        sandwich.setPrice(12.99);
        double price = sandwich.getPrice();
        assertEquals(price, 12.99);
    }
}
