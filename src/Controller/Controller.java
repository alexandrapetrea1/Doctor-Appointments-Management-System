package src.Controller;

import src.Model.Appointment;
import src.Model.Clinic;
import src.Model.Doctor;
import src.Service.Service;

import java.util.List;

public class Controller {
    private final Service service;
    public Controller(Service service) {
        this.service = service;
    }

    public Service getService() {
        return service;
    }


    public void addClinic(Clinic clinic) {
        service.addClinic(clinic);
    }

    public void addDoctor(Doctor doctor) {
        service.addDoctor(doctor);
    }

    public Clinic searchClinicById(int id) {
        return service.getClinicById(id);
    }

    public Doctor getDoctorById(int id) {
        return service.getDoctorById(id);
    }

    public List<Appointment> getAppointmentsFromDoctor(Doctor doctor) {
        List<Appointment> appointments = new java.util.ArrayList<>(service.getAppointments().values().stream().toList());
        appointments.removeIf(appointment -> !appointment.getDoctor().equals(doctor));
        return appointments;
    }

    public List<Doctor> getAllDoctors(){
        return service.getDoctors().values().stream().toList();
    }

    public void createAppointment() {}
}
