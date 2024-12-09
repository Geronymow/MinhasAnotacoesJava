package application;

import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Who many numbers you will enter: ");
        int n = sc.nextInt();
        Calculator[] vect = new Calculator[n];
        int num;

        for (int i = 0; vect.length > i; i++) {
            sc.nextLine();
            System.out.print("Enter a number: ");
            num = sc.nextInt();
            vect[i] = new Calculator(num);
        }
        int i = 0;
        System.out.println("Negative numbers: ");
        vect[i].negative(vect,n);
        /* Chamando o método já com o vetor */
    }
}
