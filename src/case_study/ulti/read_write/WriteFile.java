package case_study.ulti.read_write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFile {
    public static void writeFile(String src, List<String>list){
        try {
            FileWriter fileWriter = new FileWriter(src);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i <list.size() ; i++) {
                bufferedWriter.write(list.get(i));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
