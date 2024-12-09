package application;

import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Calculator cal = new Calculator();

        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();
        /* Além de iniciar a variável na Classe, deve inserir no programa também */
        System.out.print("How many dollars will be bought? ");
        double realPrice = sc.nextDouble();

        double result = cal.realDollarPrice(dollarPrice, realPrice);
        System.out.printf("Amount to be paid in reais = %.2f%n ",result);

        sc.close();
    }
}
