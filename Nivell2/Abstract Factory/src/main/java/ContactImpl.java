import Interfaces.Address;
import Interfaces.NameAndLastName;
import Interfaces.PhoneNumber;

public class ContactImpl extends Contact {
    public ContactImpl(NameAndLastName nameDetails, Address address, PhoneNumber phone) {
        super(nameDetails, address, phone);
    }
}
