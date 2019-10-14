package week7;

public class MetamorphicRock extends Rock {
    MetamorphicRock(int numberSamples, int weight){
        super(numberSamples, weight);
        super.description = "A rock formed from the metamorphism of another rock type";
    }
}
