package entities;

public class Product {

    private String ProductName;
    private Double ProductPrice;

    public Product() {
    }

    public Product(String ProductName, Double ProductPrice) {
        this.ProductName = ProductName;
        this.ProductPrice = ProductPrice;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        this.ProductName = productName;
    }

    public Double getProductPrice() {
        return ProductPrice;
    }

}
