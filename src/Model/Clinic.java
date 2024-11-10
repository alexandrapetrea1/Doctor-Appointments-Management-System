package src.Model;

import java.util.ArrayList;
import java.util.List;


public class Clinic extends Identifiable {

    private List<Doctor> listOfDoctors;
    private String operatingHours;

    public Clinic(int clinicID, String operatingHours) {
        this.setId(clinicID);
        this.operatingHours = operatingHours;
        this.listOfDoctors = new ArrayList<>();
    }


    public List<Doctor> getListOfDoctors() {
        return listOfDoctors;
    }

    public void setListOfDoctors(List<Doctor> listOfDoctors) {
        this.listOfDoctors = listOfDoctors;
    }

    public String getOperatingHours(){
        return operatingHours;
    }

    public void setOperatingHours(String operatingHours) {
        this.operatingHours = operatingHours;
    }
    @Override
    public String toString() {
        return "src.model.Clinic [ID: " + this.getId() +
                ", Operating Hours: " + operatingHours +
                ", Doctors: " + listOfDoctors + "]";
    }


}
