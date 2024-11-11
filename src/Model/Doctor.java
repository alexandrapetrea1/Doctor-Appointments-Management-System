package src.Model;

import java.util.ArrayList;
import java.util.List;

public class Doctor extends src.Model.Person {
    private List<Integer> specializationsIDs;
    private List<Integer> appointmentsIDs;
    private List<Integer> clinicsIDs;


    public List<Integer> getclinicsIDs() {
        return clinicsIDs;
    }

    public void setclinicsIDs(List<Integer> clinicsIDs) {
        this.clinicsIDs = clinicsIDs;
    }

    public void setSpecializations(List<Integer> specializationsIDs) {
        this.specializationsIDs = specializationsIDs;
    }

    public Doctor(String firstName, String lastName, List<Integer> specializationsIDs) {
        super(firstName, lastName);
        this.id = this.generateId();
        this.specializationsIDs = specializationsIDs;
        this.appointmentsIDs = new ArrayList<>();
    }

    public List<Integer> getSpecializations(){
        return this.specializationsIDs;
    }

    public void setSpecialization(List<Integer> specializationsIDs){
        this.specializationsIDs = specializationsIDs;
    }


    public List<Integer> getAppointments() {
        return appointmentsIDs;
    }

    public void setAppointments(List<Integer> appointmentsIDs) {
        this.appointmentsIDs = appointmentsIDs;
    }

}
