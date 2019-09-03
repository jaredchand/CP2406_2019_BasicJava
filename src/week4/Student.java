package week4;

public class Student {
    private int studentID;
    private double creditHours;
    private int points;

    public Student() {
        studentID = 9999;
        creditHours = 3;
        points = 12;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setCreditHours(double creditHours) {
        this.creditHours = creditHours;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public double gpa() {
        return points/creditHours;
    }

    public int getStudentID() {
        return studentID;
    }

    public double getCreditHours() {
        return creditHours;
    }

    public int getPoints() {
        return points;
    }
}
