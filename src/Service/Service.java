package src.Service;

import src.Model.*;
import src.Repository.FileRepository;
import src.Repository.IRepository;
import src.Repository.InMemoryRepository;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;


public class Service {
    private final IRepository<Appointment> appointmentRepository;
    private final IRepository<Doctor> doctorRepository;
    private final IRepository<Patient> patientRepository;
    private final IRepository<Clinic> clinicRepository;
    private final IRepository<Medication> medicationRepository;
    private final IRepository<Specialization> specializationRepository;

    public Service(IRepository<Appointment> appointmentRepository, IRepository<Doctor> doctorRepository, IRepository<Patient> patientRepository, IRepository<Clinic> clinicRepository, IRepository<Medication> medicationRepository, IRepository<Specialization> specializationRepository) {
        this.appointmentRepository = appointmentRepository;
        this.doctorRepository = doctorRepository;
        this.patientRepository = patientRepository;
        this.clinicRepository = clinicRepository;
        this.medicationRepository = medicationRepository;
        this.specializationRepository = specializationRepository;
        addSomeValues();
    }

    public void addSomeValues() {
        Clinic clinic1 = new Clinic("Nova Clinic", "Str. T. Vladimirescu 19");
        Clinic clinic2 = new Clinic("Medica", "Str. Mircea Eliade 33");
        Clinic clinic3 = new Clinic("Regina Maria", "Str. Eugen Ionescu 32-37");
        clinicRepository.create(clinic1);
        clinicRepository.create(clinic2);
        clinicRepository.create(clinic3);

        Specialization specialization1 = new Specialization("ginecolog", "opens legs");
        Specialization specialization2 = new Specialization("oftalmolog", "opens eyes");
        Specialization specialization3 = new Specialization("dentist", "opens mouths");
        specializationRepository.create(specialization1);
        specializationRepository.create(specialization2);
        specializationRepository.create(specialization3);

        Doctor doctor1 = new Doctor("Victor", "Rusu", specialization1);
        Doctor doctor2 = new Doctor("Tudor", "Ivancea", specialization2);
        Doctor doctor3 = new Doctor("Alex", "Luca", specialization3);
        addDoctor(doctor1);
        addDoctor(doctor2);
        addDoctor(doctor3);

        Patient patient1 = new Patient("Alexandra", "Bercu", new ContactInfo("0725896874","bercualexandra@gmail.com" ,"Strada Narciselor 4"));
        addPatient(patient1);



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

   public Clinic getClinicById(int id){
        return clinicRepository.getById(id);
   }

   public Doctor getDoctorById(int id){
        return doctorRepository.getById(id);
   }

    public Patient getPatientById(int id) {
        return patientRepository.getById(id);
    }


    public List<Clinic> findNearbyClinics(String address) {
        // Implement logic to find clinics near the address
        // Placeholder for now:
        return clinicRepository.getAll().values().stream().toList();
    }

    public List<Doctor> findDoctorsBySpecialization(String specializationName) {
        return doctorRepository.getAll().values().stream()
                .filter(doctor -> doctor.getSpecialization().getName().equalsIgnoreCase(specializationName))
                .toList();
    }

    public List<Medication> getMedicationsForPatient(Patient patient) {
        // Placeholder logic for retrieving medications
        return medicationRepository.getAll().values().stream()
                .filter(medication -> medication.getPatientId() == patient.getId())
                .toList();
    }

    public boolean validateDateTime(String dateTime) {
        try {
            LocalDateTime.parse(dateTime, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }



    public boolean createAppointment(Patient patient, Doctor doctor, String dateTime, String reason) {
        try {
            LocalDateTime appointmentTime = LocalDateTime.parse(dateTime, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
            Appointment appointment = new Appointment(appointmentTime, patient, doctor,  reason);
            addAppointment(appointment); // Add to the repository
            return true;
        } catch (Exception e) {
            System.out.println("Error creating appointment: " + e.getMessage());
            return false;
        }
    }

    public List<Doctor> sortDoctorsBySpecialization() {
            List<Doctor> doctors = new ArrayList<>(doctorRepository.getAll().values());
            doctors.sort(Comparator.comparing(d -> d.getSpecialization().getName()));
            return doctors;
        }
    public List<Appointment> sortAppointmentsByDateTime() {
            List<Appointment> appointments = new ArrayList<>(appointmentRepository.getAll().values());
            appointments.sort(Comparator.comparing(Appointment::getDateTime));
            return appointments;
        }

    public List<Doctor> filterDoctorsBySpecialization(String specializationName) {
        return doctorRepository.getAll().values().stream()
                .filter(d -> d.getSpecialization().getName().equalsIgnoreCase(specializationName))
                .collect(Collectors.toList());
    }

}
