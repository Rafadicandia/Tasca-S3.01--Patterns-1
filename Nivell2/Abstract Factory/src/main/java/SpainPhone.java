public abstract class SpainPhone implements PhoneNumber{
    @Override
    public String getPhoneNumber(String phone) {
        return "+34 "+phone;
    }
}
