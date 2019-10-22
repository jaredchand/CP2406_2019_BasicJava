package week8.Q2Phone;

public class DemoPhoneCalls {
    public static void main(String[] args) {
        IncomingPhoneCall incomingPhoneCall = new IncomingPhoneCall("000");
        OutgoingPhoneCall outgoingPhoneCall = new OutgoingPhoneCall("911", 10);
        System.out.println("Incoming call: \n" + incomingPhoneCall.getCallInformation());
        System.out.println("Outgoing call: \n" + outgoingPhoneCall.getCallInformation());
    }
}
