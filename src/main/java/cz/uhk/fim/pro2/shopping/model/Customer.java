package cz.uhk.fim.pro2.shopping.model;

public class Customer {
    private String username;
    private String email;
    private String password;
    private double budget;
    private int customerId;
    private Address address;
    private ShoppingCart cart;
    private boolean vatPayer;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public void setCart(ShoppingCart cart) {
        this.cart = cart;
    }

    public boolean isVatPayer() {
        return vatPayer;
    }

    public void setVatPayer(boolean vatPayer) {
        this.vatPayer = vatPayer;
    }

    public Customer(String username, String email, String password, double budget, int customerId, Address address, ShoppingCart cart, boolean vatPayer) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.budget = budget;
        this.customerId = customerId;
        this.address = address;
        this.cart = cart;
        this.vatPayer = vatPayer;
    }

    public Customer() {
    }
}
