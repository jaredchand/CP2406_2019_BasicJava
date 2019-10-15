package week8;

import java.util.Scanner;

public class BookArray<args> {
    public static void main(String[] args) {
        Book[] bookArray = new Book[10];
        System.out.println("Add books to the array of books");
        Scanner input = new Scanner(System.in);
        String userChoice;
        String bookTitle;
        for (int i=0; i<bookArray.length; ++i){
            System.out.println("What is the new books title? ");
            bookTitle = input.nextLine();
            System.out.println("Is the new book: \nf - fiction \nn - non fiction");
            userChoice = input.nextLine();
            if (userChoice.equals("f")){
                bookArray[i] = new Fiction(bookTitle);
            } else if (userChoice.equals("n")) {
                bookArray[i] = new NonFiction(bookTitle);
            }
        }
        for (int i=0; i<bookArray.length; ++i) {
            System.out.println("Book " + (i + 1) + ": ");
            System.out.println(bookArray[i].getTitle());
            System.out.println("Costs $" + bookArray[i].getPrice());
        }
    }

}
