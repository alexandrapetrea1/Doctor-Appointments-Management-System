package src.Repository;

import src.Model.Appointment;
import java.util.HashMap;
import java.util.Map;

public class InMemoryAppointmentRepository implements IRepository<Appointment> {
    private final Map<Integer, Appointment> data = new HashMap<>();
    private int currentId = 1;

    @Override
    public void create(Appointment appointment) {
        appointment.setAppointmentID(currentId);
        data.put(currentId,appointment);
        currentId++;
    }

    @Override
    public Appointment read(int id) {
        return data.get(id);
    }

    @Override
    public void update(Appointment appointment) {
        if (data.containsKey(appointment.getAppointmentID())) {
            data.put(appointment.getAppointmentID(), appointment);
        } else {
            System.out.println("Appointment with ID " + appointment.getAppointmentID() + " does not exist.");
        }
    }

    @Override
    public void delete(int id) {
        data.remove(id);
    }
}
