package week7;

public class DemoItemsAndPets {
    public static void main(String[] args) {
        ItemSold item1 = new ItemSold(1, "An item", 9);
        ItemSold item2 = new ItemSold(5, "Another item", 35);
        PetSold pet1 = new PetSold(2, "Dog", 60, true, false, true);
        PetSold pet2 = new PetSold(3, "Cat", 50, false, true, true);

        item1.setPrice(45);
        item2.setDescription("Yet another item");
        item1.setNumber(2);
        pet1.setNeutered(true);
        pet2.setHouseBroken(false);
        pet2.setVaccinated(true);
        pet1.setNumber(4);

        System.out.println("Item 1: ");
        System.out.println(item1.getNumber());
        System.out.println(item1.getDescription());
        System.out.println(item1.getPrice());

        System.out.println("Item 2: ");
        System.out.println(item2.getNumber());
        System.out.println(item2.getDescription());
        System.out.println(item2.getPrice());

        System.out.println("Pet 1: ");
        System.out.println(pet1.getNumber());
        System.out.println(pet1.getDescription());
        System.out.println(pet1.getPrice());
        System.out.println(pet1.getVaccinated());
        System.out.println(pet1.getNeutered());
        System.out.println(pet1.getHouseBroken());
        
        System.out.println("Pet 2: ");
        System.out.println(pet2.getNumber());
        System.out.println(pet2.getDescription());
        System.out.println(pet2.getPrice());
        System.out.println(pet2.getVaccinated());
        System.out.println(pet2.getNeutered());
        System.out.println(pet2.getHouseBroken());
    }
}
