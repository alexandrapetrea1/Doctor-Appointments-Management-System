package src.Model;

import java.time.LocalDateTime;

public class Appointment extends Identifiable {

    private LocalDateTime dateTime;
    private int patientID;
    private int doctorID;
    private String reason;

    public Appointment(LocalDateTime dateTime, int patientID, int doctorID, String reason) {
        this.id = this.generateId();
        this.dateTime = dateTime;
        this.patientID = patientID;
        this.doctorID = doctorID;
        this.reason = reason;
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

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }
}
