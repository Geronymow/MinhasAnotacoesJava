package CursoJavaNelioAlves3;

import java.util.Scanner;
/* Fazer um programa que lê números
inteiros até que um zero seja lido. Ao
final mostra a soma dos números lidos. */

public class Java2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int soma;
        soma = 0;

        while (num != 0) {
            // Enquanto a situação for verdadeira, o programa irá continuar rodando.
            soma += num;
            num = sc.nextInt();
        }
        // Quando se torna falsa, ele "pula pra fora" do {}
        System.out.println(soma);
        sc.close();
        
    }
}
