package week8.Q8Student;

public class StudentDemo {
    public static void main(String[] args) {
        Student[] studentArray = new Student[6];
        studentArray[0] = new UndergraduateStudent(50, "Clinton");
        studentArray[1] = new GraduateStudent(5, "De Santa");
        studentArray[2] = new StudentAtLarge(21, "Philips");
        studentArray[3] = new GraduateStudent(10, "Peralta");
        studentArray[4] = new UndergraduateStudent(30, "Santiago");
        studentArray[5] = new StudentAtLarge(99, "Holt");
        for (Student student : studentArray) {
            System.out.println("The students id is " + student.getId() + ", their last name is " + student.getLastName()
                    + " and their tuition costs $" + student.getAnnualTuition() + " per semester");
        }
    }
}
