package ss10_practice_day.exercise1.service.impl;

import ss10_practice_day.exercise1.utils.IdException;
import ss10_practice_day.exercise1.utils.PointException;
import ss10_practice_day.exercise1.model.Student;
import ss10_practice_day.exercise1.service.IStudentService;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Student> students = new ArrayList<>();

    static {
        students.add(new Student(1, "Nguyễn Thanh Hải", "Nam", "12/12/1222", "C06", 9.5));
        students.add(new Student(2, "Lê Bá Hoàng Giang", "Nam", "10/10/1010", "C05", 9.5));
        students.add(new Student(3, "Phạm Thế Sơn", "Nữ", "06/06/2006", "C04", 9.5));
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
        Student student = this.findStudent();
        if (student == null) {
            System.out.println("Không tìm thấy đối tượng cần xóa ");
        } else {
            System.out.println("Bạn có chắc chắc muốn xóa học sinh mang id " + student.getId() + " không?");
            System.out.println("1. Có");
            System.out.println("2. Không");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                students.remove(student);
                System.out.println("Xóa đối tượng thành công!");
            }
        }

    }

    public Student findStudent() {
        System.out.println("Vui lòng nhập id học sinh: ");
        int studentId = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == studentId) {
                return (students.get(i));
            }

        }
        return null;
    }

    @Override
    public void findStudentByName() {
        System.out.println("Mời bạn nhập thông tin để tìm kiếm: ");
        String input = scanner.nextLine();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().contains(input)) {
                System.out.println(students.get(i));
            }

        }
        System.out.println("Không tìm thấy đối tượng!");
    }

    @Override
    public void sortByName() {
        boolean isSwap = true;
        Student temp;
        for (int i = 0; i < students.size() - 1 && isSwap; i++) {
            isSwap = false;
            for (int j = 0; j < students.size() - 1 - i; j++) {
                if (students.get(j).getName().compareTo(students.get(j + 1).getName()) > 0) {
                    isSwap = true;
                    temp = students.get(j + 1);
                    students.set(j + 1, students.get(j));
                    students.set(j, temp);

                }

            }

        }
        displayStudentList();


    }

    public Student getInfoStudent() {
        int studentId;
        while (true) {
            try {
                System.out.println("Mời bạn nhập id của học sinh: ");
                studentId = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).getId() == studentId) {
                        throw new IdException("Id này đã tồn tại!");
                    }
                }
                break;

            } catch (NumberFormatException e) {
                System.out.println("Id bạn nhập không phải là số, vui lòng nhập lại!");
            } catch (IdException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Id bạn nhập không hợp lệ!");
            }
        }
        String studentName;
        
        while (true) {
            try {
                System.out.println("Mời bạn nhập tên của học sinh ");
                studentName = scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Thông tin bạn nhập không hợp lệ, vui lòng nhập lại!");
            } catch (Exception e) {
                System.out.println("Thông tin bạn nhập không hợp lệ, vui lòng nhập lại!");
            }
        }

        String studentGender;
        while (true) {
            try {
                System.out.println("Mời bạn nhập giới tính của học sinh: ");
                studentGender = scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Thông tin bạn nhập không hợp lệ, vui lòng nhập lại!");
            } catch (Exception e) {
                System.out.println("Thông tin bạn nhập không hợp lệ, vui lòng nhập lại!");
            }
        }

        String studentDateOfBirth;
        while (true) {
            try {
                System.out.println("Mời bạn nhập ngày tháng năm sinh của học sinh: ");
                studentDateOfBirth = scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Thông tin bạn nhập không hợp lệ, vui lòng nhập lại!");
            } catch (Exception e) {
                System.out.println("Thông tin bạn nhập không hợp lệ, vui lòng nhập lại!");
            }
        }
        String className;
        while (true) {
            try {
                System.out.println("Mời bạn nhập tên lớp: ");
                className = scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Thông tin bạn nhập không hợp lệ, vui lòng nhập lại!");
            } catch (Exception e) {
                System.out.println("Thông tin bạn nhập không hợp lệ, vui lòng nhập lại!");
            }
        }


        double score;
        while (true) {
            try {
                System.out.println("Mời bạn nhập điểm: ");
                score = Double.parseDouble(scanner.nextLine());
                if (score < 0 || score > 10) {
                    throw new PointException("Điểm bạn nhập không hợp lệ!");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Điểm phải là số, vui lòng nhập lại");
            } catch (PointException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Điểm của bạn nhập không hợp lệ!");
            }
        }

        Student student = new Student(studentId, studentName, studentGender, studentDateOfBirth, className, score);
        return student;

    }
}
