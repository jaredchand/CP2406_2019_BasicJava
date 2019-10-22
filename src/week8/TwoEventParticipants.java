package week8;

import java.util.Scanner;

public class TwoEventParticipants {
    public static void main(String[] args) {
        Participant[] miniMarathon = new Participant[8];
        Participant[] divingCompetition = new Participant[9];
        Scanner input = new Scanner(System.in);
        String name;
        int age;
        String address;
        System.out.println("Enter mini marathon participant information: ");
        for(int i=0; i<miniMarathon.length; ++i){
            System.out.println("Participants name: ");
            name = input.nextLine();
            System.out.println("Age: ");
            age = input.nextInt();
            System.out.println("Address: ");
            input.nextLine();
            address = input.nextLine();
            System.out.println();
            miniMarathon[i] = new Participant(name, age, address);
        }
        System.out.println("Enter diving competition participant information: ");
        for(int i=0; i<divingCompetition.length; ++i){
            System.out.println("Participants name: ");
            name = input.nextLine();
            System.out.println("Age: ");
            age = input.nextInt();
            System.out.println("Address: ");
            input.nextLine();
            address = input.nextLine();
            divingCompetition[i] = new Participant(name, age, address);
        }
        System.out.println("The participants competing in both events are: ");
        for (Participant miniParticipant : miniMarathon) {
            for (Participant divingParticipant : divingCompetition) {
                if (divingParticipant.equal(miniParticipant, divingParticipant)) {
                    System.out.println(divingParticipant.toString());
                }
            }
        }
    }
}
