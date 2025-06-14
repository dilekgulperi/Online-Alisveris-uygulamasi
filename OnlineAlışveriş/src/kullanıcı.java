public class kullanıcı {
    private String name;
    private String password;
    private Cart cart;

    public kullanıcı(String name, String password) {
        this.name = name;
        this.password = password;
        this.cart = new Cart();
    }

    public String getName() {
        return name;
    }

    public Cart getCart() {
        return cart;
    }

    public boolean checkPassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }
}
