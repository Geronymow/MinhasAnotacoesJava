package CursoJavaNelioAlves2;
import java.util.Scanner;

/* Fazer um programa para ler um número inteiro, e
depois dizer se este número é negativo ou não. */
public class Exe37_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Digite o número: ");
        num = sc.nextInt();

        if (num < 0) {
            System.out.println("Este número é negativo");
        }
        else if (num > 0) {
            System.out.println("Este número é positivo");
        }
        else {
            System.out.println("Este número é 0");
        }

        sc.close();

    }
}
