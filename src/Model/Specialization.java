package src.Model;

public class Specialization extends Identifiable{
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
        return "src.model.Specialization [ID: " + this.getId() + ", Name: " + name +
                ", Description: " + description + "]";
    }
}
