package entities;

public class Account {

    private int accountNum;
    private String userName;
    private double balance;

    // Constructor
    public Account(int accountNum, String userName, double balance) {
        this.accountNum = accountNum;
        this.userName = userName;
        this.balance = balance;
    }

    // Encapsulation
    public int getAccountNum(int accountNum) {
        return accountNum;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getBalance(double balance) {
        return balance;
    }

    // Methods
    public double initialDeposit(double initialDeposit) {
        return initialDeposit;
    }

    public double bankDeposit(double deposit, double initialDeposit) {
        return balance += deposit + initialDeposit(initialDeposit);
    }

    public double bankDraft (double draft) {
        return balance -= draft + 5;
    }

    public String data(double initialDeposit) {
        return String.format("Account data:\n" +
                "Account %d, Holder: %s , Balance: $ %.2f",
                accountNum, userName, initialDeposit(initialDeposit));
    }

    public String updatedData (double initialDeposit) {
        return String.format("Updated account data:\n" +
                "Account %d, Holder: %s , Balance: $ %.2f", accountNum, userName,balance);
    }
}
