package ss17_binary_serialization.bai_tap.copy_binary_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyBinaryFile {
    public static void writeFile(String path, List<String> lines) {
        try {
            File file = new File(path);
            if (!file.exists()) {
                System.out.println("Target file not Found! The system will create a new file");
                file.createNewFile();
            } else {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(lines);
                fileOutputStream.close();
                objectOutputStream.close();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static List<String> readFile(String path) {
        List<String> lines = new ArrayList<>();
        try {
            File file = new File(path);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            lines= (List<String>) objectInputStream.readObject();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return lines;
    }



    public static void main(String[] args) {
        String sourceFile = "src\\ss17_binary_serialization\\bai_tap\\copy_binary_file\\data\\source_file.txt";
        String targetFile ="src\\ss17_binary_serialization\\bai_tap\\copy_binary_file\\data\\target_file.dat";

        List<String> content = CopyBinaryFile.readFile(sourceFile);
        CopyBinaryFile.writeFile(targetFile,content);


    }
}
