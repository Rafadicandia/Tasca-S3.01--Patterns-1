import Interfaces.*;

public class Client {
    private ContactFactory factory;
    private Address address;
    private PhoneNumber phone;
    private NameAndLastName name;
    private Contact contact;

    public Client(ContactFactory factory) {
        this.factory = factory;
        this.address = factory.createAddress();
        this.phone = factory.createPhoneNumber();
        this.name = factory.createFullName();
        this.contact = factory.createContact();

    }
}
