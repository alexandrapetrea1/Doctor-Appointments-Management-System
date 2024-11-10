package src.Model;

import java.util.ArrayList;
import java.util.List;


public class Patient extends src.Model.Person {
    private ContactInfo contactInfo;
    private List<Appointment> appointments;
    private List<src.Model.Medication> medications;

    public Patient(String firstName, String lastName, int patientID, ContactInfo contactInfo) {
        super(firstName, lastName);
        this.setId(patientID);
        this.contactInfo = contactInfo;
        this.appointments = new ArrayList<>();
    }

    public ContactInfo getContactInfo(){
        return this.contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void removeAppointment(Appointment appointment) {
        appointments.remove(appointment);
    }
    public List<src.Model.Medication> getMedications() {
        return medications;
    }

    public void setMedications(List<src.Model.Medication> medications) {
        this.medications = medications;
    }


    @Override
    public String toString() {
        return "src.model.Patient [ID: " + this.getId() + ", Contact Info: " + contactInfo +
                ", Appointments: " + appointments + ", Medications: " + medications + "]";
    }

}
