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

    private static List<String> readTargetFile(String path) {
        List<String> lines = new ArrayList<>();
        try {
            File file = new File(path);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            lines = (List<String>) objectInputStream.readObject();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.getStackTrace();
        }
        return lines;
    }

    public static List<String> readSourceFile(String filePath) {
        List<String> inputList = new ArrayList<>();
        try {
            File file = new File(filePath);
            if ((!file.exists())) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                inputList.add(line);
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found!");
        } catch (Exception e) {
            System.out.println("Error!");
        }
        return inputList;

    }


    public static void main(String[] args) {
        String sourceFile = "src\\ss17_binary_serialization\\bai_tap\\copy_binary_file\\data\\source_file.txt";
        String targetFile = "src\\ss17_binary_serialization\\bai_tap\\copy_binary_file\\data\\target_file.dat";

        List<String> content = readSourceFile(sourceFile);
        writeFile(targetFile,content);
        System.out.println(readTargetFile(targetFile));


    }
}
