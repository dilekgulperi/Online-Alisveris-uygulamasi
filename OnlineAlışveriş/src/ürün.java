public class ürün {
    private String name;
    private double price;

    public ürün(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void displayProduct() {
        System.out.println(name + " - $" + price);
    }
}


