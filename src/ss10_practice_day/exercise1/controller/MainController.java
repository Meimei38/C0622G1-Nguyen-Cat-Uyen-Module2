package ss10_practice_day.exercise1.controller;

import java.util.Scanner;

public class MainController {
    private static Scanner scanner = new Scanner(System.in);


    public void menuManagement() {
        while (true){
            System.out.println("--------------------------------------");
            System.out.println("Chào mừng đến với hệ thống quản lý Codegym!");
            System.out.println("1. Truy cập hệ thống quản lý giáo viên: ");
            System.out.println("2. Truy cập hệ thống quản lý học sinh: ");
            System.out.println("3. Thoát hệ thống");
            System.out.println("Vui lòng chọn hệ thống để tiếp tục: ");
            int choice= Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    TeacherController.teacherManagementMenu();
                    break;
                case 2:
                    StudentController.studentManagementMenu();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Lựa chọn của bạn không đúng, vui lòng nhập lại!");

            }


        }
    }

}
