package ss10_practice_day.exercise1.controller;

import ss10_practice_day.exercise1.service.ITeacherService;
import ss10_practice_day.exercise1.service.impl.StudentService;
import ss10_practice_day.exercise1.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private static Scanner scanner = new Scanner(System.in);
    private static ITeacherService teacherService = new TeacherService();

    public static void teacherManagementMenu() {
        while (true) {
            System.out.println("--------------------------------------");
            System.out.println("Chào mừng đến với hệ thống quản lý giáo viên!");
            System.out.println("1. Thêm mới giáo viên");
            System.out.println("2. Xóa giáo viên");
            System.out.println("3. Hiển thị danh sách giáo viên");
            System.out.println("4. Thoát");
            System.out.print("Mời bạn nhập chức năng 1->4: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    teacherService.addTeacher();
                    break;
                case 2:
                    teacherService.deleteTeacher();
                    break;
                case 3:
                    teacherService.displayTeacher();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Lựa chọn của bạn không đúng. Vui lòng nhập lại!");
            }
        }


    }

}
