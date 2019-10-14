package week7;

public class DemoHorse {
    public static void main(String[] args) {
        Horse horse = new Horse("Mr. Wick", "Rainbow", 2010);
        horse.getHorseInformation();

        RaceHorse raceHorse = new RaceHorse("Thor", "Black", 1354, 200);
        raceHorse.getRaceHorseInformation();
    }
}
