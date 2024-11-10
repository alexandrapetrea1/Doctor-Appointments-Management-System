package src.Model;

import java.time.LocalDateTime;

public class Appointment extends Identifiable {

    private LocalDateTime dateTime;
    private src.Model.Patient patient;
    private Doctor doctor;
    private String reason;

    public Appointment(int appointmentID, LocalDateTime dateTime, src.Model.Patient patient, Doctor doctor, String reason) {
        this.setId(appointmentID);
        this.dateTime = dateTime;
        this.patient = patient;
        this.doctor = doctor;
        this.reason = reason;
    }


    public String getDateTime(){
        return this.dateTime.toString();
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public src.Model.Patient getPatient() {
        return patient;
    }

    public void setPatient(src.Model.Patient patient) {
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
        return "src.model.Appointment [ID: " + this.getId() + ", Date and Time : " + dateTime  +
                ", src.model.Patient: " + patient.getFirstName() + " " + patient.getLastName() +
                ", src.model.Doctor: " + doctor.getFirstName() + " " + doctor.getLastName() +
                ", Reason: " + reason + "]";
    }
}
