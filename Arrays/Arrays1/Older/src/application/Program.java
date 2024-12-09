package application;

import entities.Vectors;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people will you type? ");
        int vectorCount = sc.nextInt();

        String [] name = new String[vectorCount];
        int[] age = new int[vectorCount];
        Vectors [] vect = new Vectors[vectorCount];

        Vectors vectA = new Vectors(name,age);

        int y = 0;
        vectA.insertVector(vect,y);
        vectA.OlderPerson(vect);

    }
}
