package entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public Product() {
        /* Construtor padrão */
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;

        /* Acima foi criado o construtor, seu papel no programa gira em torno
        de garantir que "Product" tenha os seus dados. Ele protege de não ser criado um produto
        que não tenha preço, nome, etc... */
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        /* A sobrecarga oferece mais de uma operação com o mesmo nome,
        porém com outra lista de parâmetros. */
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