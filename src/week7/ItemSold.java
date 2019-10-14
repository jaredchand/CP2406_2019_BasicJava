package week7;

public class ItemSold {

    private int number;
    private String description;
    private double price;

    ItemSold(int number, String description, double price){
        this.number = number;
        this.description = description;
        this.price = price;
    }
    int getNumber(){
        return number;
    }
    String getDescription(){
        return description;
    }
    double getPrice(){
        return price;
    }
    void setNumber(int number){
        this.number = number;
    }
    void setDescription(String description){
        this.description = description;
    }
    void setPrice(double price){
        this.price = price;
    }
}
