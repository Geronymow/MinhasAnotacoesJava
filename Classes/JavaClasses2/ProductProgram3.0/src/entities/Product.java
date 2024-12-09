package entities;

public class Product {

    private String name;
    private double price;
    private int quantity;

    /* Private determina que esses atributos não podem ser utilizados por outras classes, apenas
    o uso de métodos pré-estabelecidos (set*Atributo* e get*Atributo*) onde o "set" recebe o valor
    para o atributo e get retorna o valor. */

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
        // "set" recebe.
    }

    public double getPrice() {
        return price;
        // "get" retorna.
    }

    public int getQuantity() {
        return quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}