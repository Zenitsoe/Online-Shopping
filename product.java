public class Product {
    private String name;
    private double price;
    private int productID;

    public Product(String name, double price, int productID) {
        this.name = name;
        this.price = price;
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getInfo() {
        return name + " - " + String.format("%.2f", price) + " Euro";
    }
}
