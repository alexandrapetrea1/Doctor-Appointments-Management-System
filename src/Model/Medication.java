package src.Model;

public class Medication extends Identifiable {
    private String medicationName;
    private String dosage;
    private src.Model.Patient patient;

    public Medication(int medicationID, String name, String dosage, src.Model.Patient patient) {
        this.setId(medicationID);
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

    public src.Model.Patient getPatient() {
        return patient;
    }

    public void setPatient(src.Model.Patient patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "src.model.Medication [ID: " + this.getId() + ", Name: " + medicationName +
                ", Dosage: " + dosage + ", src.model.Patient: " + patient.getFirstName() +
                " " + patient.getLastName() + "]";
    }
}
