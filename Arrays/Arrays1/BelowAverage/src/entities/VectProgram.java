package entities;

import java.util.Scanner;

public class VectProgram {

    Scanner sc = new Scanner(System.in);

    double [] VectRealNum;

    public VectProgram(double[] vectRealNum) {
        VectRealNum = vectRealNum;
    }

    public double[] getVectRealNum() {
        return VectRealNum;
    }

    public void setVectRealNum(double[] vectRealNum) {
        VectRealNum = vectRealNum;
    }

    public void declaringElements(double [] vectOb) {
        for (int i = 0; vectOb.length > i; i++) {
            System.out.print("Enter a number: ");
            getVectRealNum()[i] = sc.nextDouble();
        }
    }

    public void avg(double[] vectOb, double avg, double avgTotal) {
        for (int i = 0; vectOb.length > i; i++) {
            avg += getVectRealNum()[i];
            avgTotal = avg/ vectOb.length;
        }
        System.out.printf("Average: %.3f%n",avgTotal);

        System.out.print("Below average elements:");
        for (int i = 0; vectOb.length > i; i++) {
            if (getVectRealNum()[i] < avgTotal) {
                System.out.print(" " + getVectRealNum()[i]);
            }
        }
    }
}
