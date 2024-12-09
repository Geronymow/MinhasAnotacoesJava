package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class Program2 {
    public static void main(String[] args) {

        Account acc1 = new Account(1001, "Guilherme", 1000.0);
        acc1.withdraw(200.00);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingAccount(1001,"Maria", 1000.00,0.0);
        acc2.withdraw(200.00);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount
                (1002,"Joao",1000.00, 500.00);
        acc3.withdraw(200.00);
        System.out.println(acc3.getBalance());
    }
}
