package src.Model;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class Identifiable implements Serializable {
    private static final long serialVersionUID = 1L;

    // Static AtomicInteger for thread-safe ID generation
    private static transient AtomicInteger idGenerator = new AtomicInteger(1);

    // Final ID for the object
    protected final int id;

    // Constructor assigns a unique ID during object creation
    public Identifiable() {
        this.id = generateId();
    }

    // Method to generate a new ID
    private static int generateId() {
        return idGenerator.getAndIncrement();
    }

    // Getter for ID
    public int getId() {
        return id;
    }

    // Ensures ID generator is reset or restored during deserialization
    private Object readResolve() {
        if (idGenerator == null) {
            idGenerator = new AtomicInteger(id + 1); // Start from the next ID after the current
        }
        return this;
    }
}
