package week7;

public class Horse {
    private String name;
    private String colour;
    private int birthYear;

    Horse(String name, String colour, int birthYear){
        this.name = name;
        this.colour = colour;
        this.birthYear = birthYear;
    }
    void getHorseInformation(){
        System.out.println("The Horse " + name + " is " + colour + " and was born in " + birthYear);
    }
    String getName(){
        return name;
    }
    String getColour(){
        return colour;
    }
    int getBirthYear(){
        return birthYear;
    }
}