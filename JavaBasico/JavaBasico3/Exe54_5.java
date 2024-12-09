package CursoJavaNelioAlves3;

import java.util.Scanner;

/* Ler um valor N. Calcular e escrever seu respectivo fatorial.
Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por definição,
fatorial de 0 é 1. */

public class Exe54_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 0) {
            int fatorial1 = 0;
            int i = 0;
            for (i = 1; n >= i; i++) {
                while (i == 1) {
                    fatorial1 = n * (n - i);
                    i += 1;
                    int fatorial2 = 0;
                    while (i == 2) {
                        fatorial2 = fatorial1 * (n - i);
                        i += 1;
                        if (n == 1) {
                            System.out.println("1");
                        }
                        else if (n == 2) {
                            System.out.println("2");
                        }
                        else if (n == 3) {
                            System.out.println("6");
                        }
                        else {
                            int fatorial3 = 0;
                            for (int y = 3; n > y; y++) {
                                fatorial3 = fatorial2 *= (n - y);
                            }
                            System.out.println(fatorial3);
                        }
                    }
                }
            }
        }
        else {
            System.out.println("1");
        }
        sc.close();
    }
}
