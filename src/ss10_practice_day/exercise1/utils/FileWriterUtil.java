package ss10_practice_day.exercise1.utils;

import ss10_practice_day.exercise1.model.Student;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileWriterUtil {
    private static void writeFile(String path, String data) throws IOException {
        File file = new File(path);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
        bufferedWriter.write(data);
        bufferedWriter.close();
    }

    public static void writeStudentFile(String path, List<Student> students) throws IOException {
        String data = "";
        for (Student student : students) {
            data += student.toString() +"\n";
        }
        writeFile(path, data);
    }
}
