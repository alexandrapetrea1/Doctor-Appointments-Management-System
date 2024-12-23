package src.Model;

import java.io.Serializable;

public class Specialization extends Identifiable implements Serializable {
    private String name;
    private String description;


    public Specialization(String name, String description) {
        super();
        this.name = name;
        this.description = description;
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


    @Override
    public String toString() {
        return "Specialization: ID: " + this.getId() + " | Name: " + name +
                " | Description: " + description;
    }
}
