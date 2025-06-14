import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
		
			kullanıcı user = new kullanıcı("gülperi", "1234");

			System.out.print("Kullanıcı adınızı girin: ");
			String inputName = scanner.nextLine();
			System.out.print("Şifrenizi girin: ");
			String inputPassword = scanner.nextLine();

			if (user.getName().equals(inputName) && user.checkPassword(inputPassword)) {
			    System.out.println("Giriş başarılı. Hoş geldin, " + user.getName() + "!");
			    alısveris session = new alısveris(user);
			    session.Ürünler();
			} else {
			    System.out.println("Hatalı kullanıcı adı veya şifre.");
			}
		}
    }
}

