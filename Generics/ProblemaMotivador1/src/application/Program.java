package application;

import Service.Print;

import java.util.Scanner;

public class Program {
    public static <T> void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Print<Integer> pt = new Print<>();

        System.out.println("How many values? ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++) {
            Integer value = sc.nextInt();
            pt.addValue(value);
        }

        pt.print();
        System.out.println("First: " + pt.first());

        sc.close();

    }
}
