package src.Model;

public class Specialization {
    private int specializationID;
    private String name;
    private String description;

    public Specialization(int specializationID, String name, String description) {
        this.specializationID = specializationID;
        this.name = name;
        this.description = description;
    }

    public int getSpecializationID() {
        return specializationID;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setSpecializationID(int specializationID) {
        this.specializationID = specializationID;
    }

    @Override
    public String toString() {
        return "src.model.Specialization [ID: " + specializationID + ", Name: " + name +
                ", Description: " + description + "]";
    }
}
