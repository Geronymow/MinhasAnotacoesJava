package application;

import entities.VectN;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements will there be in the vector?: ");
        int n = sc.nextInt();
        int [] vect = new int[n];

        VectN vectn = new VectN(vect);
        vectn.insertVector();

        vectn.avgEvenNumbers();
    }
}
