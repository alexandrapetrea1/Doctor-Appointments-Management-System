package src;

import src.Controller.Controller;
import src.Model.*;
import src.Repository.InMemoryRepository;
import src.Service.Service;
import src.UI.AdminUI;
import src.UI.DoctorUI;
import src.UI.MainUI;
import src.UI.PatientUI;
import src.Repository.FileRepository;

public class Main {
    public static void main(String[] args) {
//        InMemoryRepository<Appointment> appointmentInMemoryRepository = new InMemoryRepository<>();
//        InMemoryRepository<Clinic> clinicInMemoryRepository = new InMemoryRepository<>();
//        InMemoryRepository<Doctor> doctorInMemoryRepository = new InMemoryRepository<>();
//        InMemoryRepository<Patient> patientInMemoryRepository = new InMemoryRepository<>();
//        InMemoryRepository<Medication> medicationInMemoryRepository = new InMemoryRepository<>();
//        InMemoryRepository<Specialization> specializationInMemoryRepository = new InMemoryRepository<>();
//        Service service = new Service(appointmentInMemoryRepository, doctorInMemoryRepository, patientInMemoryRepository, clinicInMemoryRepository, medicationInMemoryRepository, specializationInMemoryRepository);
//        Controller controller = new Controller(service);
//        DoctorUI doctorUI = new DoctorUI(controller);
//        AdminUI adminUI = new AdminUI(controller);
//        PatientUI patientUI = new PatientUI(controller);
//        MainUI mainUI = new MainUI(controller, adminUI, doctorUI, patientUI);
//        mainUI.start();

        FileRepository<Appointment> appointmentFileRepository = new FileRepository<>("src/Files/Appointment.txt");
        FileRepository<Clinic> clinicFileRepository = new FileRepository<>("src/Files/Clinic.txt");
        FileRepository<Doctor> doctorFileRepository = new FileRepository<>("src/Files/Doctor.txt");
        FileRepository<Patient> patientFileRepository = new FileRepository<>("src/Files/Patient.txt");
        FileRepository<Medication> medicationFileRepository = new FileRepository<>("src/Files/Medication.txt");
        FileRepository<Specialization> specializationFileRepository= new FileRepository<>("src/Files/Specialization.txt");

        Service service1 = new Service(appointmentFileRepository, doctorFileRepository, patientFileRepository, clinicFileRepository, medicationFileRepository, specializationFileRepository);
        Controller controller = new Controller(service1);
        DoctorUI doctorUI = new DoctorUI(controller);
        AdminUI adminUI = new AdminUI(controller);
        PatientUI patientUI = new PatientUI(controller);
        MainUI mainUI = new MainUI(controller, adminUI, doctorUI, patientUI);
        mainUI.start();
    }
}
