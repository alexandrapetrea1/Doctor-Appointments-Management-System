import java.time.LocalDateTime;

public class Appointment {

    private int appointmentID;
    private LocalDateTime dateTime;
    private Patient patient;
    private Doctor doctor;
    private String reason;

    public Appointment(int appointmentID, LocalDateTime dateTime, Patient patient, Doctor doctor, String reason) {
        this.appointmentID = appointmentID;
        this.dateTime = dateTime;
        this.patient = patient;
        this.doctor = doctor;
        this.reason = reason;
    }

    public int getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }

    public String getDateTime(){
        return this.dateTime.toString();
    }

    public void setDateTime(String date) {
        this.dateTime = dateTime;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getReason(){
        return this.reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "Appointment [ID: " + appointmentID + ", Date and Time : " + dateTime  +
                ", Patient: " + patient.getFirstName() + " " + patient.getLastName() +
                ", Doctor: " + doctor.getFirstName() + " " + doctor.getLastName() +
                ", Reason: " + reason + "]";
    }
}
