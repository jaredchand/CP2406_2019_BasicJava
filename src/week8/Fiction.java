package week8;

public class Fiction extends Book {
    Fiction(String title){
        super(title);
        setPrice(17.95);
    }
    @Override
    public void setPrice(double price) {
        super.price = price;
    }

}
