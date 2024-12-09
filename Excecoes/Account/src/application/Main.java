package application;

import model.entities.Account;
import model.exceptions.DomainException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws DomainException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            sc.nextLine();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();
            sc.nextLine();
            Account ac = new Account(number, holder, balance, withdrawLimit);
            ac.withdraw(amount);
            System.out.println("New Balance: " + String.format("%.2f",ac.getBalance()));
        }
       catch (InputMismatchException e) {
            System.out.println("Invalid date Format");
        }
        catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }
        catch (DomainException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }
        finally {
            sc.close();
        }
    }
}
