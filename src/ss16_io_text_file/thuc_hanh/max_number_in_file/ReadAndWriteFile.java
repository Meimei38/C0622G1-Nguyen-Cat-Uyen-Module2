package ss16_io_text_file.thuc_hanh.max_number_in_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath){
        List<Integer> numbers= new ArrayList<>();
        try{
            File file= new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
            String line;
            while ((line=bufferedReader.readLine())!= null){
                numbers.add(Integer.parseInt(line));
            }
            bufferedReader.close();
        }catch (FileNotFoundException e){
            System.out.println("Không tìm thấy file");
        }catch (Exception e){
            System.out.println("File bị lỗi");
        }
        return numbers;
    }
    public void writeFile(String filePath, int max) {
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Giá trị lớn nhất là: " + max);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

