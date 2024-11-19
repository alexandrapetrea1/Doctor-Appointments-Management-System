package src.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Patient extends Person  {
    private ContactInfo contactInfo;


    public Patient(String firstName, String lastName, ContactInfo contactInfo) {
        super(firstName, lastName);
        this.contactInfo = contactInfo;
    }

    public ContactInfo getContactInfo(){
        return this.contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }



    @Override
    public String toString() {
        return "Patient: " +
                " First name: " + this.getFirstName() +
                " | Last name: " + getLastName()
                + contactInfo +
                " | id: " + id;
    }
}
