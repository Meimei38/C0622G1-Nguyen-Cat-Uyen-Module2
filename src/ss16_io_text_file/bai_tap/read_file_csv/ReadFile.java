package ss16_io_text_file.bai_tap.read_file_csv;

import ss16_io_text_file.bai_tap.copy_file_text.ReadAndWriteFile;
import ss16_io_text_file.bai_tap.read_file_csv.model.Nation;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public void readFile(String filePath) {
        List<Nation> nations = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] list = line.split(",");
                int id = Integer.parseInt(list[0]);
                String acronym = list[1];
                String name = list[2];
                Nation nation = new Nation(id, acronym, name);
                nations.add(nation);
            }
            for (int i = 0; i < nations.size(); i++) {
                System.out.println(nations.get(i));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }


    }

    public static void main(String[] args) {
       ReadFile readFile = new ReadFile();
       readFile.readFile("src\\ss16_io_text_file\\bai_tap\\read_file_csv\\data\\nation_list.csv");
    }
}

