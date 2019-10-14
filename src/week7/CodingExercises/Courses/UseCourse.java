package week7;

import java.util.Scanner;

public class UseCourse {
    public static void main(String[] args) {
        boolean enteredInformation = false; // variable to control whether user has entered all data and is valid
        String department = "";
        int courseNumber = 0, credits = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter information about the course");
        while (!enteredInformation){
            System.out.println("What department does the course belong to?");
            department = input.nextLine();
            System.out.println("What is the course's course number?");
            courseNumber = input.nextInt();
            System.out.println("How many credits does the course award?");
            credits = input.nextInt();
            if (courseNumber > 0 && credits > 0 && credits <= 6 && !department.equals("")){ // check if the entered information is valid - assume that a courses credits may vary from 1 to 6 for example (this can be changed to fit restrictions)
                enteredInformation = true;
            } else {
                System.out.println("The entered information is invalid, please try again:");
            }
        }
        department = department.toUpperCase();
        if (department.equals("BIO") || department.equals("CHM") || department.equals("CIS") || department.equals("PHY")){
            LabCourse labCourse = new LabCourse(department, courseNumber, credits);
            labCourse.display();
        } else {
            CollegeCourse collegeCourse = new CollegeCourse(department, courseNumber, credits);
            collegeCourse.display();
        }
    }
}
