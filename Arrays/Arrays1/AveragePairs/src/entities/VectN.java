package entities;

import java.util.Scanner;

public class VectN {

    Scanner sc = new Scanner(System.in);

    int[] vect;

    public VectN() {
    }

    public VectN(int[] vect) {
        this.vect = vect;
    }

    public int[] getVect() {
        return vect;
    }

    public void setVect(int[] vect) {
        this.vect = vect;
    }

    public void insertVector() {
        for(int i = 0; vect.length > i; i++) {
            System.out.print("Enter the number: ");
            getVect()[i] = sc.nextInt();
        }
    }

    public void avgEvenNumbers() {
        double sumEvenNumbers = 0.0;
        double avgEvenNumbers = 0.0;
        int count = 0;
        for(int i = 0; vect.length > i; i++) {
            if(getVect()[i] % 2 == 0) {
                sumEvenNumbers += getVect()[i];
                count++;
            }
            avgEvenNumbers = sumEvenNumbers / count;
        }
        if (count == 0) {
            System.out.println("No even numbers");
        }
        else {
            System.out.println("Average of even numbers only: " + avgEvenNumbers);
        }
        sc.close();
    }
}
