package src.Model;

public class Medication {
    private int medicationID;
    private String medicationName;
    private String dosage;
    private src.Model.Patient patient;

    public Medication(int medicationID, String name, String dosage, src.Model.Patient patient) {
        this.medicationID = medicationID;
        this.medicationName = name;
        this.dosage = dosage;
        this.patient = patient;
    }

    public int getMedicationID() {
        return medicationID;
    }

    public void setMedicationID(int medicationID) {
        this.medicationID = medicationID;
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

    public src.Model.Patient getPatient() {
        return patient;
    }

    public void setPatient(src.Model.Patient patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "src.model.Medication [ID: " + medicationID + ", Name: " + medicationName +
                ", Dosage: " + dosage + ", src.model.Patient: " + patient.getFirstName() +
                " " + patient.getLastName() + "]";
    }
}
