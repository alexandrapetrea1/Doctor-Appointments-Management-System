package src.Model;

import java.util.ArrayList;
import java.util.List;

public class Doctor extends src.Model.Person {
    private List<src.Model.Specialization> specializations;
    private int workingHours;
    private List<Appointment> appointments;

    public Doctor(String firstName, String lastName, int doctorID, List<src.Model.Specialization> specializations, String workingHours) {
        super(firstName, lastName);
        this.setId(doctorID);
        this.specializations = specializations;
        this.appointments = new ArrayList<>();
    }

    public List<src.Model.Specialization> getSpecializations(){
        return this.specializations;
    }

    public void setSpecialization(List<src.Model.Specialization> specializations){
        this.specializations = specializations;
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
        return "src.model.Doctor [ID: " + this.getId() + ", Name: " + getFirstName() + " " + getLastName() +
                ", Specializations: " + specializations + ", Working Hours: " + workingHours +
                ", Appointments: " + appointments + "]";
    }
}
