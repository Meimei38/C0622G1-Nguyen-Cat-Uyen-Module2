package case_study.controller;

import case_study.service.IFacilityService;
import case_study.service.impl.FacilityService;

import java.util.Scanner;

public class FacilityController {
    private static Scanner scanner = new Scanner(System.in);
    private static IFacilityService facilityService = new FacilityService();

    public static void facilityManagement() {
        while (true) {
            System.out.println("----------Facility Management System----------");
            System.out.println("1. Display facility list");
            System.out.println("2. Add new facility list");
            System.out.println("3. Display facility maintenance list");
            System.out.println("4. Return main menu");
            System.out.println("Please choose an option to continue: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    break;
                case 2:

                    break;
                case 3:
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice! Please choose again!");
            }
        }
    }
