package week4;

public class Sandwich {
    String main_ingredient;
    String bread;
    double price;

    public void setMain_ingredient(String ing) {
        main_ingredient = ing;
    }

    public void setBread(String bread_type) {
        bread = bread_type;
    }

    public void setPrice(double amount) {
        price = amount;
    }

    public String getMain_Ingredient() {
        return main_ingredient;
    }

    public String getBread() {
        return bread;
    }

    public double getPrice() {
        return price;
    }
}
