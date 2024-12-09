package CursoJavaNelioAlves1;
import java.util.Scanner;

public class Exe30_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Fazer um programa para ler quatro valores inteiros A, B, C e D.
        A seguir, calcule e mostre a diferença do produto
        de A e B pelo produto de C e D segundo a fórmula: DIFERENÇA = (A * B - C * D) */

        int A,B,C,D,FormDi;

        System.out.print("Digite os valores: ");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        FormDi = (A * B - C * D);

        System.out.printf("Utilizando a formula da diferença, temos: %d%n",FormDi);

        sc.close();


    }
}
