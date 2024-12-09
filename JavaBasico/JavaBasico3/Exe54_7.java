package CursoJavaNelioAlves3;

/* Fazer um programa para ler um número inteiro positivo N. O programa deve
então mostrar na tela N linhas, começando de 1 até N. Para cada linha, mostrar
o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo. */

import java.util.Scanner;

public class Exe54_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 0) {
            for (int i = 1; n >= i; i++) {
                System.out.printf("%d %.0f %.0f%n",i ,Math.pow(i,2),Math.pow(i,3));
            }
        }
        else {
            System.out.println("Erro no programa");
        }
        sc.close();
    }
}