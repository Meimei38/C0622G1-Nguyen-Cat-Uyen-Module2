package case_study.controller;

import case_study.service.IEmployeeService;
import case_study.service.impl.EmployeeService;

import java.util.Scanner;

public class EmployeeController {
    private static Scanner scanner = new Scanner(System.in);
    private static IEmployeeService employeeService = new EmployeeService();
    public static void employeeManagement() {
        while (true){
            System.out.println("----------Employee Management System----------");
            System.out.println("1. Display employee list");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
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
