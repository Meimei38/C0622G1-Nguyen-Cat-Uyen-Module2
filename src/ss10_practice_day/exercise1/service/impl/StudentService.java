package ss10_practice_day.exercise1.service.impl;

import ss10_practice_day.exercise1.model.Person;
import ss10_practice_day.exercise1.utils.FileReaderUtil;
import ss10_practice_day.exercise1.utils.FileWriterUtil;
import ss10_practice_day.exercise1.utils.exception.IdException;
import ss10_practice_day.exercise1.utils.exception.NameException;
import ss10_practice_day.exercise1.utils.exception.PointException;
import ss10_practice_day.exercise1.model.Student;
import ss10_practice_day.exercise1.service.IStudentService;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class StudentService implements IStudentService {
    private static Scanner scanner = new Scanner(System.in);
    private static final String path = "src\\ss10_practice_day\\exercise1\\data\\student.txt";
    private static List<Student> students;
    public final String NAME_REGEX = "^\\p{Lu}\\p{Ll}+(\\s\\p{Lu}\\p{Ll}+)*$";


    @Override
    public void addStudent() throws IOException {
        students = FileReaderUtil.readStudentFile(path);
        Student student = this.getInfoStudent();
        students.add(student);
        FileWriterUtil.writeStudentFile(path, students);
        System.out.println("Thêm mới học sinh thành công!");


    }

    @Override
    public void displayStudentList() throws IOException {
        students = FileReaderUtil.readStudentFile(path);
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Override
    public void deleteStudent() throws IOException {
        students = FileReaderUtil.readStudentFile(path);
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
                FileWriterUtil.writeStudentFile(path, students);
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
    public void sortByName() throws IOException {
        students = FileReaderUtil.readStudentFile(path);
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
        if (students.size() == 0) {
            studentId = 1;
        } else {
            studentId = (students.get(students.size() - 1).getId()) + 1;
        }
        /*while (true) {
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
*/
        String studentName;

        while (true) {
            try {
                System.out.println("Mời bạn nhập tên của học sinh ");
                studentName = scanner.nextLine();
                if (!(studentName.matches(NAME_REGEX))) {
                    throw new NameException("Tên bạn nhập sai định dạng.Vui lòng nhập lại.");
                }
                break;
            } catch (NameException e) {
                System.out.println(e.getMessage());
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
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        simpleDateFormat.setLenient(false);
        Date checkFormat;
        Date now;
        String stringNow;


        while (true) {
            try {
                System.out.println("Mời bạn nhập ngày tháng năm sinh của học sinh: ");
                studentDateOfBirth = scanner.nextLine();
                //check dữ liệu nhập vào
                checkFormat = simpleDateFormat.parse(studentDateOfBirth);
                //thời gian hiện tại
                now = new Date();
                //format thành thời gian hiện tại
                stringNow = simpleDateFormat.format(now);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ngày sinh phải có định dạng dd/MM/yyyy");
            } catch (ParseException e) {
                System.out.println("Thông tin bạn nhập vào không hợp lệ. Vui lòng nhập lại!");

            } catch
            (InputMismatchException e) {
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
