package entities;

public class OrderItem {

    private Integer orderQuant;
    private double orderPrice;
    private Product product;

    public OrderItem() {
    }

    public OrderItem(Integer orderQuant, double orderPrice, Product product) {
        this.orderQuant = orderQuant;
        this.orderPrice = orderPrice;
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getOrderQuant() {
        return orderQuant;
    }

    public void setOrderQuant(Integer orderQuant) {
        this.orderQuant = orderQuant;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public double subTotal(){
        return orderQuant * orderPrice;
    }

    public String toString() {
        return getProduct().getProductName() +
                ", $" +
                String.format("%.2f", getOrderPrice()) +
                ", " +
                "Quantity: " +
                getOrderQuant() +
                ", " +
                "Subtotal: $" + String.format("%.2f", subTotal());
    }

}
