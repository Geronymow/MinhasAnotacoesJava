package CursoJavaNelioAlves3;

/* Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X,
um valor por linha, inclusive o X, se for o caso. */

import java.util.Scanner;

public class Exe54_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        int x = sc.nextInt();

        if (1 <= x && x <= 1000) {
            for (int i = 1; x >= i ; i++) {
                if (i % 2 !=0) {
                    System.out.println(i);
                }
            }
        }
        else {
            System.out.println("Digite um número válido (1 <= x <= 1000)");
        }
        sc.close();
    }
}
