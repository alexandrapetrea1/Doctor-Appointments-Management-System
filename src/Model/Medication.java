package src.Model;

public class Medication extends Identifiable {
    private String medicationName;
    private String dosage;

    public Medication(String name, String dosage) {
        this.id = this.generateId();
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
        return "src.model.Medication [ID: " + this.getId() + ", Name: " + medicationName +
                ", Dosage: " + dosage + ", src.model.Patient: " + "]";
    }
}
