package week7;

public class InsuredPackage extends Package {
    private double insuranceCost;
    InsuredPackage(int weight, char shippingMethod){
        super(weight, shippingMethod);
        costAfterInsurance();
    }
    private void costAfterInsurance(){
        double costWithoutInsurance = super.calculateCost();
        if (costWithoutInsurance >= 0 && costWithoutInsurance <= 1.00){
            insuranceCost = 2.45;
        } else if (costWithoutInsurance > 1.00 && costWithoutInsurance <= 3.00){
            insuranceCost = 3.95;
        } else if (costWithoutInsurance > 3.00){
            insuranceCost = 5.55;
        }
        super.setShippingCost(costWithoutInsurance + insuranceCost);
    }
    void display(){
        super.display();
        System.out.println("This package is insured, the cost of $" + insuranceCost + " for insurance is included in the total cost");
    }
}
