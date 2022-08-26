package ss17_binary_serialization.bai_tap.product_managing_in_binary_file.service.impl;

import ss17_binary_serialization.bai_tap.product_managing_in_binary_file.model.Product;
import ss17_binary_serialization.bai_tap.product_managing_in_binary_file.service.IProductService;
import ss17_binary_serialization.bai_tap.product_managing_in_binary_file.util.exception.IdException;
import ss17_binary_serialization.bai_tap.product_managing_in_binary_file.util.read_write.ReadFile;
import ss17_binary_serialization.bai_tap.product_managing_in_binary_file.util.read_write.WriteFile;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    public static final String PATH = "src\\ss17_binary_serialization\\bai_tap\\product_managing_in_binary_file\\data\\product_data.dat";
    private static Scanner scanner = new Scanner(System.in);
    List<Product> products = new ArrayList<>();

    @Override
    public void addProduct() {
        products = ReadFile.readFile(PATH);
        String code;
        while (true) {
            try {
                System.out.println("Enter product code: ");
                code = scanner.nextLine();
                if (code.isEmpty() || code.equals(" ")) {
                    throw new RuntimeException();
                }
                for (int i = 0; i < products.size(); i++) {
                    if (products.get(i).getProductCode().equals(code)) {
                        throw new IdException();
                    }
                }

                break;
            } catch (RuntimeException e) {
                System.out.println("Empty input! Please add information!");
            } catch (IdException e) {
                System.out.println("Invalid product code! Please try again!");
            } catch (Exception e) {
                e.getStackTrace();
            }
        }


        String productName = getStringInfo("productName");
        String brand = getStringInfo("brand");
        double price;
        while (true) {
            try {
                System.out.println("Enter product price: ");
                price = Double.parseDouble(scanner.nextLine());

                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please try again!");
            } catch (Exception e) {
                e.getStackTrace();
            }
        }

        String details = getStringInfo("other details");


        products.add(new Product(code, productName, brand, price, details));
        WriteFile.writeFile(PATH, products);

    }

    @Override
    public void displayProduct() {
        try {
            FileInputStream fileInputStream = new FileInputStream(PATH);

            if (fileInputStream.available() == 0) {
                throw new EOFException();
            } else {
                System.out.println(ReadFile.readFile(PATH));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (EOFException e) {
            System.out.println("Empty file!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void searchProduct() {
        products = ReadFile.readFile(PATH);
        System.out.println("Enter information to start searching: ");
        String input = scanner.nextLine();
        List<Product> searchResult = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProductCode().contains(input)
                    || products.get(i).getProductName().contains(input)
                    || products.get(i).getBrand().contains(input)
                    || String.valueOf(products.get(i).getPrice()).contains(input)
                    || products.get(i).getOtherDetails().contains(input)) {
                searchResult.add(products.get(i));
            }
        }
        if (searchResult.isEmpty()) {
            System.out.println("No result!");
        } else {
            System.out.println(searchResult.toString());
        }

    }

    public String getStringInfo(String param) {
        String input;
        while (true) {
            try {
                System.out.println("Enter " + param);
                input = scanner.nextLine();
                if (param.isEmpty() || param.equals(" ")) {
                    throw new RuntimeException();
                }
                break;
            } catch (RuntimeException e) {
                System.out.println("Empty input! Please add information");
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
        return input;
    }
}
