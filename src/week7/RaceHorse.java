package week7;

public class RaceHorse extends Horse{
    private int numRaces;
    RaceHorse(String name, String colour, int birthYear, int numRaces){
        super(name, colour, birthYear);
        this.numRaces = numRaces;
    }
    int getNumRaces(){
        return numRaces;
    }
    void getRaceHorseInformation(){
        System.out.println("The Race Horse " + super.getName() + " is " + super.getColour() + " and was born in " + super.getBirthYear()
                + " and has been in " + numRaces + " races");
    }
}
