package ss16_io_text_file.bai_tap.copy_file_text;

import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<String> inputList = readAndWriteFile.readFile("src\\ss16_io_text_file\\bai_tap\\copy_file_text\\data\\source_file.txt");
        readAndWriteFile.writeFile(inputList, "src\\ss16_io_text_file\\bai_tap\\copy_file_text\\data\\target_file.txt");
    }
}
