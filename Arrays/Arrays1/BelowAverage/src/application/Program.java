package application;

import entities.VectProgram;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements will the vector have?: ");
        int n = sc.nextInt();
        double [] vectOb = new double[n];

        VectProgram vect = new VectProgram(vectOb);

        vect.declaringElements(vectOb);

        double avg = 0.0;
        double avgTotal = 0;
        vect.avg(vectOb,avg,avgTotal);

    }
}
