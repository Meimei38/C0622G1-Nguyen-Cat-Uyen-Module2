package ss10_practice_day.exercise1.controller;

import ss10_practice_day.exercise1.service.ITeacherService;
import ss10_practice_day.exercise1.service.impl.StudentService;
import ss10_practice_day.exercise1.service.impl.TeacherService;

import java.io.IOException;
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
            System.out.println("4. Tìm kiếm theo id: ");
            System.out.println("5. Tìm kiếm theo tên: ");
            System.out.println("6. Sắp xếp theo tên: ");
            System.out.println("7. Thoát");
            System.out.print("Mời bạn nhập chức năng 1->7: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    try {
                        teacherService.addTeacher();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    try {
                        teacherService.deleteTeacher();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    try {
                        teacherService.displayTeacher();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    System.out.println(teacherService.findTeacher());
                    break;
                case 5:
                    teacherService.findTeacherByName();
                    break;
                case 6:
                    try {
                        teacherService.sortByName();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                case 7:
                    return;
                default:
                    System.out.println("Lựa chọn của bạn không đúng. Vui lòng nhập lại!");
            }
        }


    }

}
