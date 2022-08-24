package ss17_binary_serialization.bai_tap.product_managing_in_binary_file.util.read_write;

import ss17_binary_serialization.bai_tap.product_managing_in_binary_file.model.Product;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class WriteFile {
    public static void writeFile(String path, List<Product> products)  {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
