package src.Model;

import java.time.LocalDateTime;

public class Appointment extends Identifiable {

    private LocalDateTime dateTime;
    private Patient patient;
    private Doctor doctor;
    private String reason;


    public Appointment(LocalDateTime dateTime, Patient patient, Doctor doctor, String reason) {
        super();
        this.dateTime = dateTime;
        this.patient = patient;
        this.doctor = doctor;
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "Appointment.txt{" +
                "dateTime=" + dateTime +
                ", patient=" + patient +
                ", doctor=" + doctor +
                ", reason='" + reason + '\'' +
                '}';
    }

    public String getDateTime(){
        return this.dateTime.toString();
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }


    public String getReason(){
        return this.reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
