package application;

import util.Vect;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements will each vector have?: ");
        int elements = sc.nextInt();
        int[] vectA = new int[elements];
        int[] vectB = new int[elements];
        int[] vectC = new int[elements];

        Vect A = new Vect(vectA);
        System.out.println("enter the values of the vector A: ");
        for (int i = 0; vectA.length > i; i++) {
            A.getElements()[i] = sc.nextInt();
        }

        Vect B = new Vect(vectB);
        System.out.println("enter the values of the vector B: ");
        for (int i = 0; vectB.length > i; i++) {
            B.getElements()[i] = sc.nextInt();
        }

        Vect C = new Vect(vectC);
        System.out.println("resulting vector: ");
        for (int i = 0; vectC.length > i; i++) {
            C.getElements()[i] = (A.getElements()[i] + B.getElements()[i]);
            System.out.println(C.getElements()[i]);
        }
    }
}
