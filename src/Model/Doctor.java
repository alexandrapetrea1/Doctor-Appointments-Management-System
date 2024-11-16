package src.Model;

import java.util.ArrayList;
import java.util.List;

public class Doctor extends src.Model.Person {
    private  Specialization specialization;
    private List<Appointment> appointments;
    private List<Clinic> clinics;


    @Override
    public String toString() {
        return "Doctor{" +
                "specialization=" + specialization +
                ", appointments=" + appointments +
                ", clinics=" + clinics +
                ", id=" + id +
                '}';
    }

    public Doctor(String firstName, String lastName, Specialization specialization) {
        super(firstName, lastName);
        this.id = this.generateId();
        this.specialization = specialization;
        this.appointments = new ArrayList<>();
        this.clinics = new ArrayList<>();
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }

    public List<Clinic> getClinics() {
        return clinics;
    }

    public void setClinics(List<Clinic> clinics) {
        this.clinics = clinics;
    }
}
