package week8;

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
