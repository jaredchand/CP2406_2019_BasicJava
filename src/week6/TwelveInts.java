package week6;

import java.util.Scanner;

public class TwelveInts {
    public static void main(String[] args) {
        int[] integers = new int[12];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < integers.length; i++) {
            System.out.println("Please enter a number: ");
            integers[i] = scanner.nextInt();
        }
        for (int integer :integers) System.out.println(integer + " ");

        for (int i =(integers.length-1); i>=0; i--)
            System.out.println(integers[i] + " ");
    }
}
