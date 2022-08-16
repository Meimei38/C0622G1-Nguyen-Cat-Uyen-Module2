package ss12_java_collection_framework.bai_tap.product_managing_system.service.impl;

import ss12_java_collection_framework.bai_tap.product_managing_system.model.Product;
import ss12_java_collection_framework.bai_tap.product_managing_system.service.IProductManagingService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagingService implements IProductManagingService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "Samsung A12", "Samsung", 3500000));
        products.add(new Product(2, "Samsung A13", "Samsung", 4500000));
        products.add(new Product(3, "Iphone 11", "Iphone", 7500000));
        products.add(new Product(4, "Samsung A25", "Samsung", 9500000));
        products.add(new Product(5, "Iphone 13", "Iphone", 1500000));
    }

    @Override
    public void add() {
        System.out.println("Vui lòng nhập thông tin sản phẩm: ");
        System.out.print("Id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Tên hãng sản xuất: ");
        String brand = scanner.nextLine();
        System.out.print("Giá sản phẩm: ");
        double price = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id, name, brand, price);
        products.add(product);

    }

    @Override
    public void display() {
        for (Product product : products) {
            System.out.println(product);
        }

    }

    @Override
    public void delete() {
        Product product = this.findProduct();
        if (product != null) {
            System.out.println("Bạn chắc chắn muốn xóa sản phẩm " + product.getProductName() + " với id " + product.getId() + " không?");
            System.out.println("1. Có \n2.Không");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                products.remove(product);
                System.out.println("Xóa thành công!");
            }
        }
    }

    @Override
    public void searchByName() {
        List<Product> searchResult = new ArrayList<>();
        System.out.print("Vui lòng nhập thông tin: ");
        String input = scanner.nextLine();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProductName().contains(input)) {
                searchResult.add(products.get(i));
            }

        }
        if (searchResult.size() == 0) {
            System.out.println("Không tìm thấy sản phẩm!");
        } else {
            for (int i = 0; i < searchResult.size(); i++) {
                System.out.println(searchResult.get(i));

            }
        }
    }

    @Override
    public void edit() {
        Product product = findProduct();
        System.out.println("Vui lòng chọn thông tin cần thay đổi: ");
        System.out.println("1. Thay đổi id: ");
        System.out.println("2. Thay đổi tên sản phẩm: ");
        System.out.println("3. Thay đổi tên hãng: ");
        System.out.println("4. Thay đổi giá sản phẩm: ");
        System.out.println("5. Thoát");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                product.setId(Integer.parseInt(getEditInfo("Id")));
                break;
            case 2:
                product.setProductName(getEditInfo("Product Name"));
                break;
            case 3:
                product.setBrandName(getEditInfo("Brand Name"));
                break;
            case 4:
                product.setProductPrice(Double.parseDouble(getEditInfo("Price")));
                break;
            case 5:
                return;
            default:
                System.out.println("Lựa chọn của bạn không đúng!");
        }

    }

    private String getEditInfo(String editContent) {
        System.out.println("Vui lòng nhập " + editContent + "mới: ");
        return scanner.nextLine();


    }

    private Product findProduct() {
        System.out.print("Vui lòng nhập id sản phẩm: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                return products.get(i);
            }

        }
        return null;
    }

}
