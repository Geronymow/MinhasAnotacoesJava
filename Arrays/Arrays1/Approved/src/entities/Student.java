package entities;

import java.util.Scanner;

public class Student {

    Scanner sc = new Scanner(System.in);

    private String[] name;
    private double[] score1;
    private double[] score2;
    private double[] avg;

    public Student(String[] name, double[] score1, double[] score2, double[] avg) {
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
        this.avg = avg;
    }

    public String[] getName() {
        return name;
    }

    public double[] getAvg() {
        return avg;
    }

    public double[] getScore1() {
        return score1;
    }

    public double[] getScore2() {
        return score2;
    }

    public void startVector(Student[] veCt, int y) {
        for (int i = 0; veCt.length > i; i++) {
            System.out.printf("Enter the name, " +
                    "first and second grade of the %dst student: " + "\n",y++);
            getName()[i] = sc.nextLine();
            getScore1()[i] = sc.nextDouble();
            getScore2()[i] = sc.nextDouble();
            sc.nextLine();
        }
    }

    public void averageScore(Student[] veCt) {
        System.out.println("Approved students:");
        for (int i = 0; veCt.length > i; i++) {
            getAvg()[i] = (getScore1()[i] + getScore2()[i]) / 2;
            if (getAvg()[i] >= 6.0) {
                System.out.println(getName()[i]);
            }
        }
    }
}
