package ss12_java_collection_framework.bai_tap.product_managing_system.controller;

import ss12_java_collection_framework.bai_tap.product_managing_system.service.IProductManagingService;
import ss12_java_collection_framework.bai_tap.product_managing_system.service.impl.ProductManagingService;

import java.util.Scanner;

public class MainController {
    private static Scanner scanner = new Scanner(System.in);
    private static IProductManagingService productManagingService = new ProductManagingService();

    public static void menuManagement() {
        while (true) {

            System.out.println("Chào mừng đến Hệ thống quản lý sản phẩm: ");
            System.out.println("1. Thêm sản phẩm: ");
            System.out.println("2. Sửa thông tin: ");
            System.out.println("3. Xóa sản phẩm: ");
            System.out.println("4. Hiển thị danh sách sản phẩm: ");
            System.out.println("5. Tìm kiếm sản phẩm theo tên: ");
            System.out.println("6. Sắp xếp sản phẩm theo giá (tăng dần): ");
            System.out.println("7. Sắp xếp sản phẩm theo giá (giảm dần): ");
            System.out.println("8. Thoát hệ thống.");
            System.out.print("Vui lòng nhập chức năng 1->8: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productManagingService.add();
                    break;
                case 2:
                    productManagingService.edit();
                    break;
                case 3:
                    productManagingService.delete();
                    break;
                case 4:
                    productManagingService.display();
                    break;
                case 5:
                    productManagingService.searchByName();
                    break;
                case 6:
                    productManagingService.sortAscending();
                    break;
                case 7:
                    productManagingService.sortDescending();
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Chức năng bạn nhập không đúng. Vui lòng nhập lại!");
            }
        }
    }
}
