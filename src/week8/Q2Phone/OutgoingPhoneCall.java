package week8.Q2Phone;

class OutgoingPhoneCall extends PhoneCall {
    private double callLength;
    OutgoingPhoneCall(String phoneNumber, double callLength){
        super(phoneNumber);
        this.callLength = callLength;
        super.setCallPrice(0.04);
    }
    @Override
    String getPhoneNumber() {
        return phoneNumber;
    }
    @Override
    double getCallPrice() {
        return callPrice;
    }
    @Override
    String getCallInformation() {
        return "Phone number: " + getPhoneNumber() + ", rate: $" + getCallPrice() + " per minute, number of minutes: " + callLength +
                ", call price: $" + getCallPrice()*callLength;
    }
}
