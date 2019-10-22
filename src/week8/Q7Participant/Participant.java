package week8.Q7Participant;

public class Participant {
    private String name;
    private int age;
    private String streetAddress;
    Participant(String name, int age, String streetAddress){
        this.name = name;
        this.age = age;
        this.streetAddress = streetAddress;
    }
    public String toString(){
        return "Participants name is " + name + ", their age is " + age + " and their address is " + streetAddress;
    }
    boolean equal(Participant participant1, Participant participant2){
        return participant1.name.equals(participant2.name) && participant1.age == participant2.age &&
                participant1.streetAddress.equals(participant2.streetAddress);
    }
}
