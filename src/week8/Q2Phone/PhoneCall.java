package week8.Q2Phone;

abstract class PhoneCall {
    String phoneNumber;
    double callPrice;
    PhoneCall(String phoneNumber){
        this.phoneNumber = phoneNumber;
        callPrice = 0.0;
    }
    void setCallPrice(double callPrice) {
        this.callPrice = callPrice;
    }
    abstract  String getPhoneNumber();
    abstract  double getCallPrice();
    abstract  String getCallInformation();
}
