package ss10_practice_day.exercise1.controller;

import ss10_practice_day.exercise1.service.ITeacherService;
import ss10_practice_day.exercise1.service.impl.StudentService;
import ss10_practice_day.exercise1.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherController{
    private static Scanner scanner=new Scanner(System.in);
    private ITeacherService teacherService= new TeacherService();
    public static void teacherManagementMenu(){
        System.out.println("--------------------------------------");
        System.out.println("Chào mừng đến với hệ thống quản lý giáo viên!");
        System.out.println("1. Hiển thị danh sách giáo viên");
        System.out.println("2. Thêm mới giáo viên");
        System.out.println("3. Cập nhật thông tin giáo viên");
        System.out.println("4. Xóa giáo viên");
        System.out.println("5. Thoát");
        System.out.print("Mời bạn nhập chức năng 1->5: ");
        int choice= Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                return;
            default:
                System.out.println("Lựa chọn của bạn không đúng. Vui lòng nhập lại!");
        }

    }

}
