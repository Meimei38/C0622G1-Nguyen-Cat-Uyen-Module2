package ss10_practice_day.exercise1.service.impl;

import ss10_practice_day.exercise1.model.Student;
import ss10_practice_day.exercise1.model.Teacher;
import ss10_practice_day.exercise1.service.ITeacherService;
import ss9_data_structures_algorithms.bai_tap.controller.MyListTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Teacher> teachers = new ArrayList<>();

    static {
        teachers.add(new Teacher(1, "Harry Potter", "Nam", "20/10/2000", "Giáo viên dạy Toán"));
        teachers.add(new Teacher(2, "Hermione Granger", "Nữ", "2/1/2000", "Giáo viên dạy Hóa"));
        teachers.add(new Teacher(3, "Draco Malfoy", "Nam", "12/3/2000", "Giáo viên dạy GDCD"));
    }

    @Override
    public void addTeacher() {
        Teacher teacher = this.getInfoTeacher();
        teachers.add(teacher);
        System.out.println("Nhập thông tin giáo viên thành công!");
    }

    @Override
    public void deleteTeacher() {
        Teacher teacher = this.findTeacher();
        if (teacher == null) {
            System.out.println("Không tìm thấy đối tượng cần xóa");
        } else {
            System.out.println("Bạn có muốn xóa giáo viên có id " + teacher.getId() + " không?");
            System.out.println("1. Có");
            System.out.println("2. Không");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                teachers.remove(teacher);
                System.out.println("Xóa đối tượng thành công!");
            }

        }

    }

    @Override
    public void displayTeacher() {
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    private Teacher findTeacher() {
        System.out.println("Vui lòng nhập id giáo viên: ");
        int idTeacher = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getId() == idTeacher) {
                return teachers.get(i);
            }

        }
        return null;
    }

    private Teacher getInfoTeacher() {
        System.out.println("Mời bạn nhập id của giáo viên: ");
        int teacherId = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập tên của giáo viên ");
        String teacherName = scanner.nextLine();
        System.out.println("Mời bạn nhập giới tính của giáo viên: ");
        String teacherGender = scanner.nextLine();
        System.out.println("Mời bạn nhập ngày tháng năm sinh của giáo viên: ");
        String teacherDateOfBirth = scanner.nextLine();
        System.out.println("Mời bạn nhập vị trí giáo viên đang đảm nhận: ");
        String position = scanner.nextLine();
        Teacher teacher = new Teacher(teacherId, teacherName, teacherGender, teacherDateOfBirth, position);
        return teacher;
    }


}
