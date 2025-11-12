import Interfaces.Address;
import Interfaces.NameAndLastName;
import Interfaces.ContactFactory;
import Interfaces.PhoneNumber;

public class Client {
    private ContactFactory factory;
    private Address address;
    private PhoneNumber phone;
    private NameAndLastName name;

    public Client(ContactFactory factory) {
        this.factory = factory;
        this.address = factory.createAddress();
        this.phone = factory.createPhoneNumber();
        this.name = factory.createContact();

    }
}
