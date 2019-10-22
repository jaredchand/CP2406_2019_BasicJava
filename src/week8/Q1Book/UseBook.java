package week8.Q1Book;

public class UseBook {
    public static void main(String[] args) {
        Fiction fiction = new Fiction("Crime and Punishment");
        NonFiction nonFiction = new NonFiction("The art of war");
        System.out.println("Fiction book: \n" + fiction.getTitle() + " costs $" + fiction.getPrice());
        System.out.println("Nonfiction book: \n" + nonFiction.getTitle() + " costs $" + nonFiction.getPrice());
    }
}
