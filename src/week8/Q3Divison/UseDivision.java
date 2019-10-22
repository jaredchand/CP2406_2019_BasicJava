package week8.Q3Divison;

public class UseDivision {
    public static void main(String[] args) {
        InternationalDivision internationalDivision = new InternationalDivision("Human Resources", 63, "Sweden", "Swedish");
        DomesticDivision domesticDivision = new DomesticDivision("IT", 35, "VIC");
        internationalDivision.display();
        domesticDivision.display();
    }
}
