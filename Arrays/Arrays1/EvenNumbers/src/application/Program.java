package application;

import entities.VectNumbers;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers you will enter?: ");
        int n = sc.nextInt();

        VectNumbers vectNumbers = new VectNumbers(new int[n]);
        
        for (int i = 0; n > i; i++) {
            System.out.print("Enter a number: ");
            vectNumbers.getNumbers()[i] = sc.nextInt();
        }

        System.out.print("Even numbers: ");
        int[] numbers = vectNumbers.getNumbers();
        for (int i = 0; n > i; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }

        int counter = 0;
        for (int i = 0; n > i; i++) {
            if (numbers[i] % 2 == 0) {
                counter++;
            }
        }
        System.out.println("\nNumber of even numbers: " + counter);
    }
}
