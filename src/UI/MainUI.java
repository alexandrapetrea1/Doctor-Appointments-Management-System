package src.UI;

import src.Controller.Controller;

import java.awt.*;
import java.util.Scanner;

public class MainUI {
    private final Controller controller;
    private final AdminUI adminUI;
    private final DoctorUI doctorUI;
    private final PatientUI patientUI;

    public MainUI(Controller controller, AdminUI adminUI, DoctorUI doctorUI, PatientUI patientUI) {
        this.controller = controller;
        this.adminUI = adminUI;
        this.doctorUI = doctorUI;
        this.patientUI = patientUI;
    }

    public void start(){
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while(running){
            System.out.println("Welcome to Doctor Appointments Management System");
            System.out.println("1. Login as Admin");
            System.out.println("2. Login as Doctor");
            System.out.println("3. Login as Patient");
            int choice = scanner.nextInt();
            switch(choice){
                case 1: adminUI.start();
                case 2: doctorUI.start();
                case 3: patientUI.start();
                default: running = false;
            }

        }

    }
}
