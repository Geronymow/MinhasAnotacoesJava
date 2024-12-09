package model.entities;

import model.exceptions.DomainException;

public class Account {

    private Integer num;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {
    }

    public Account(Integer num, String holder, Double balance, Double withdrawLimit) {
        this.num = num;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws DomainException {

        if(amount > withdrawLimit) {
            throw new DomainException("The amount exceeds withdraw limit");
        }

        if(balance < amount) {
            throw new DomainException("Not enough balance");
        }

        balance -= amount;
    }

}
