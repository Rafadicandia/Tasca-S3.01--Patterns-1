import Interfaces.Address;
import Interfaces.PhoneNumber;
import Interfaces.NameAndLastName;
import Interfaces.Contact;

public class Contact implements Contact {
    private NameAndLastName nameDetails;
    private Address address;
    private PhoneNumber phone;


    public Contact(NameAndLastName nameDetails, Address address, PhoneNumber phone) {
        this.nameDetails = nameDetails;
        this.address = address;
        this.phone = phone;
    }


    public String getContactDetails() {
        return nameDetails.getFullName() +
                "\n  Dirección: " + address.getAddress() +
                "\n  Teléfono: " + phone.getPhoneNumber();
    }
}