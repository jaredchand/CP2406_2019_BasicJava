package week8;

public class NonFiction extends Book {
    NonFiction(String title){
        super(title);
        setPrice(25.95);
    }
    @Override
    public void setPrice(double price){
        super.price = price;
    }
}
