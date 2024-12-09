package entities;

public final class ImportedProduct extends Product {

    private Double customsFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag() {
        return name + " $ " + String.format("%.2f",totalPrice(price)) +
                (" (customs fee: $ " + String.format("%.2f",customsFee) + ")");
    }

    public double totalPrice(double price) {
        return price + customsFee;
    }

}
