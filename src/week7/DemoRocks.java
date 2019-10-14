package week7;

public class DemoRocks {
    public static void main(String[] args) {
        IgneousRock igneousRock = new IgneousRock(8, 36);
        SedimentaryRock sedimentaryRock = new SedimentaryRock(4, 8);
        MetamorphicRock metamorphicRock = new MetamorphicRock(17, 37);
        System.out.println("Igneous rock: ");
        System.out.println(igneousRock.getDescription());
        System.out.println(igneousRock.getNumberSamples());
        System.out.println(igneousRock.getWeight());
        System.out.println("Sedimentary rock: ");
        System.out.println(sedimentaryRock.getDescription());
        System.out.println(sedimentaryRock.getNumberSamples());
        System.out.println(sedimentaryRock.getWeight());
        System.out.println("Metamorphic rock: ");
        System.out.println(metamorphicRock.getDescription());
        System.out.println(metamorphicRock.getNumberSamples());
        System.out.println(metamorphicRock.getWeight());
    }
}
