package util;

public class Calculator {

    private int num;

    public Calculator(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void negative(Calculator[] vect, int n) {
        /* vetor tipo Calculadora */
        for (int i = 0; i < n; i++) {
            if (vect[i].getNum() < 0) {
                System.out.printf("%d\n", vect[i].getNum());
            }
        }
    }
}