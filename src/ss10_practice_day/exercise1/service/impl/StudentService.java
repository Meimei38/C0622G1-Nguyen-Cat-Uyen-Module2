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
        students.add(new Student(1, "Meimei", "Nữ", "12/12/1222", "C06", 9.5));
        students.add(new Student(2, "Jinjin", "Nam", "10/10/1010", "C05", 9.5));
        students.add(new Student(3, "Funla", "Nữ", "06/06/2006", "C04", 9.5));
    }

    @Override
    public void addStudent() {
        Student student = this.getInfoStudent();
        students.add(student);
        System.out.println("Thêm mới học sinh thành công!");


    }

    @Override
    public void displayStudentList() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Override
    public void deleteStudent() {
        Student student=this.findStudent();
       if(student==null){
           System.out.println("Không tìm thấy đối tượng cần xóa ");
       }else {
           System.out.println("Bạn có chắc chắc muốn xóa học sinh mang id "+student.getId()+" không?");
           System.out.println("1. Có");
           System.out.println("2. Không");
           int choice = Integer.parseInt(scanner.nextLine());
           if(choice==1){
               students.remove(student);
               System.out.println("Xóa đối tượng thành công!");
           }
       }

    }

    public Student findStudent() {
        System.out.println("Vui lòng nhập id học sinh: ");
        int studentId= Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <students.size() ; i++) {
            if(students.get(i).getId()==studentId){
                return (students.get(i));
            }

        }
        return null;
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
