package application;

import util.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people will be entered?: ");
        int n = sc.nextInt();
        sc.nextLine();

        Person [] vectquantPerson = new Person[n];

        Person person = new Person();

        int y = 1;
        person.personsQuant(n, vectquantPerson, y);

        double SumAvg = 0;
        person.avgheight(SumAvg,n, vectquantPerson);

        person.under16(vectquantPerson,n);

        person.under16Name(vectquantPerson,n);

        sc.close();
    }
}
