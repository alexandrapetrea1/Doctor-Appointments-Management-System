import java.util.ArrayList;
import java.util.List;


public class Clinic {
    private int clinicID;
    private List<Doctor> listOfDoctors;
    private String operatingHours;

    public Clinic(int clinicID, String operatingHours) {
        this.clinicID = clinicID;
        this.operatingHours = operatingHours;
        this.listOfDoctors = new ArrayList<>();
    }

    public int getClinicID() {
        return clinicID;
    }

    public void setClinicID(int clinicID) {
        this.clinicID = clinicID;
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
        return "Clinic [ID: " + clinicID +
                ", Operating Hours: " + operatingHours +
                ", Doctors: " + listOfDoctors + "]";
    }


}
