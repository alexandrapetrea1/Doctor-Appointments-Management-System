package src.Model;

import java.util.ArrayList;
import java.util.List;


public class Clinic extends Identifiable {

    private List<Integer> listOfDoctorsIDs;
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public Clinic(List<Integer> listOfDoctorsIDs, String address) {
        this.id = this.getId();
        this.listOfDoctorsIDs = listOfDoctorsIDs;
        this.address = address;
    }


    public List<Integer> getlistOfDoctorsIDs() {
        return listOfDoctorsIDs;
    }

    public void setlistOfDoctorsIDs(List<Integer> listOfDoctorsIDs) {
        this.listOfDoctorsIDs = listOfDoctorsIDs;
    }


    @Override
    public String toString() {
        return "src.model.Clinic [ID: " + this.getId() +
                ", Operating Hours: " +
                ", Doctors: " + listOfDoctorsIDs + "]";
    }


}
