package week8.Q3Divison;

class InternationalDivision extends Division {
    private String country;
    private String language;
    InternationalDivision(String divisionName, int accountNumber, String country, String language){
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }
    @Override
    void display() {
        System.out.println("This international division is called " + super.getDivisionName() + " its account number " +
                "is " + super.getAccountNumber() + " it is located in " + country + " and the language spoken " +
                "is " + language);
    }
}
