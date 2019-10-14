package week7;

public class UsePackage {
    public static void main(String[] args) {
        Package package1 = new Package(5, 'T');
        Package package2 = new Package(30, 'A');
        Package package3 = new Package(11, 'M');
        System.out.println("Packages example: \n");
        package1.display();
        package2.display();
        package3.display();
        InsuredPackage insuredPackage1 = new InsuredPackage(15,'T');
        InsuredPackage insuredPackage2 = new InsuredPackage(42,'A');
        InsuredPackage insuredPackage3 = new InsuredPackage(2,'M');
        System.out.println("\nInsured packages example: \n");
        insuredPackage1.display();
        System.out.println();
        insuredPackage2.display();
        System.out.println();
        insuredPackage3.display();
    }
}
