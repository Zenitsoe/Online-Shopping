// MainApp.java
public class MainApp {
    public static void main(String[] args) {
        // Membuat objek Electronics
        Electronics laptop = new Electronics("Laptop ASUS", 899.99, 101, 12);

        // Membuat objek Clothing
        Clothing shirt = new Clothing("T-Shirt Polos", 25.50, 205, "M");

        // Mencetak informasi produk Electronics
        System.out.println("Informasi Produk Elektronik:");
        System.out.println(laptop.getInfo());
        System.out.println();

        // Mencetak informasi produk Clothing
        System.out.println("Informasi Produk Pakaian:");
        System.out.println(shirt.getInfo());
    }
}
