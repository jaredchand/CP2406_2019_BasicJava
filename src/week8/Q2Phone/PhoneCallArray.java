package week8.Q2Phone;

public class PhoneCallArray {
    public static void main(String[] args) {
        PhoneCall[] phoneCallArray = new PhoneCall[10];
        phoneCallArray[0] = new OutgoingPhoneCall("1234", 17);
        phoneCallArray[1] = new IncomingPhoneCall("999");
        phoneCallArray[2] = new IncomingPhoneCall("486");
        phoneCallArray[3] = new OutgoingPhoneCall("112", 57);
        phoneCallArray[4] = new IncomingPhoneCall("457");
        phoneCallArray[5] = new IncomingPhoneCall("465");
        phoneCallArray[6] = new OutgoingPhoneCall("209", 14);
        phoneCallArray[7] = new OutgoingPhoneCall("234", 58);
        phoneCallArray[8] = new IncomingPhoneCall("927");
        phoneCallArray[9] = new OutgoingPhoneCall("666", 66);
        for (int i=0; i<phoneCallArray.length; ++i){
            System.out.println("Phone call " + (i+1) + ": " + phoneCallArray[i].getCallInformation());
        }
    }
}
