package entities;

public final class Product {

    private String name;
    private Double priceUnit;
    private Integer unit;

    public Product(String name, Double priceUnit, Integer unit) {
        this.name = name;
        this.priceUnit = priceUnit;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(Double priceUnit) {
        this.priceUnit = priceUnit;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public double totalPrice() {
        return unit * priceUnit;
    }

    public String initial() {
        return name + ", " + String.format("%.2f",priceUnit) + ", " + unit;
    }

    public String summary() {
        return name + ", " + String.format("%.2f",totalPrice());
    }
}
