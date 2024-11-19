package src.Model;

import java.io.Serializable;

public class Medication extends Identifiable implements Serializable {
    private String medicationName;
    private String dosage;
    private Patient patient;

    public Medication(String name, String dosage, Patient patient) {
        super();
        this.medicationName = name;
        this.dosage = dosage;
        this.patient = patient;
    }


    public String getMedicationName() {
        return medicationName;
    }

    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }


    @Override
    public String toString() {
        return "Medication:   Name: " + medicationName +
                " | Dosage: " + dosage + " | Patient: " + patient.getFirstName() + " " + patient.getLastName();
    }

    public int getPatientId() {
        return this.patient.getId();
    }
}
