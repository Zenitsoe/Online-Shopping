// Electronics.java
public class Electronics extends Product {
    private int warrantyMonths;

    public Electronics(String name, double price, int productID, int warrantyMonths) {
        super(name, price, productID);
        this.warrantyMonths = warrantyMonths;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Garansi: " + warrantyMonths + " bulan";
    }
}
