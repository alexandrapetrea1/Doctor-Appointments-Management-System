package src.Model;

import java.util.ArrayList;
import java.util.List;


public class Patient extends src.Model.Person {
    private ContactInfo contactInfo;
    private List<Integer> appointmentIDs;
    private List<Integer> medicationIDs;

    public Patient(String firstName, String lastName, ContactInfo contactInfo) {
        super(firstName, lastName);
        this.id = this.generateId();
        this.contactInfo = contactInfo;
        this.appointmentIDs = new ArrayList<>();
    }

    public ContactInfo getContactInfo(){
        return this.contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public List<Integer> getAppointments() {
        return appointmentIDs;
    }

    public void removeAppointment(Integer appointment) {
        appointmentIDs.remove(appointment);
    }
    public List<Integer> getMedications() {
        return medicationIDs;
    }

    public void setMedications(List<Integer> medicationIDs) {
        this.medicationIDs = medicationIDs;
    }


    @Override
    public String toString() {
        return "src.model.Patient [ID: " + this.getId() + ", Contact Info: " + contactInfo +
                ", Appointments: " + appointmentIDs + ", Medications: " + medicationIDs + "]";
    }

}
