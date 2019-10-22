package week8;

class GraduateStudent extends Student{
    GraduateStudent(int id, String lastName){
        super(id, lastName);
        setAnnualTuition();
    }
    @Override
    void setAnnualTuition(){
        annualTuition = 6000;
    }
}
