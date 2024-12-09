package model.entities;

import java.time.LocalDate;

public class Contract {

    private Integer num;
    private LocalDate date;
    private Double totalValue;

    private Installment installment;

    public Contract() {
    }

    public Contract(Integer num, LocalDate date, Double totalValue, Installment installment) {
        this.num = num;
        this.date = date;
        this.totalValue = totalValue;
        this.installment = installment;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public Installment getInstallment() {
        return installment;
    }

    public void setInstallment(Installment installment) {
        this.installment = installment;
    }
}
