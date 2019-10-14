package week7;

public class Poem {
    private String name;
    private int numberLines;
    Poem(String name, int numberLines){
        this.name = name;
        this.numberLines = numberLines;
    }
    String getName(){
        return name;
    }
    int getNumberLines(){
        return numberLines;
    }
}
