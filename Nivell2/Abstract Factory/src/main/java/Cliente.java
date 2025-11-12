import Interfaces.Address;
import Interfaces.ContactFactory;
import Interfaces.PhoneNumber;

public class Cliente {
    private ContactFactory factory;
    private Address address;
    private PhoneNumber phone;

    public Cliente(ContactFactory factory) {
        this.factory = factory;
        this.address = factory.createAddress();
        this.phone = factory.createPhoneNumber();

    }
}
