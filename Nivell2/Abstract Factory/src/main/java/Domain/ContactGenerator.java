package Domain;
import Interfaces.Address;
import Interfaces.PhoneNumber;
import Interfaces.NameAndLastName;



public class ContactGenerator implements Interfaces.Contact{
    private NameAndLastName nameDetails;
    private Address address;
    private PhoneNumber phone;


    public ContactGenerator(NameAndLastName nameDetails, Address address, PhoneNumber phone) {
        this.nameDetails = nameDetails;
        this.address = address;
        this.phone = phone;
    }


    public String getContactDetails() {
        return nameDetails.getFullName() +
                "\n  Direction: " + address.getAddress() +
                "\n  Phone: " + phone.getPhoneNumber();
    }
}