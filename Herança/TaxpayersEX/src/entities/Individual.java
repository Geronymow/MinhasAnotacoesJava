package entities;

public final class Individual extends Taxpayers {

    private Double healthSpending;

    public Individual() {
        super();
    }

    public Individual(String name, Double annualIncome, Double healthSpending) {
        super(name, annualIncome);
        this.healthSpending = healthSpending;
    }

    public Double getHealthSpending() {
        return healthSpending;
    }

    public void setHealthSpending(Double healthSpending) {
        this.healthSpending = healthSpending;
    }

    @Override
    public Double calculateTax() {

        /* double basicTax = (getAnualIncome() < 20000.0) ?
        getAnualIncome() * 0.15 : getAnualIncome() * 0.25;
         */

        double basicTax;
        if (getAnnualIncome() < 20000.0) {
            basicTax = getAnnualIncome() * 0.15;
            setAnnualIncome(basicTax);
        }
        else {
            basicTax = getAnnualIncome() * 0.25;
            setAnnualIncome(basicTax);
        }
        double basicTax2;
        basicTax2 = getHealthSpending() * 0.5;
        if (basicTax2 < 0.0) {
            basicTax2 = 0.0;
        }
        setAnnualIncome(getAnnualIncome() - basicTax2);
        return getAnnualIncome();
    }

    @Override
    public String summary() {
        return getName() + ": $ " + String.format("%.2f",getAnnualIncome());
    }

}
