package src.UI;

import src.Controller.Controller;

import java.util.Scanner;

public class PatientUI {
    private final Controller controller;

    public PatientUI(Controller controller) {
        this.controller = controller;
    }

    public void start() {
        System.out.println("Patient UI");
        System.out.println("Make an appointment");

    }

    public void makeAppointment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter doctor id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter your patient id: ");
        int patientId = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter date: (yyyy-MM-dd HH:mm)");
        String date = scanner.nextLine();



    }


}
