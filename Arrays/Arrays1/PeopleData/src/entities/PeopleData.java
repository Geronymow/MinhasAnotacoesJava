package entities;

import java.util.Scanner;

public class PeopleData {

    Scanner sc = new Scanner(System.in);

    private char[] gender;
    private double[] height;

    public PeopleData(char[] gender, double[] height) {
        this.gender = gender;
        this.height = height;
    }

    public double[] getHeight() {
        return height;
    }

    public void setHeight(double[] height) {
        this.height = height;
    }

    public char[] getGender() {
        return gender;
    }

    public void setGender(char[] gender) {
        this.gender = gender;
    }

    public void startVector() {
        int y = 1;
        int z = 1;
        for (int i = 0; height.length > i; i++) {
            System.out.printf("%dst person height: ",y++);
            getHeight()[i] = sc.nextDouble();
            System.out.printf("%dst person gender: ",z++);
            getGender()[i] = sc.next().charAt(0);
            while (getGender()[i] != 'm' && getGender()[i] != 'f' &&
                    getGender()[i] != 'M' && getGender()[i] != 'F') {
                System.out.print("Please enter a valid gender: ");
                getGender()[i] = sc.next().charAt(0);
            }
        }
    }

    public void major() {
        double major = Integer.MIN_VALUE;
        for (int i = 0; height.length > i; i++) {
            if (getHeight()[i] > major) {
                major = getHeight()[i];
            }
        }
        System.out.println("Greater height: " + major);
    }

    public void minor() {
        double minor = Integer.MAX_VALUE;
        for (int i = 0; height.length > i; i++) {
            if (getHeight()[i] < minor) {
                minor = getHeight()[i];
            }
        }
        System.out.println("Lowest value: " + minor);
    }

    public void heightWomen() {
        int count = 0;
        double avgHeight = 0.0;
        double sum = 0.0;
        for (int i = 0; height.length > i; i++) {
            if (getGender()[i] == 'f' || getGender()[i] == 'F') {
                sum += getHeight()[i];
                count++;
            }
            avgHeight = sum/count;
        }
        System.out.printf("Average height of women: %.2f%n",avgHeight);
    }

    public void numberMen() {
        int count = 0;
        for (int i = 0; height.length > i; i++) {
            if (getGender()[i] == 'm' || getGender()[i] == 'M') {
                count++;
            }
        }
        System.out.println("Number of men: "+ count);
    }
}
