package week7;

public class Package {
    private int weight; // weight in ounces
    private char shippingMethod; // A for air, T for truck and M for mail
    private double shippingCost;
    Package(int weight, char shippingMethod){
        this.weight = weight;
        this.shippingMethod = shippingMethod;
        shippingCost = calculateCost();
    }
    void setShippingCost(double newShippingCost){
        shippingCost = newShippingCost;
    }
    void display(){
        String stringShippingMethod;
        switch (shippingMethod){
            case ('A'):
                stringShippingMethod = "Air";
                break;
            case ('T'):
                stringShippingMethod = "Truck";
                break;
            case ('M'):
                stringShippingMethod = "Mail";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + shippingMethod);
        }
        System.out.println("The package weighs " + weight + " ounces and will be sent by " + stringShippingMethod + " which totals $" + shippingCost);
    }
    double calculateCost(){
        if (weight >= 0 && weight <= 8){
            switch (this.shippingMethod) {
                case ('A'):
                    shippingCost = 2;
                    break;
                case ('T'):
                    shippingCost = 1.5;
                    break;
                case ('M'):
                    shippingCost = 0.5;
                    break;
            }
        } else if (weight >= 9 && weight <= 16){
            switch (shippingMethod) {
                case ('A'):
                    shippingCost = 3;
                    break;
                case ('T'):
                    shippingCost = 2.35;
                    break;
                case ('M'):
                    shippingCost = 1.5;
                    break;
            }
        } else if (weight >= 17){
            switch (shippingMethod) {
                case ('A'):
                    shippingCost = 4.5;
                    break;
                case ('T'):
                    shippingCost = 3.25;
                    break;
                case ('M'):
                    shippingCost = 2.15;
                    break;
            }
        } else {
            System.out.println("Error incorrect value");
        }
        return shippingCost;
    }
}
