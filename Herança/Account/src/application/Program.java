package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class Program {
    public static void main(String[] args) {

        Account acc = new Account(1001,"Alex Green", 0.0);
        BusinessAccount bacc =
                new BusinessAccount(1002, "Maria Silva", 0.0, 5000.00);

        // UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount
                (1003,"Guilherme Geronymo", 0.0, 200.00);
        Account acc3 = new SavingAccount
                (1004, "Elza Lucia", 0.0, 0.0);

        // DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.00);

        // BusinessAccount acc5 = (BusinessAccount) acc3;
        if(acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.00);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingAccount) {
            SavingAccount acc5 = (SavingAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update");
        }

    }
}
