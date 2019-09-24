package week6;

import java.util.Scanner;

public class CarCareChoice2 {
    public static void main(String[] args) {
        String[] stringArray = {"oil change", "tyre rotation", "battery check", "brake inspection"};
        int[] intArray = {25, 22, 15, 5};
        int correctIndex = -1;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first 3 letters of a required service from the choices below: \n" + stringArray[0] + "\n" + stringArray[1] + "\n"+ stringArray[2] + "\n"+ stringArray[3] + "\n");
        String userInput = input.nextLine();
        String userSubstring;
        String substring;
        for (int i=0; i<stringArray.length; ++i){
            substring = stringArray[i].substring(0,3);
            userSubstring = userInput.substring(0,3);
            if (userSubstring.equals(substring)){
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