package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of students: ");
        int n = sc.nextInt();

        String[] name = new String[n];
        double[] score1 = new double[n];
        double[] score2 = new double[n];
        double[] avg = new double[n];

        Student allStudents = new Student(name,score1,score2,avg);

        Student[] veCt = new Student[n];

        int y = 1;
        allStudents.startVector(veCt,y);

        allStudents.averageScore(veCt);
    }
}
