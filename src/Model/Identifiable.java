package src.Model;
import java.util.concurrent.atomic.AtomicInteger;


public abstract class Identifiable {
    protected int id;
    AtomicInteger idGenerator = new AtomicInteger(1);
    public int getId() {
        return id;
    }

    protected int generateId(){
        return idGenerator.getAndIncrement();
    }

    public void setId(int id) { this.id = id; }
}
