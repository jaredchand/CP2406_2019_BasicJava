package week8.Q8Student;

class UndergraduateStudent extends Student{
    UndergraduateStudent(int id, String lastName){
        super(id, lastName);
        setAnnualTuition();
    }

    @Override
    void setAnnualTuition() {
        annualTuition = 4000;
    }
}
