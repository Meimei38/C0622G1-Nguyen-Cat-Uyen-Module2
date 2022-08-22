package ss10_practice_day.exercise1.utils;

import ss10_practice_day.exercise1.model.Student;
import ss10_practice_day.exercise1.model.Teacher;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReaderUtil {
    private static List<String> readFile(String path) throws IOException {
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        List<String> strings = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            strings.add(line);
        }
        bufferedReader.close();

        return strings;
    }

    public static List<Student> readStudentFile(String path) throws IOException {
        List<String> strings = readFile(path);
        List<Student> students = new ArrayList<>();
        String[] info;
        for (String line : strings) {
            info = line.split(",");
            Student student = new Student(Integer.parseInt(info[0]),info[1],info[2],info[3],info[4],Double.parseDouble(info[5]));
            students.add(student);
        }
        return students;

    }
    public static List<Teacher> readTeacherFile(String path) throws IOException {
        List<String> strings = readFile(path);
        List<Teacher> teachers = new ArrayList<>();
        String [] info;
        for (String line:strings){
            info=line.split(",");
            Teacher teacher = new Teacher(Integer.parseInt(info[0]),info[1],info[2],info[3],info[4]);
            teachers.add(teacher);
        }
        return teachers;
    }
}
