package src;

import src.Controller.Controller;
import src.Model.*;
import src.Repository.InMemoryRepository;
import src.Service.Service;
import src.UI.AdminUI;
import src.UI.DoctorUI;
import src.UI.MainUI;
import src.UI.PatientUI;

public class Main {
    public static void main(String[] args) {
        InMemoryRepository<Appointment> appointmentInMemoryRepository = new InMemoryRepository<>();
        InMemoryRepository<Clinic> clinicInMemoryRepository = new InMemoryRepository<>();
        InMemoryRepository<Doctor> doctorInMemoryRepository = new InMemoryRepository<>();
        InMemoryRepository<Patient> patientInMemoryRepository = new InMemoryRepository<>();
        InMemoryRepository<Medication> medicationInMemoryRepository = new InMemoryRepository<>();
        InMemoryRepository<Specialization> specializationInMemoryRepository = new InMemoryRepository<>();
        Service service = new Service(appointmentInMemoryRepository, doctorInMemoryRepository, patientInMemoryRepository, clinicInMemoryRepository, medicationInMemoryRepository, specializationInMemoryRepository);
        Controller controller = new Controller(service);
        DoctorUI doctorUI = new DoctorUI(controller);
        AdminUI adminUI = new AdminUI(controller);
        PatientUI patientUI = new PatientUI(controller);
        MainUI mainUI = new MainUI(controller, adminUI, doctorUI, patientUI);

        mainUI.start();
    }
}
