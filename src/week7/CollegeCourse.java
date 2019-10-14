package week7;

public class CollegeCourse {
    private String department;
    private int courseNumber;
    private int credits;
    private int cost;
    CollegeCourse(String department, int courseNumber, int credits){
        this.department = department;
        this.courseNumber = courseNumber;
        this.credits = credits;
        calculateCost();
    }
    private void calculateCost(){
        cost = 120 * credits;
    }
    void additionalCost(int additionalCost){
        cost += additionalCost;
    }
    void display(){
        System.out.println("The course is in the department " + department + " its course number is " + courseNumber +
                " it gives " + credits + " college credits and costs $" + cost);
    }
    String getDepartment(){
        return department;
    }
    int getCourseNumber(){
        return courseNumber;
    }
    int getCredits(){
        return credits;
    }
    int getCost(){
        return cost;
    }
}
