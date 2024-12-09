package CursoJavaNelioAlves4;

import java.util.Scanner;

public class Java7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite os números: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a, b, c);
        showResult(higher);
        // Só existem aqui, porém a função chama.

        sc.close();
    }

    public static int max(int x, int y, int z) { /* Pode ser um nome diferente,
            não precisa ser "a","b" ou "c" */

        /* Declarando que a função irá retornar um valor inteiro "int" e logo após
        declarar os parâmetros (x,y,z) */

        int aux; // Variável local, só existe aqui
        if (x > y && x > z) {
            aux = x;
        } else if (x > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux; /* Indica para a função que o valor deve ser retornado,
        podendo ser utilizado mais tarde, como ser armazenado em uma variável */
    }
    public static void showResult(int value) { /* Pode ser um nome diferente,
        não precisa ser "higher" */

        /* Utilizamos o "void" quando a função não irá retornar um valor pra ser reaproveitado.
        Nesse exemplo ela irá apenas imprimir a mensagem no terminal. */
        System.out.println("Higher = " + value);
    }
}
