package case_study.controller;

import java.util.Scanner;

public class FuramaMainController {
    private static Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        while (true){
            System.out.println("----------Furama Management----------");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management ");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.println("Please select a management system to continue:  ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    EmployeeController.employeeManagement();
                    break;
                case 2:
                    CustomerController.customerManagement();
                    break;
                case 3:
                    FacilityController.facilityManagement();
                    break;
                case 4:
                    BookingController.bookingManagement();
                    break;
                case 5:
                    PromotionController.promotionManagement();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid choice! Please choose again!");
            }
        }

    }
}
