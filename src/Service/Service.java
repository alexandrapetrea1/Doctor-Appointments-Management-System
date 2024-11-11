package src.Service;

import src.Model.*;
import src.Repository.InMemoryRepository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

   public void addSomeValues() {

   }

   public void addAppointment(Appointment appointment) {
        appointmentRepository.create(appointment);
   }

   public void removeAppointment(Appointment appointment) {
        appointmentRepository.delete(appointment.getId());
   }

   public void addClinic(Clinic clinic) {
        clinicRepository.create(clinic);
   }

   public void removeClinic(Clinic clinic) {
        clinicRepository.delete(clinic.getId());
   }

   public void addMedication(Medication medication) {
        medicationRepository.create(medication);
   }
   public void removeMedication(Medication medication) {
        medicationRepository.delete(medication.getId());
   }

   public void addSpecialization(Specialization specialization) {
        specializationRepository.create(specialization);
   }
   public void removeSpecialization(Specialization specialization) {
        specializationRepository.delete(specialization.getId());
   }

   public void updateAppointment(Appointment appointment) {
        appointmentRepository.update(appointment);
   }

   public void updateClinic(Clinic clinic) {
        clinicRepository.update(clinic);
   }

   public void updateMedication(Medication medication) {
        medicationRepository.update(medication);
   }
   public void updateSpecialization(Specialization specialization) {
        specializationRepository.update(specialization);
   }

   public void addDoctor(Doctor doctor) {
        doctorRepository.create(doctor);
   }

   public void removeDoctor(Doctor doctor) {
        doctorRepository.delete(doctor.getId());
   }

   public void addPatient(Patient patient) {
        patientRepository.create(patient);
   }
   public void removePatient(Patient patient) {
        patientRepository.delete(patient.getId());
   }

   public void updateDoctor(Doctor doctor) {
        doctorRepository.update(doctor);
   }
   public void updatePatient(Patient patient) {
        patientRepository.update(patient);
   }

   public Map<Integer, Appointment> getAppointments() {
        return appointmentRepository.getAll();
   }
   public Map<Integer, Clinic> getClinics() {
        return clinicRepository.getAll();
   }

   public Map<Integer, Doctor> getDoctors(){
        return doctorRepository.getAll();
   }

   public Map<Integer, Patient> getPatients() {
        return patientRepository.getAll();
   }
   public Map<Integer, Specialization> getSpecializations() {
        return specializationRepository.getAll();
   }
   public Map<Integer, Medication> getMedications() {
        return medicationRepository.getAll();
   }

}
