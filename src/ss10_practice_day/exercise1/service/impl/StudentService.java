package ss10_practice_day.exercise1.service.impl;

import ss10_practice_day.exercise1.model.Student;
import ss10_practice_day.exercise1.service.IStudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Student> students = new ArrayList<>();

    static {
        Student student=new Student(1, "Meimei", "Female", );
    }

    @Override
    public void addStudent() {
        Student student = this.getInfoStudent();
        students.add(student);
        System.out.println("Thêm mới học sinh thành công!");


    }

    @Override
    public void displayStudentList() {
        for (Student student:students){
            System.out.println(student);
        }
    }

    public Student getInfoStudent() {
        System.out.println("Mời bạn nhập id của học sinh: ");
        int studentId = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập tên của học sinh ");
        String studentName = scanner.nextLine();
        System.out.println("Mời bạn nhập giới tính của học sinh: ");
        String studentGender = scanner.nextLine();
        System.out.println("Mời bạn nhập ngày tháng năm sinh của học sinh: ");
        String studentDateOfBirth = scanner.nextLine();
        System.out.println("Mời bạn nhập tên lớp: ");
        String className = scanner.nextLine();
        System.out.println("Mời bạn nhập điểm: ");
        double score = Double.parseDouble(scanner.nextLine());
        Student student = new Student(studentId, studentName, studentGender, studentDateOfBirth, className, score);
        return student;

    }
}
