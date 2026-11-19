public class Sneaker {
    private String brand;
    private double size;
    private double price;
    private static int totalPairs;

    public Sneaker(String brand, double size, double price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
        totalPairs++;
    }

    // TODO: return the brand
    public String getBrand() {
        return null;
    }

    // TODO: return the size
    public double getSize() {
        return 0.0;
    }

    // TODO: return the price
    public double getPrice() {
        return 0.0;
    }

    // TODO: lower the price by the given percent
    public void discount(double percent) {
    }

    // TODO: return how many Sneaker objects have been created
    public static int getTotalPairs() {
        return 0;
    }

    // TODO: return a String that describes this sneaker
    public String toString() {
        return null;
    }
}
