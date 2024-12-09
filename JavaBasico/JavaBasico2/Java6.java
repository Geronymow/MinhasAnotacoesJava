package CursoJavaNelioAlves2;

import java.util.Locale;
import java.util.Scanner;

public class Java6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço: ");
        double preco = sc.nextDouble();

        double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
        System.out.printf("Valor do desconto: %.2f%n",desconto);

        /* No exemplo acima é a mesma situação que:
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço: ");
        double preco = sc.nextDouble();

        if (preco < 20) {
            desconto = preco * 0.1;
        }
        else {
            desconto = preco * 0.05;
        }

        "Condicao ? expressão_1 : expressão_2" */

        System.out.println();
        sc.close();

    }
}
