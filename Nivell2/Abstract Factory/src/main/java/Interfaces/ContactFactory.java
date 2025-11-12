package Interfaces;

public interface ContactFactory {
    public Address createAddress();
    public PhoneNumber createPhoneNumber();
    public NameAndLastName createContact();
}
