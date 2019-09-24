package week6;

import java.util.Scanner;

public class CarCareChoice {
    public static void main(String[] args) {
        String[] stringArray = {"oil change", "tyre rotation", "battery check", "brake inspection"};
        int[] intArray = {25, 22, 15, 5};
        int correctIndex = -1;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter one of the following strings to choose: \n" + stringArray[0] + "\n" + stringArray[1] + "\n"+ stringArray[2] + "\n"+ stringArray[3] + "\n" + ">>>");
        String userInput = input.nextLine();

        for (int i=0; i<stringArray.length; ++i){
            if (userInput.equals(stringArray[i])){
                correctIndex = i;
            }
        }
        if (correctIndex >= 0){
            System.out.println("You have selected " + stringArray[correctIndex] + " which costs $" + intArray[correctIndex]);
        } else {
            System.out.println("Invalid item");
        }
    }
}