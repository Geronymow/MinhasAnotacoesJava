package application;

import util.VectNumber;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers will you enter? ");
        int n = sc.nextInt();
        double [] number = new double[n];

        VectNumber vectNumber = new VectNumber(number);

        for(int i = 0; number.length > i; i++) {
            System.out.print("Enter a number: ");
            vectNumber.getNumber()[i] = sc.nextDouble();
        }

        double greaterValue = 0;
        int positionLargest = 0;
        for(int i = 0; number.length > i; i++) {
            if (vectNumber.getNumber()[i] > greaterValue) {
                greaterValue = vectNumber.getNumber()[i];
                positionLargest = i;
            }
        }
        System.out.println("Highest value: " + greaterValue);
        System.out.println("Position of highest value " + positionLargest);
    }
}
