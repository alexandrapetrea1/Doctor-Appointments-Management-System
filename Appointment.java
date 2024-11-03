public class Appointment {
    private String date;
    private int appointmentID;
    private String time;
    private Patient patient;
    private String reason;

    public Appointment(int appointmentID, String date, String time, Patient patient, String reason) {
        this.appointmentID = appointmentID;
        this.date = date;
        this.time = time;
        this.patient = patient;
        //this.doctor = doctor;
        this.reason = reason;
    }

    public int getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }

    public String getDate(){
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime(){
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
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
        return "Appointment [ID: " + appointmentID + ", Date: " + date + ", Time: " + time +
                ", Patient: " + patient.getFirstName() + " " + patient.getLastName() +
                ", Reason: " + reason + "]";
    }
}
