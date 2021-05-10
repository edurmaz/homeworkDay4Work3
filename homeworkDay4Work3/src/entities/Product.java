package entities;

public class Product {
    int id;
    String productName;
    String getProductType;
    int productPrice;

    public Product(int id, String productName, String getProductType, int productPrice) {
        this.id = id;
        this.productName = productName;
        this.getProductType = getProductType;
        this.productPrice = productPrice;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getGetProductType() {
        return this.getProductType;
    }

    public void setGetProductType(String getProductType) {
        this.getProductType = getProductType;
    }

    public int getProductPrice() {
        return this.productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }
}