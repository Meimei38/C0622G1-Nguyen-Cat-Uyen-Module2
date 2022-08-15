package ss10_practice_day.exercise1.controller;

import ss10_practice_day.exercise1.service.IStudentService;
import ss10_practice_day.exercise1.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private static Scanner scanner = new Scanner(System.in);
    private static IStudentService studentService = new StudentService();


    public static void studentManagementMenu() {
        while (true) {
            System.out.println("--------------------------------------");
            System.out.println("Chào mừng đến với hệ thống quản lý học sinh!");
            System.out.println("1. Thêm mới học sinh");
            System.out.println("2. Xóa học sinh");
            System.out.println("3. Hiển thị danh sách học sinh");
            System.out.println("4. Thoát");
            System.out.print("Mời bạn nhập chức năng 1->4: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    studentService.addStudent();
                    break;
                case 2:
                    studentService.deleteStudent();
                    break;
                case 3:
                    studentService.displayStudentList();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Lựa chọn của bạn không đúng. Vui lòng nhập lại!");

            }

        }

    }
}
