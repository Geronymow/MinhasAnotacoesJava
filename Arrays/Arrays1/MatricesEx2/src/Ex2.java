/* Fazer um programa para ler dois números inteiros M e N, e depois ler
uma matriz de M linhas por N colunas contendo números inteiros,
podendo haver repetições. Em seguida, ler um número inteiro X que
pertence à matriz. Para cada ocorrência de X, mostrar os valores à
esquerda, acima, à direita e abaixo de X, quando houver, conforme
exemplo. */

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter M lines: ");
        int m = sc.nextInt();
        System.out.print("Enter N columns: ");
        int n = sc.nextInt();
        System.out.println();

        int[][] mat = new int[m][n];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the value of x");
        int x = sc.nextInt();
        int find = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == x) {
                    find = x;
                    System.out.println("Number " + x + " found at position (" + i + ", " + j + ")");

                    if (i > 0) {
                        System.out.println("Above: " + mat[i - 1][j]);
                    } else {
                        System.out.println("Above: Out of bounds");
                    }

                    // Position below
                    if (i < mat.length - 1) {
                        System.out.println("Below: " + mat[i + 1][j]);
                    } else {
                        System.out.println("Below: Out of bounds");
                    }

                    // Position to the left
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j - 1]);
                    } else {
                        System.out.println("Left: Out of bounds");
                    }

                    // Position to the right
                    if (j < mat[i].length - 1) {
                        System.out.println("Right: " + mat[i][j + 1]);
                    } else {
                        System.out.println("Right: Out of bounds");
                    }
                }
            }
        }
        if(find == 0) {
            System.out.println("Value does not appear in the vector!!");
        }

        sc.close();

    }
}
