package src.Model;

public class Is_Employed {
    private int doctorID;
    private int clinicID;


    public int getDoctorID(){
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public int getClinicID(){
        return clinicID;
    }

    public void setClinicID(int clinicID) {
        this.clinicID = clinicID;
    }

    @Override
    public String toString() {
        return "Employment [ ID: " + doctorID + ", src.model.Clinic ID: " + clinicID + "]";
    }
}
