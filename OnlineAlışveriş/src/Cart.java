import java.util.ArrayList;

public class Cart {
    private ArrayList<ürün> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public void addProduct(ürün product) {
        items.add(product);
        System.out.println(product.getName() + " sepete eklendi.");
    }

    public void removeProduct(int index) {
        if (index >= 0 && index < items.size()) {
            ürün removed = items.remove(index);
            System.out.println(removed.getName() + " sepetten silindi.");
        } else {
            System.out.println("Geçersiz ürün numarası.");
        }
    }

    public void clearCart() {
        items.clear();
        System.out.println("Sepet temizlendi.");
    }

    public void showCart() {
        if (items.isEmpty()) {
            System.out.println("Sepet boş.");
            return;
        }

        System.out.println("Sepetiniz:");
        double total = 0;
        for (int i = 0; i < items.size(); i++) {
            ürün p = items.get(i);
            System.out.println((i + 1) + ". " + p.getName() + " - $" + p.getPrice());
            total += p.getPrice();
        }
        System.out.println("Toplam: $" + total);
    }

    public int getSize() {
        return items.size();
    }
}

