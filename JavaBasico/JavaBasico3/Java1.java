package CursoJavaNelioAlves3;

import java.util.Locale;
import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a largura: ");
        double largura = sc.nextDouble();
        System.out.print("Digite o comprimento: ");
        double comprimento = sc.nextDouble();
        System.out.print("Digite o MetroQuadrado: ");
        double metroQuadrado = sc.nextDouble();
        // ctrl + F8 para inserir um Breakpoint, dessa forma facilita no ato de debugar.
        // F8 para continuar o debug e F9 para resumir o programa.

        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PRECO = %.2f%n", preco);

        sc.close();
    }
}
