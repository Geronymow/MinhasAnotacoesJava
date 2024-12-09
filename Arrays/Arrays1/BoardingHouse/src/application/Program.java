package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        Student[] room = new Student[10];

        Student students = new Student();

        students.rentStart(n, room);
        students.summary(n, room);

        sc.close();

    }
}
