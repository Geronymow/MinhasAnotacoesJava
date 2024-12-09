package application;

import entities.PeopleData;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people will be included? ");
        int n = sc.nextInt();

        double[] height = new double[n];
        char[] gender = new char[n];

        PeopleData peoples = new PeopleData(gender,height);

        peoples.startVector();
        peoples.minor();
        peoples.major();
        peoples.heightWomen();
        peoples.numberMen();

        sc.close();
    }
}
