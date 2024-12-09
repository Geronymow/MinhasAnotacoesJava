package CursoJavaNelioAlves2;

import java.util.Scanner;

public class Exe37_3 {
    public static void main(String[] args) {
        /* Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
        "São Múltiplos" ou "Não são Múltiplos", indicando se os valores lidos são
        múltiplos entre si. Atenção: os números devem poder ser digitados em
        ordem crescente ou decrescente. */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite os valores: ");
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A % B == 0 || B % A == 0){
            System.out.print("Números são múltiplos entre si");
        }
        else {
            System.out.println("Não são múltiplos");
        }

        sc.close();

    }
}
