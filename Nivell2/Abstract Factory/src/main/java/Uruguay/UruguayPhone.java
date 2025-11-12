package Uruguay;

import Interfaces.PhoneNumber;

public class UruguayPhone implements PhoneNumber {
    private String number;

    public UruguayPhone(String number) {
        this.number = number;

    }

    @Override
    public String getPhoneNumber() {
        return "+598 " + this.number;
    }
}
