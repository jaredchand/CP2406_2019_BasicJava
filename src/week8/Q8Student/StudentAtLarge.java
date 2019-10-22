package week8.Q8Student;

class StudentAtLarge extends Student {
    StudentAtLarge(int id, String lastName){
        super(id, lastName);
        setAnnualTuition();
    }
    @Override
    void setAnnualTuition(){
        annualTuition = 2000;
    }
}
