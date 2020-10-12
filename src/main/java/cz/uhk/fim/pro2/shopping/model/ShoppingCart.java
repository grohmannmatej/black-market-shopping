package cz.uhk.fim.pro2.shopping.model;

import java.util.List;

public class ShoppingCart {
    private int cartId;
    private List<Child> childList;
    private double vat;
    private double fee;
    private double subtotal;
    private double total;

    public ShoppingCart() {
    }

    public ShoppingCart(int cartId, List<Child> childList, double vat, double fee, double subtotal, double total) {
        this.cartId = cartId;
        this.childList = childList;
        this.vat = vat;
        this.fee = fee;
        this.subtotal = subtotal;
        this.total = total;
    }

    public void addChild(){

    }

    public void removeChild(int index){

    }

    public void removeChild(Child child){

    }

    public void clearCart(){

    }

    public int getChildCount() {
        return 0;
    }

    public double calculateTotal(){
        return 0.0;
    }

    public double calculateSubtotal(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "cartId=" + cartId +
                ", childList=" + childList +
                ", vat=" + vat +
                ", fee=" + fee +
                ", subtotal=" + subtotal +
                ", total=" + total +
                '}';
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public void setChildList(List<Child> childList) {
        this.childList = childList;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getCartId() {
        return cartId;
    }

    public List<Child> getChildList() {
        return childList;
    }

    public double getVat() {
        return vat;
    }

    public double getFee() {
        return fee;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getTotal() {
        return total;
    }
}
