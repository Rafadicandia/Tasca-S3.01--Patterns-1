public class SpainPhone implements PhoneNumber {
    private String number;

    public SpainPhone(String number) {
        this.number = number;

    }

    @Override
    public String getPhoneNumber() {
        return "+34 " + number;
    }
}
