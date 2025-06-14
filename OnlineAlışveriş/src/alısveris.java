import java.util.Scanner;

public class alısveris extends anasayfa {
    private kullanıcı user;
    private ürün[] products;

    public alısveris(kullanıcı user) {
        this.user = user;
        this.products = new ürün[] {
            new ürün("Telefon", 7000),
            new ürün("Kulaklık", 500),
            new ürün("Klavye", 800),
            new ürün("Laptop", 12000)
        };
    }

    @Override
    public void Ürünler() {
        try (Scanner scanner = new Scanner(System.in)) {
			int secim;

			do {
			    System.out.println("\n--- Menü ---");
			    System.out.println("1. Ürünleri Listele");
			    System.out.println("2. Sepete Ürün Ekle");
			    System.out.println("3. Sepeti Göster");
			    System.out.println("4. Sepetten Ürün Sil");
			    System.out.println("5. Sepeti Temizle");
			    System.out.println("6. Çıkış Yap");
			    System.out.print("Seçiminiz: ");
			    secim= scanner.nextInt();

			    switch (secim) {
			        case 1:
			            listProducts();
			            break;
			        case 2:
			            listProducts();
			            System.out.print("Eklemek istediğiniz ürün numarası: ");
			            int index = scanner.nextInt();
			            if (index >= 1 && index <= products.length) {
			                user.getCart().addProduct(products[index - 1]);
			            } else {
			                System.out.println("Geçersiz ürün numarası.");
			            }
			            break;
			        case 3:
			            user.getCart().showCart();
			            break;
			        case 4:
			            user.getCart().showCart();
			            if (user.getCart().getSize() > 0) {
			                System.out.print("Silmek istediğiniz ürün numarası: ");
			                int delIndex = scanner.nextInt();
			                user.getCart().removeProduct(delIndex - 1);
			            }
			            break;
			        case 5:
			            user.getCart().clearCart();
			            break;
			        case 6:
			            System.out.println("Çıkış yapılıyor. Teşekkürler!");
			            break;
			        default:
			            System.out.println("Geçersiz seçim.");
			    }

			} while (secim != 6);
		}
    }

    private void listProducts() {
        System.out.println("\n--- Ürünler ---");
        for (int i = 0; i < products.length; i++) {
            System.out.print((i + 1) + ". ");
            products[i].displayProduct();
        }
    }
}

