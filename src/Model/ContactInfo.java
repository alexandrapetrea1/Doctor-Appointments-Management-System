package src.Model;

import java.io.Serializable;

public class ContactInfo implements Serializable {
    private String phoneNumber;
    private String email;
    private String address;


    public ContactInfo(String phoneNumber, String email, String address) {
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Phone: " + phoneNumber + " | Email: " + email + " | Address: " + address;
    }
}
