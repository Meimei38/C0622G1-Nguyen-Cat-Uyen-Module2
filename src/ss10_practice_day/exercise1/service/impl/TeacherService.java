package ss10_practice_day.exercise1.service.impl;

import ss10_practice_day.exercise1.model.Teacher;
import ss10_practice_day.exercise1.service.ITeacherService;
import ss10_practice_day.exercise1.utils.FileReaderUtil;
import ss10_practice_day.exercise1.utils.FileWriterUtil;
import ss10_practice_day.exercise1.utils.exception.IdException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Teacher> teachers = new ArrayList<>();
    private static final String path = "src\\ss10_practice_day\\exercise1\\data\\teacher.txt";

    @Override
    public void addTeacher() throws IOException {
        teachers = FileReaderUtil.readTeacherFile(path);
        Teacher teacher = this.getInfoTeacher();
        teachers.add(teacher);
        FileWriterUtil.writeTeacherFile(path, teachers);
        System.out.println("Nhập thông tin giáo viên thành công!");
    }

    @Override
    public void deleteTeacher() throws IOException {
        teachers = FileReaderUtil.readTeacherFile(path);
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
                FileWriterUtil.writeTeacherFile(path, teachers);
                System.out.println("Xóa đối tượng thành công!");
            }

        }

    }

    @Override
    public void displayTeacher() throws IOException {
        teachers = FileReaderUtil.readTeacherFile(path);
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    public Teacher findTeacher() {
        System.out.println("Vui lòng nhập id giáo viên: ");
        int idTeacher = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getId() == idTeacher) {
                return teachers.get(i);
            }

        }
        return null;
    }

    @Override
    public void findTeacherByName() {
        System.out.println("Nhập thông tin tìm kiếm: ");
        String input = scanner.nextLine();
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getName().contains(input)) {
                System.out.println(teachers.get(i));
            }

        }
        System.out.println("Không tìm thấy đối tượng!");
    }

    @Override
    public void sortByName() throws IOException {
        teachers = FileReaderUtil.readTeacherFile(path);
        boolean isSwap = true;
        Teacher temp;
        for (int i = 0; i < teachers.size() - 1 && isSwap; i++) {
            isSwap = false;
            for (int j = 0; j < teachers.size() - 1 - i; j++) {
                if (teachers.get(j).getName().compareTo(teachers.get(j + 1).getName()) > 0) {
                    isSwap = true;
                    temp = teachers.get(j + 1);
                    teachers.set(j + 1, teachers.get(j));
                    teachers.set(j, temp);

                }

            }

        }
        FileWriterUtil.writeTeacherFile(path, teachers);
        displayTeacher();

    }

    private Teacher getInfoTeacher() {

        int teacherId;
        while (true) {
            try {
                System.out.println("Mời bạn nhập id của giáo viên: ");
                teacherId = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < teachers.size(); i++) {
                    if (teachers.get(i).getId() == teacherId) {
                        throw new IdException("Id bạn nhập đã tồn tại. Vui lòng nhập lại!");
                    }

                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Id bạn nhập không hợp lệ, vui lòng nhập lại!");
            } catch (IdException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Id bạn nhập không hợp lệ, vui lòng nhập lại!");
            }
        }

        String teacherName;
        while (true) {
            try {
                System.out.println("Mời bạn nhập tên của giáo viên ");
                teacherName = scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Dữ liệu bạn nhập không hợp lệ, vui lòng nhập lại!");
            } catch (Exception e) {
                System.out.println("Dữ liệu bạn nhập không hợp lệ, vui lòng nhập lại!");
            }
        }

        String teacherGender;
        while (true) {
            try {
                System.out.println("Mời bạn nhập giới tính của giáo viên: ");
                teacherGender = scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Dữ liệu bạn nhập không hợp lệ, vui lòng nhập lại!");
            } catch (Exception e) {
                System.out.println("Dữ liệu bạn nhập không hợp lệ, vui lòng nhập lại!");
            }
        }

        String teacherDateOfBirth;
        while (true) {
            try {
                System.out.println("Mời bạn nhập ngày tháng năm sinh của giáo viên: ");
                teacherDateOfBirth = scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Dữ liệu bạn nhập không hợp lệ, vui lòng nhập lại!");
            } catch (Exception e) {
                System.out.println("Dữ liệu bạn nhập không hợp lệ, vui lòng nhập lại!");
            }
        }

        String position;
        while (true) {
            try {
                System.out.println("Mời bạn nhập vị trí giáo viên đang đảm nhận: ");
                position = scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Dữ liệu bạn nhập không hợp lệ, vui lòng nhập lại!");
            } catch (Exception e) {
                System.out.println("Dữ liệu bạn nhập không hợp lệ, vui lòng nhập lại!");
            }
        }


        Teacher teacher = new Teacher(teacherId, teacherName, teacherGender, teacherDateOfBirth, position);
        return teacher;
    }


}
