package CursoJavaNelioAlves3;
import java.util.Locale;
import java.util.Scanner;

/* Fazer um programa para ler um número N. Depois leia N pares de números e mostre a
divisão do primeiro pelo segundo. Se o denominador for igual a zero, mostrar a
mensagem "divisão impossível". */
public class Exe54_4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de n: ");
        int n = sc.nextInt();

        for (int i = 1; n >= i; i++) {

            System.out.print("Digite os valores: ");
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();

            if (v2 != 0) {
                double div = (double) v1 / v2;
                System.out.printf("%.1f%n",div);
            } else {
                System.out.println("divisão impossível");
            }
        }
        sc.close();
    }
}
