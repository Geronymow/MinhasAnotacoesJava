package CursoJavaNelioAlves3;

import java.util.Locale;
import java.util.Scanner;

/* Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir.
Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal.
Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o
primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5. */
public class Exe54_3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de n: ");
        int n = sc.nextInt();

        if (n > 0) {
            double media = 0;
            for (int i = 1; n >= i; i++) {

                double v1 = sc.nextDouble();
                double v2 = sc.nextDouble();
                double v3 = sc.nextDouble();
                sc.nextLine();

                media = ((v1 * 2 + v2 * 3 + v3 * 5)/10);
                System.out.printf("%.1f%n",media);
            }
        }
        else {
            System.out.println("Valor inválido! Digite um número maior que 0");
        }
        sc.close();
    }
}
