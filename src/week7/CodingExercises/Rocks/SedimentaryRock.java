package week7;

public class SedimentaryRock extends Rock {
    SedimentaryRock(int numberSamples, int weight){
        super(numberSamples, weight);
        super.description = "A rock formed from layers of sediment";
    }
}
