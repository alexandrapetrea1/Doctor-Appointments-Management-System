package src.UI;

import src.Controller.Controller;
import src.Model.Clinic;
import src.Model.Doctor;
import src.Model.Specialization;

import java.util.List;
import java.util.Scanner;

public class AdminUI {
    private final Controller controller;
    public AdminUI(Controller controller) {
        this.controller = controller;
    }

    public void showDoctors(){
        System.out.println("This are all doctors");
        List<Doctor> doctors = controller.getAllDoctors();
        for (Doctor doctor : doctors) {
            System.out.println(doctor);
        }
    }

    public void start() {
        System.out.println("Welcome to Admin UI");
        System.out.println("Choose an option:");
        System.out.println("1. Add Clinic");
        System.out.println("2. Add Doctor");
        System.out.println("3. Add Specialization");
        System.out.println("4. Show all doctors");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1: addClinic(); break;
            case 2: addDoctorToClinic(); break;
            case 4: showDoctors(); break;
            default: return;
        }
    }

    public void addClinic(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Clinic details: ");
        System.out.println("Enter Clinic name: ");
        String name = sc.nextLine();
        System.out.println("Enter Clinic address: ");
        String address = sc.nextLine();
        Clinic clinic = new Clinic(name, address);
        controller.addClinic(clinic);
    }

    public void addDoctorToClinic(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Doctor first name: ");
        String firstName = sc.nextLine();
        System.out.println("Enter Doctor last name: ");
        String lastName = sc.nextLine();
        System.out.println("Enter specialization name: ");
        String specializationName = sc.nextLine();
        System.out.println("Enter specialization description: ");
        String specializationDescription = sc.nextLine();
        Doctor doctor = new Doctor(firstName,lastName,new Specialization(specializationName,specializationDescription));
        controller.addDoctor(doctor);
        System.out.println("Enter Clinic id: ");
        int id = sc.nextInt();
        Clinic clinic = controller.searchClinicById(id);
        clinic.addDoctor(doctor);
    }


}
