import java.util.ArrayList;
import java.util.List;


public class Patient extends Person {
    private int patientID;
    private ContactInfo contactInfo;
    private List<Appointment> appointments;
    private List<Medication> medications;

    public Patient(String firstName, String lastName, int patientID, ContactInfo contactInfo) {
        super(firstName, lastName);
        this.patientID = patientID;
        this.contactInfo = contactInfo;
        this.appointments = new ArrayList<>();
    }

    public int getPatientID(){
        return this.patientID;
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
    public List<Medication> getMedications() {
        return medications;
    }

    public void setMedications(List<Medication> medications) {
        this.medications = medications;
    }


    @Override
    public String toString() {
        return "Patient [ID: " + patientID + ", Contact Info: " + contactInfo +
                ", Appointments: " + appointments + ", Medications: " + medications + "]";
    }

}
