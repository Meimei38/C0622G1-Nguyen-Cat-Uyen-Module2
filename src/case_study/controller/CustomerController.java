package case_study.controller;

import case_study.service.ICustomerService;
import case_study.service.impl.CustomerService;

import java.util.Scanner;

public class CustomerController {
    private static Scanner scanner = new Scanner(System.in);
    private static ICustomerService customerService = new CustomerService();
    public static void customerManagement() {
        while (true){
            System.out.println("----------Customer Management System----------");
            System.out.println("1. Display customer list");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return main menu");
            System.out.println("Please choose an option to continue: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
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
