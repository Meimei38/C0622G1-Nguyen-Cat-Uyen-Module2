package case_study.controller;

import case_study.service.IFacilityService;
import case_study.service.impl.FacilityService;

import java.util.Scanner;

public class FacilityController {
    private static Scanner scanner = new Scanner(System.in);
    private static IFacilityService facilityService = new FacilityService();

    public static void facilityManagement() {
        int choice;
        while (true) {
            System.out.println("----------Facility Management System----------");
            System.out.println("1. Display facility list");
            System.out.println("2. Add new facility");
            System.out.println("3. Delete facility ");
            System.out.println("4. Display facility maintenance list");
            System.out.println("5. Exit");
            System.out.println("Please choose an option to continue: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    facilityService.displayFacility();
                    break;
                case 2:
                    displayAddingMenu();
                    break;
                case 3:
                    facilityService.deleteFacility();
                    break;
                case 4:
                    facilityService.displayFacilityMaintenance();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice! Please choose again!");
            }
        }
    }

    private static void displayAddingMenu() {
        int choice;
        while (true){
            System.out.println("1. Add new villa");
            System.out.println("2. Add new house");
            System.out.println("3. Add new room");
            System.out.println("4. Back to menu");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    facilityService.addVilla();
                    break;
                case 2:
                    facilityService.addHouse();
                    break;
                case 3:
                    facilityService.addRoom();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice! Please choose again!");
            }
        }
    }
}
