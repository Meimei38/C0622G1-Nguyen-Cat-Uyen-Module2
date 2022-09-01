package case_study.controller;

import case_study.service.IBookingService;
import case_study.service.impl.BookingService;

import java.util.Scanner;

public class BookingController {
    private static Scanner scanner = new Scanner(System.in);
    private static IBookingService bookingService = new BookingService();

    public static void bookingManagement() {
        while (true) {
            System.out.println("----------Booking Management System----------");
            System.out.println("1. Add new booking");
            System.out.println("2. Display booking list");
            System.out.println("3. Create new contracts");
            System.out.println("4. Display contract list");
            System.out.println("5. Edit contract");
            System.out.println("6. Return main menu");
            System.out.println("Please choose an option to continue: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    bookingService.addBooking();
                    break;
                case 2:
                    bookingService.displayBooking();
                    break;
                case 3:
                    bookingService.createContract();
                    break;
                case 4:
                    bookingService.displayContract();
                    break;
                case 5:
                    bookingService.editContract();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid choice! Please choose again!");
            }


        }
    }
}
