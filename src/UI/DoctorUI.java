package src.UI;

import src.Controller.Controller;
import src.Model.Appointment;
import src.Model.Doctor;

import java.util.List;
import java.util.Scanner;

public class DoctorUI {

    private final Controller controller;

    public DoctorUI(Controller controller) {
        this.controller = controller;
    }

    public void start() {
        System.out.println("Welcome to DoctorUI: ");
        Doctor doctor = login();
        boolean active = false;
        if(doctor != null) {
            active = true;
        }
        Scanner scanner = new Scanner(System.in);
        while(active) {
            System.out.println("Please select an option: ");
            System.out.println("1. Add Appointment");
            System.out.println("2. View Appointments");
            System.out.println("3. Delete Appointment");
            System.out.println("4. Exit");
            int option = scanner.nextInt();
            switch(option) {
                case 1: break;
                case 2: seeAppointments(doctor); break;
                case 3: break;
                case 4: active = false; break;
                default: System.out.println("Invalid option"); break;
            }

        }

    }

    public Doctor login(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter doctor ID: ");
        int id = Integer.parseInt(sc.nextLine());
        Doctor doctor = controller.getDoctorById(id);
        return doctor;
    }

    public void seeAppointments(Doctor doctor) {
        System.out.println("Here are your appointments:");
        List<Appointment> appointmentList = controller.getAppointmentsFromDoctor(doctor);
        for(Appointment appointment : appointmentList) {
            System.out.println(appointment);
        }


    }
}
