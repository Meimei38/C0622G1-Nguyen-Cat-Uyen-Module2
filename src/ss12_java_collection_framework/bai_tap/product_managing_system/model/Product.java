package ss12_java_collection_framework.bai_tap.product_managing_system.model;

import javax.crypto.spec.PSource;

public class Product {
    private int id;
    private String productName;
    private String brandName;
    private double productPrice;

    public Product() {
    }

    public Product(int id, String productName, String brandName, double productPrice) {
        this.id = id;
        this.productName = productName;
        this.brandName = brandName;
        this.productPrice = productPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return String.format("|%-4s|%-15s|%-10s|%-8.0f|",id,productName,brandName,productPrice);
    }
}
