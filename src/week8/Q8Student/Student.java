package week8.Q8Student;

abstract class Student {
    private int id;
    private String lastName;
    int annualTuition;
    Student(int id, String lastName){
        this.id = id;
        this.lastName =lastName;
    }
    int getId(){
        return id;
    }
    String getLastName(){
        return lastName;
    }
    int getAnnualTuition(){
        return annualTuition;
    }
    void setId(int id){
        this.id = id;
    }
    void setLastName(String lastName){
        this.lastName = lastName;
    }
    abstract void setAnnualTuition();
}
