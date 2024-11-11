package src.Model;

import java.util.ArrayList;
import java.util.List;


public class Patient extends src.Model.Person {
    private ContactInfo contactInfo;
    private List<Appointment> appointments;
    private List<Medication> medications;

    public Patient(String firstName, String lastName, ContactInfo contactInfo) {
        super(firstName, lastName);
        this.id = this.generateId();
        this.contactInfo = contactInfo;
        this.appointments = new ArrayList<>();
        this.medications = new ArrayList<>();
    }

    public ContactInfo getContactInfo(){
        return this.contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public void removeAppointment(Appointment appointment) {
        appointments.remove(appointment);
    }
    public void addAppointment(Appointment appointment) { appointments.add(appointment); }

    public void addMedication(Medication medication) { this.medications.add(medication); }
    public void removeMedication(Medication medication) {this.medications.remove(medication); }



}
