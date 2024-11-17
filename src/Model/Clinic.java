package src.Model;

import java.util.ArrayList;
import java.util.List;


public class Clinic extends Identifiable {

    private List<Doctor> listOfDoctors;
    private String name;
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public List<Doctor> getListOfDoctors() {
        return listOfDoctors;
    }

    public void setListOfDoctors(List<Doctor> listOfDoctors) {
        this.listOfDoctors = listOfDoctors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Clinic(String name, String address) {
        super();
        this.name = name;
        this.address = address;
        this.listOfDoctors = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        this.listOfDoctors.add(doctor);
    }

    @Override
    public String toString() {
        return "Clinic{" +
                "listOfDoctors=" + listOfDoctors +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", id=" + id +
                '}';
    }
}
