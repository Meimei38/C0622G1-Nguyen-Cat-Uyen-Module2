package ss16_io_text_file.thuc_hanh.sum_of_numbers_in_a_file;

import ss13_searching_algorithm.bai_tap.find_longest_ascending_string.FindLongestAscendingString;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileExample {
    public static void main(String[] args) {
        String path= "src\\ss16_io_text_file\\thuc_hanh\\sum_of_numbers_in_a_file\\data\\numbers.txt";
        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);
    }

    private void readFileText(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            /*FileReader fileReader= new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);*/
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.println("Tổng các số trong file: " + sum);
    }catch (FileNotFoundException e){
            System.out.println("File không tồn tại");
        }catch (Exception e){
            System.out.println("File có lỗi");
        }
    }
}

