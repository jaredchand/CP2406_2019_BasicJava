package week8;

class NonMetalElement extends Element {
    NonMetalElement(String symbol, int atomicNumber, double atomicWeight){
        super(symbol, atomicNumber, atomicWeight);
    }
    @Override
    void describeElement(){
        System.out.println("This element is a non metal, non metals don't conduct electricity as well as metals.");
    }
}
