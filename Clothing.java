// Clothing.java
public class Clothing extends Product {
    private String size;

    public Clothing(String name, double price, int productID, String size) {
        super(name, price, productID);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Ukuran: " + size;
    }
}
