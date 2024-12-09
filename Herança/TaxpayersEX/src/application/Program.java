package application;

import entities.Company;
import entities.Individual;
import entities.Taxpayers;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Taxpayers> taxpayersList = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double annualIncome = sc.nextDouble();
            sc.nextLine();
            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                double healthSpending = sc.nextDouble();
                Taxpayers taxpayer = new Individual(name, annualIncome, healthSpending);
                taxpayer.calculateTax();
                taxpayersList.add(taxpayer);

            }
            else {
                System.out.print("Number of employees: ");
                int numEmployees = sc.nextInt();
                Taxpayers taxpayer = new Company(name,annualIncome,numEmployees);
                taxpayer.calculateTax();
                taxpayersList.add(taxpayer);
            }

        }
        System.out.println();
        System.out.println("TAXES PAID:");
        for(Taxpayers taxpayers : taxpayersList) {
            System.out.println(taxpayers.summary());
        }
        System.out.println();
        double totalTaxes = 0.0;
        for(Taxpayers taxpayers : taxpayersList) {
            totalTaxes += taxpayers.getAnnualIncome();
        }
        System.out.print("TOTAL TAXES: ");
        System.out.printf("$ %.2f%n",totalTaxes);

        sc.close();
    }
}
