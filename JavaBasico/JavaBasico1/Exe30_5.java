package CursoJavaNelioAlves1;
import java.util.Locale;
import java.util.Scanner;

public class Exe30_5 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /* Fazer um programa para ler o código de uma peça 1,
        o número de peças 1, o valor unitário de cada peça 1, o
        código de uma peça 2, o número de peças 2 e o valor
        unitário de cada peça 2. Calcule e mostre o valor a ser pago. */

        int CodeP1, numP1, CodeP2, numP2;
        double UniValP1, UniValUP2, ValorTotal;

        System.out.print("Digite o código do item: ");
        CodeP1 = sc.nextInt();
        System.out.print("Digite a quantidade: ");
        numP1 = sc.nextInt();
        System.out.print("Digite o valor unitário da P1: ");
        UniValP1 = sc.nextDouble();
        System.out.println();
        System.out.print("Digite o código do item: ");
        CodeP2 = sc.nextInt();
        System.out.print("Digite a quantidade: ");
        numP2 = sc.nextInt();
        System.out.print("Digite o valor unitário da P2: ");
        UniValUP2 = sc.nextDouble();

        ValorTotal = (numP1 * UniValP1) + (numP2 * UniValUP2);

        System.out.printf("Valor total a ser pago: U$%.2f%n",ValorTotal);

        sc.close();

    }
}
