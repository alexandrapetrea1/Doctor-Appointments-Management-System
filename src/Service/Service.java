package src.Service;

import src.Model.*;
import src.Repository.InMemoryRepository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Service {
    private final InMemoryRepository<Appointment> appointmentRepository;
    private final InMemoryRepository<Doctor> doctorRepository;
    private final InMemoryRepository<Patient> patientRepository;
    private final InMemoryRepository<Clinic> clinicRepository;
    private final InMemoryRepository<Medication> medicationRepository;
    private final InMemoryRepository<Specialization> specializationRepository;

    public Service(InMemoryRepository<Appointment> appointmentRepository, InMemoryRepository<Doctor> doctorRepository, InMemoryRepository<Patient> patientRepository, InMemoryRepository<Clinic> clinicRepository, InMemoryRepository<Medication> medicationRepository, InMemoryRepository<Specialization> specializationRepository) {
        this.appointmentRepository = appointmentRepository;
        this.doctorRepository = doctorRepository;
        this.patientRepository = patientRepository;
        this.clinicRepository = clinicRepository;
        this.medicationRepository = medicationRepository;
        this.specializationRepository = specializationRepository;
        addSomeValues();
    }

    public void addAppointment(String date, int patientID, int doctorID, String reason){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(date, formatter);
        appointmentRepository.create(new Appointment(dateTime, patientID, doctorID, reason));
    }

    public void addDoctor(String firstName, String lastName, List<Integer> specializations){
        doctorRepository.create(new Doctor(firstName, lastName, specializations));
    }

    public void addPatient(String firstName, String lastName, List<Integer> specializations, String phoneNumber, String email, String address){
        patientRepository.create(new Patient(firstName, lastName, new ContactInfo(phoneNumber, email, address)));
    }

    public void addClinic(List<Integer> doctorIDs, String address){
        clinicRepository.create(new Clinic(doctorIDs, address));
    }

    public void addSpecizlization(String name, String description){
        specializationRepository.create(new Specialization(name, description));
    }

    public void addMedication(String name, String dosage){
        medicationRepository.create(new Medication(name, dosage));
    }


    private void addSomeValues(){

    }
}
