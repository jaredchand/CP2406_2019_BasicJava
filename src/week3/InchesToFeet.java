package week3;

public class InchesToFeet {

    void convertAndPrintValues() {
        int inches = 86;
        int feet = inches /12;
        int remainingInches = inches%12;
        System.out.println("Inches " + inches);
        System.out.printf("Converts to: %d feet %d inches", feet, remainingInches);

    }
}
