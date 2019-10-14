package week7;

public class LabCourse extends CollegeCourse {
    LabCourse(String department, int courseNumber, int credits){
        super(department, courseNumber, credits);
        super.additionalCost(50);
    }
    @Override
    void display(){
        System.out.println("The is a lab course and is in the department " + super.getDepartment() +
                " its course number is " + super.getCourseNumber() + " it gives " + super.getCredits() +
                " college credits and costs $" + super.getCost());
    }
}
