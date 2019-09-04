package week5;

import java.util.Scanner;

public class AscendingDescending {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print(">>> Enter first number: ");
            int num1 = input.nextInt();

            System.out.print(">>> Enter second number: ");
            int num2 = input.nextInt();

            System.out.print(">>> Enter third number: ");
            int num3 = input.nextInt();

            if (num1 >= num2 && num1 >= num3){
                if (num2 > num3) {
                    System.out.println(num1 + "\n" + num2 + "\n" + num3);
                } else {
                    System.out.println(num1 + "\n" + num3 + "\n" + num2);
                }
            } else if (num2 >= num1 && num2 >= num3) {
                if (num1 > num3){
                    System.out.println(num2 + "\n" + num1 + "\n" + num3);
                } else {
                    System.out.println(num2 + "\n" + num3 + "\n" + num1);
                }
            } else if (num3 >= num1 && num3 >= num2){
                if (num2 > num3){
                    System.out.println(num3 + "\n" + num2 + "\n" + num1);
                } else {
                    System.out.println(num3 + "\n" + num1 + "\n" + num2);
                }
            }
        }
    }