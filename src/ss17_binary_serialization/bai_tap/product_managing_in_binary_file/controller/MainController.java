package ss17_binary_serialization.bai_tap.product_managing_in_binary_file.controller;

import ss17_binary_serialization.bai_tap.product_managing_in_binary_file.service.IProductService;
import ss17_binary_serialization.bai_tap.product_managing_in_binary_file.service.impl.ProductService;

import java.util.Scanner;

public class MainController {
    public void menuManagement() {
        IProductService productService = new ProductService();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Welcome to the Product Managing System!");
            System.out.println("1. Add a product");
            System.out.println("2. Display  products");
            System.out.println("3. Search products");
            System.out.println("4. Exit");
            System.out.println("Please select an option to continue: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    productService.addProduct();
                    break;
                case 2:
                    productService.displayProduct();
                    break;
                case 3:
                    productService.searchProduct();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice! Please choose again!");
        }

        }

    }
}
