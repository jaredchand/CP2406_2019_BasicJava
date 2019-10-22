package week8.Q3Divison;

class DomesticDivision extends Division {
    private String state;
    DomesticDivision(String divisionName, int accountNumber, String state){
        super(divisionName, accountNumber);
        this.state = state;
    }
    @Override
    void display() {
        System.out.println("This domestic division is called " + super.getDivisionName() + " its account number " +
                "is " + super.getAccountNumber() + " it is located in " + state);
    }
}
