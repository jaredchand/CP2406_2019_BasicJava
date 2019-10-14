package week7;

public class DemoPoems {
    public static void main(String[] args) {
        Couplet couplet = new Couplet("Couplet");
        Haiku haiku = new Haiku("Haiku");
        Limerick limerick = new Limerick("Limerick");
        System.out.println(couplet.getName() + " has " + couplet.getNumberLines() + " lines");
        System.out.println(haiku.getName() + " has " + haiku.getNumberLines() + " lines");
        System.out.println(limerick.getName() + " has " + limerick.getNumberLines() + " lines");
    }
}
