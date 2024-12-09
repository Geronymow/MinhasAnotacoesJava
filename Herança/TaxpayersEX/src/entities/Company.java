package entities;

public final class Company extends Taxpayers {

    private Integer numEmployees;

    public Company() {
        super();
    }

    public Company(String name, Double annualIncome, Integer numEmployees) {
        super(name, annualIncome);
        this.numEmployees = numEmployees;
    }

    public Integer getNumEmployees() {
        return numEmployees;
    }

    public void setNumEmployees(Integer numEmployees) {
        this.numEmployees = numEmployees;
    }

    @Override
    public Double calculateTax() {
        double totalValue = 0.0;
        double tax = 0.0;
        if (getNumEmployees() > 10) {
            tax = 0.14;
        } else {
            tax = 0.16;
        }
        totalValue = getAnnualIncome() * tax;
        setAnnualIncome(totalValue);

        return getAnnualIncome();
    }

    @Override
    public String summary() {
        return getName() + ": $ " + String.format("%.2f",getAnnualIncome());
    }

}
