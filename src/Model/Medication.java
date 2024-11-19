package src.Model;

import java.io.Serializable;

public class Medication extends Identifiable implements Serializable {
    private String medicationName;
    private String dosage;
    private Patient patient;

    public Medication(String name, String dosage) {
        super();
        this.medicationName = name;
        this.dosage = dosage;
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
        return "Medication [ID: " + this.getId() + ", Name: " + medicationName +
                ", Dosage: " + dosage + ", Patient: " + patient.getId() + " " +  patient.getFirstName() + " " + patient.getLastName();
    }

    public int getPatientId() {
        return this.patient.getId();
    }
}
