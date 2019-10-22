package week8.Q5Element;

public class ElementArray {
    public static void main(String[] args) {
        Element[] elementArray = new Element[4];
        elementArray[0] = new MetalElement("Fe", 26, 55.845);
        elementArray[1] = new NonMetalElement("C", 6, 12.01);
        elementArray[2] = new NonMetalElement("U", 92, 238.02891);
        elementArray[3] = new MetalElement("W", 74, 183.84);
        for (Element element : elementArray) {
            System.out.println("The elements symbol is " + element.getSymbol() + " it has an atomic " +
                    "number (number of protons) of " + element.getAtomicNumber() + " and an atomic mass of "
                    + element.getAtomicWeight() + "amu");
            element.describeElement();
            System.out.println();
        }
    }
}
