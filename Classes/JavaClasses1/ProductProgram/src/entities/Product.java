package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
        // "this" faz referência para o atributo da Classe
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        /* "to String" é usado para fornecer uma representação em
        formato de string do objeto em questão */
        return name
                + ", $ "
                + String.format("%.2f", price)
                // Formata o número de casas decimais do String
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
