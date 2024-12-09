package application;

/* Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta,
o nome do titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta.
Este valor de depósito inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro
a depositar no momento de abrir sua conta, o depósito inicial não será feito e o saldo inicial
da conta será, naturalmente, zero. Importante: uma vez que uma conta bancária foi aberta, o número
da conta nunca poderá ser alterado. Já o nome do titular pode ser alterado (pois uma pessoa pode
mudar de nome por ocasião de casamento, por exemplo).

Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para
proteger isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques.
Para cada saque realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo
negativo se o saldo não for suficiente para realizar o saque e/ou pagar a taxa.
Você deve fazer um programa que realize o cadastro de uma conta, dando opção de que seja ou não
informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre
mostrando os dados da conta após cada operação.*/

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account Number: ");
        int accountNum = sc.nextInt();

        while (accountNum > 9999 || accountNum < 1000) {
            System.out.println("Invalid account number try again");
            System.out.print("Enter account Number: ");
            accountNum = sc.nextInt();
        }
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String userName = sc.nextLine();
        double balance = 0;
        Account account = new Account(accountNum, userName, balance);

        account.setUserName(userName);
        account.getAccountNum(accountNum);
        account.getBalance(balance);

        System.out.print("Is there na initial deposit (y/n)? ");
        String input = sc.next();
        char decision = input.charAt(0);
        System.out.println();

        if (input.equalsIgnoreCase("y")) {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            while (account.initialDeposit(initialDeposit) == 0) {
                System.out.println("Enter a valid value");
                System.out.print("Enter initial deposit value: ");
                initialDeposit = sc.nextDouble();
                sc.nextLine();
            }
            System.out.printf("Enter initial deposit value: %.2f%n",
                    account.initialDeposit(initialDeposit));
            System.out.println();
            System.out.println(account.data(initialDeposit));
            System.out.println();

            System.out.print("Enter a deposit value: ");
            double deposit = sc.nextDouble();
            account.bankDeposit(deposit, initialDeposit);
            System.out.println(account.updatedData(initialDeposit));
            System.out.println();
            System.out.print("Enter a withdraw value: ");
            double draft = sc.nextDouble();
            account.bankDraft(draft);
            System.out.println(account.updatedData(initialDeposit));
        } else if (input.equalsIgnoreCase("n")) {
            double initialDeposit = 0;
            System.out.println(account.data(initialDeposit));
            System.out.println();

            System.out.print("Enter a deposit value: ");
            double deposit = sc.nextDouble();
            account.bankDeposit(deposit, initialDeposit);
            System.out.println(account.updatedData(initialDeposit));
            System.out.println();
            System.out.print("Enter a withdraw value: ");
            double draft = sc.nextDouble();
            account.bankDraft(draft);
            System.out.println(account.updatedData(initialDeposit));
        } else {
            System.out.println("Invalid char, please try again with another char");
            sc.close();
        }
    }
}