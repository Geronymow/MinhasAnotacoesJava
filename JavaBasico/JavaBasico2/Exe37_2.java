package CursoJavaNelioAlves2;
import java.util.Scanner;
/* Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar. */
public class Exe37_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número: ");
        int num = sc.nextInt();


        if (num % 2 ==0 ){
            System.out.println("Número par");
        }
        else {
            System.out.println("Número ímpar");
        }
        sc.close();

    }
}
