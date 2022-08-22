package ss16_io_text_file.thuc_hanh.max_number_in_file;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 0; i <numbers.size() ; i++) {
            if(numbers.get(i)>max){
                max=numbers.get(i);
            }

        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("src\\ss16_io_text_file\\thuc_hanh\\max_number_in_file\\data\\numbers.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("src\\ss16_io_text_file\\thuc_hanh\\max_number_in_file\\data\\result.txt",maxValue);
    }
}
