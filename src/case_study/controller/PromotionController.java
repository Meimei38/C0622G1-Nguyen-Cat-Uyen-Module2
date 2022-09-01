package case_study.controller;

import case_study.service.IPromotionService;
import case_study.service.impl.PromotionService;

import java.util.Scanner;

public class PromotionController {
    private static Scanner scanner = new Scanner(System.in);
    private static IPromotionService promotionService = new PromotionService();

    public static void promotionManagement() {
        while (true) {
            System.out.println("----------Promotion Management System----------");
            System.out.println("1. Display customers using service");
            System.out.println("2. Display customers getting voucher");
            System.out.println("3. Return main menu");
            System.out.println("Please choose an option to continue: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    promotionService.displayCustomerUsingService();
                    break;
                case 2:
                    promotionService.displayCustomerGettingVoucher();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice! Please choose again!");
            }


        }
    }
}
