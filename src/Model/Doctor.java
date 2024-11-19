package src.Model;

import java.util.ArrayList;
import java.util.List;

public class Doctor extends Person  {
    private  Specialization specialization;


    @Override
    public String toString() {
        return "Doctor{" +
                "First Name='" + getFirstName() + '\'' +
                ", Last Name='" + getLastName() + '\'' +
                "specialization=" + specialization +
                ", id=" + id +
                '}';
    }

    public Doctor(String firstName, String lastName, Specialization specialization) {
        super(firstName, lastName);
        this.specialization = specialization;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }

}
