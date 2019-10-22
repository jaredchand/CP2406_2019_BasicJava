package week8.Q2Phone;

class IncomingPhoneCall extends PhoneCall {
    IncomingPhoneCall(String phoneNumber){
        super(phoneNumber);
        super.setCallPrice(0.02);
    }

    @Override
    String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    double getCallPrice() {
        return super.callPrice;
    }

    @Override
    String getCallInformation() {
        return "Phone number: " + getPhoneNumber() + ", rate: $" + getCallPrice() + " per minute, call price: $" + getCallPrice();
    }
}
