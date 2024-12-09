package CursoJavaNelioAlves3;

import java.util.Scanner;

/* Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que
serão lidos em seguida. Mostre quantos destes valores X estão dentro do intervalo [10,20] e
quantos estão fora do intervalo, mostrando essas informações conforme exemplo
(use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo). */
public class Exe54_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de n: ");
        int n = sc.nextInt();
        int quant1 = 0;
        int quant2 =0;

        if (n > 0) {
            for (int x = 1; n >= x; x++) {
                System.out.print("Digite o valor: ");
                int v = sc.nextInt();
                sc.nextLine();
                if (v >= 10 && v <= 20) {
                    quant1 += 1;
                } else {
                    quant2 += 1;
                }
            }
            System.out.println(quant1 + " in");
            System.out.println(quant2 + " out");
        }
        else {
            System.out.println("Valor inválido! Digite um número maior que 0");
        }
        sc.close();
    }
}
