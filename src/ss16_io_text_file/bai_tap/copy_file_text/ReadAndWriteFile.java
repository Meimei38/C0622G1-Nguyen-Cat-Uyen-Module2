package ss16_io_text_file.bai_tap.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<String> readFile(String filePath){
        List<String> inputList = new ArrayList<>();
        try {
            File file = new File(filePath);
            if((!file.exists())){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader= new BufferedReader(new FileReader(filePath));
            String line;
            while ((line=bufferedReader.readLine())!= null){
                inputList.add(line);
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        }catch (Exception e){
            System.out.println("File bị lỗi");
        }
        return inputList;

    }
    public void writeFile(List<String> inputList, String filePath){ ;

        try {
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i <inputList.size() ; i++) {
                bufferedWriter.write(inputList.get(i));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();

        }catch (IOException e) {
            e.printStackTrace();
        }


    }
}
