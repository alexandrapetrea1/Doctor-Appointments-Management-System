package src.Model;
import java.util.concurrent.atomic.AtomicInteger;


public abstract class Identifiable {
    protected int id;

    public Identifiable() {
        this.id = generateId();
    }

    protected static int idCounter = 0;
    static AtomicInteger idGenerator = new AtomicInteger(1);
    public int getId() {
        return id;
    }

    protected static int generateId(){
        return ++idCounter;
    }

    public void setId(int id) { this.id = id; }
}
