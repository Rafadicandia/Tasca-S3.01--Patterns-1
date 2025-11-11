public abstract class SpainAddres implements Address, PhoneNumber {
    @Override
    public String getAddress(String address) {
        return "";
    }

    @Override
    public String getPhoneNumber(String phone) {
        return "+34 "+phone;
    }
}
