package application;

import entities.ClassVect;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers will you type? ");
        int n = sc.nextInt();
        sc.nextLine();
        int i  = 0;
        double sum = 0;
        double avg = 0;
        double [] vect = new double[n];

        ClassVect vectA = new ClassVect(n,vect,i,avg);
        vectA.DeterminingVector();
        System.out.print("Values: ");
        vectA.EnterValues();
        System.out.println();
        System.out.print("Sum: ");
        vectA.vectSum(sum);
        System.out.print("Average: ");
        vectA.average(vectA.getAvg(sum,n));

        sc.close();
    }
}
