import Interfaces.ContactFactory;

public class Contact implements Interfaces.Contact {
    private String name;
    private String lastName;

    public Contact(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String getContact() {
        return "Name: "+name+
                "Lastname: "+lastName;
    }
}
