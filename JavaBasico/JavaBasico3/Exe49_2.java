package CursoJavaNelioAlves3;

/* Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada
de pontos no sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence.
O algoritmo será encerrado quando pelo menos uma de duas coordenadas for
NULA (nesta situação sem escrever mensagem alguma). */

import java.util.Locale;
import java.util.Scanner;

public class Exe49_2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o Valor de x: ");
        double x = sc.nextDouble();
        System.out.print("Digite o valor de y: ");
        double y = sc.nextDouble();

        while (x != 0 && y != 0){
            if (x > 0.0 && y > 0.0) {
                System.out.println("Primeiro");
            }
            else if (x < 0.0 && y > 0.0 ) {
                System.out.println("Segundo");
            }
            else if (x < 0.0 && y < 0.0) {
                System.out.println("Terceiro");
            }
            else {
                System.out.println("Quarto");
            }

            System.out.print("Digite o Valor de x: ");
            x = sc.nextDouble();
            System.out.print("Digite o valor de y: ");
            y = sc.nextDouble();
        }
        sc.close();
    }
}
