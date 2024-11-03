import java.util.ArrayList;
import java.util.List;

public class Doctor extends Person {
    private int doctorID;
    private Specialization specialization;
    private int workingHours;
    private List<Appointment> appointments;

    public Doctor(String firstName, String lastName, int doctorID, Specialization specialization, String workingHours) {
        super(firstName, lastName);
        this.doctorID = doctorID;
        this.specialization = specialization;
        this.appointments = new ArrayList<>();
    }

    public Specialization getSpecialization(){
        return this.specialization;
    }

    public void setSpecialization(Specialization specialization){
        this.specialization = specialization;
    }
    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours){
        this.workingHours = workingHours;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }

    @Override
    public String toString() {
        return "Doctor [ID: " + doctorID + ", Name: " + getFirstName() + " " + getLastName() +
                ", Specialization: " + specialization + ", Working Hours: " + workingHours +
                ", Appointments: " + appointments + "]";
    }
}
