package week8.Q5Element;

abstract class Element {
    private String symbol;
    private int atomicNumber;
    private double atomicWeight;
    Element(String symbol, int atomicNumber, double atomicWeight){
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;
    }
    String getSymbol(){
        return symbol;
    }
    int getAtomicNumber(){
        return atomicNumber;
    }
    double getAtomicWeight(){
        return atomicWeight;
    }
    abstract void describeElement();
}
