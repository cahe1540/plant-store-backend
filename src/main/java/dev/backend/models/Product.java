package dev.backend.models;

public class Product {
    private int productId;
    private String description;
    private double price;
    private String image;
    private double discount;
    private int stock;

    public Product(){};

    public Product(int productId, String description, double price, String image, double discount, int stock) {
        this.productId = productId;
        this.description = description;
        this.price = price;
        this.image = image;
        this.discount = discount;
        this.stock = stock;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", image='" + image + '\'' +
                ", discount=" + discount +
                ", stock=" + stock +
                '}';
    }
}
