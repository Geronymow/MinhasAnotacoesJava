package entities;

import java.util.Scanner;

public class ClassVect {

    Scanner sc = new Scanner(System.in);

     private int n;
     private double [] vect;
     private int i;
     private double avg;
     private double sum;

    public ClassVect(int n, double [] vect, int i, double avg) {
        this.n = n;
        this.vect = vect;
        this.i = i;
        this.avg = avg;
        this.sum = sum;
    }

    public ClassVect(double sum) {
        this.sum = sum;
    }

    public double getSum(double sum) {
        return this.sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public double getAvg(double avg, double sum) {
        return this.avg;
    }

    public void DeterminingVector() {
        for (int i = 0; i < vect.length ; i++) {
            System.out.print("Enter a number: ");
            vect[i] = sc.nextInt();
        }
    }

    public void EnterValues() {
        for (int i = 0; i < vect.length; i++) {
            System.out.print(vect[i]+ " ");
        }
    }

    public void vectSum(double sum) {
        for (int i = 0; i < vect.length; i++) {
           setSum(sum += vect[i]);
           ClassVect vectA = new ClassVect(sum);
        }
        System.out.printf("%.2f%n",getSum(sum));
    }

    public void average(double sum) {
        for (int i = 0; i < vect.length; i++) {
        }
        setAvg(getSum(sum) / n);
        System.out.printf("%.2f%n",getAvg(sum,n));
    }
}
