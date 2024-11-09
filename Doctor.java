import java.util.ArrayList;
import java.util.List;

public class Doctor extends Person {
    private int doctorID;
    private List<Specialization> specializations;
    private int workingHours;
    private List<Appointment> appointments;

    public Doctor(String firstName, String lastName, int doctorID, List<Specialization> specializations, String workingHours) {
        super(firstName, lastName);
        this.doctorID = doctorID;
        this.specializations = specializations;
        this.appointments = new ArrayList<>();
    }

    public List<Specialization> getSpecializations(){
        return this.specializations;
    }

    public void setSpecialization(List<Specialization> specializations){
        this.specializations = specializations;
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
                ", Specializations: " + specializations + ", Working Hours: " + workingHours +
                ", Appointments: " + appointments + "]";
    }
}
