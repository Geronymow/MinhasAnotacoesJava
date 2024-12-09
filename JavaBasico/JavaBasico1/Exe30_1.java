package CursoJavaNelioAlves1;
import java.util.Scanner;

public class Exe30_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Faça um programa para ler dois valores inteiros, e
        depois mostrar na tela a soma desses números com uma
        mensagem explicativa. */

        int num1, num2, soma;

        System.out.print("Digite o valor do numero 1: ");
        num1 = sc.nextInt();
        System.out.print("Digite o valor do numero 2: ");
        num2 = sc.nextInt();

        soma = num1 + num2;

        System.out.printf("A soma dos dois números é: %d%n",soma);

        sc.close();

    }
}
