package week7;

public class IgneousRock extends Rock {
    IgneousRock(int numberSamples, int weight){
        super(numberSamples, weight);
        super.description = "A rock formed from magma or lava";
    }
}
