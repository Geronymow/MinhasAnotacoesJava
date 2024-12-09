package application;

import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static final double PI = 3.14;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double num = sc.nextDouble();

        double c = Calculator.circumference(num);
        double v = Calculator.volume(num);

        System.out.println(c);
        System.out.println(v);
        System.out.println(Calculator.PI);

        sc.close();
    }
}