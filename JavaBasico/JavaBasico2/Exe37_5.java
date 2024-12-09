package CursoJavaNelioAlves2;
import java.util.Scanner;
/*
Com base na tabela abaixo, escreva um programa que leia o código de um
item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
____________________________________________________
|CÓDIGO  |     ESPECIFICAÇÃO            | PREÇO    |
|________|______________________________|__________|
|  1     |     Cachorro Quente          | R$ 4,00  |
|________|______________________________|__________|
|   2    |     X-Salada                 | R$ 4,50  |
|________|______________________________|__________|
|  3     |     X - Bacon                | R$ 5,00  |
|________|______________________________|__________|
|  4     |     Torrada Simples          | R$ 2,00  |
|________|______________________________|__________|
|   5    |     Refrigerante             | R$ 1,00  |
|________|______________________________|__________|

*/

public class Exe37_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código do item: ");
        int itemCode = sc.nextInt();

        if (itemCode == 1){
            System.out.print("Quantos cachorros quentes deseja? ");
            int quantidadeItem = sc.nextInt();
            double ValorPagar = quantidadeItem * 4.00;
            System.out.printf("Valor total a pagar: R$ %.2f%n",ValorPagar);
        }
        else if (itemCode == 2){
            System.out.print("Quantos X-Saladas deseja? ");
            int quantidadeItem = sc.nextInt();
            double ValorPagar = quantidadeItem * 4.50;
            System.out.printf("Valor total a pagar: R$ %.2f%n",ValorPagar);
        }
        else if (itemCode == 3){
            System.out.print("Quantos X-Bacons deseja? ");
            int quantidadeItem = sc.nextInt();
            double ValorPagar = quantidadeItem * 5.00;
            System.out.printf("Valor total a pagar: R$ %.2f%n",ValorPagar);
        }
        else if (itemCode == 4){
            System.out.print("Quantas Torradas deseja? ");
            int quantidadeItem = sc.nextInt();
            double ValorPagar = quantidadeItem * 2.00;
            System.out.printf("Valor total a pagar: R$ %.2f%n",ValorPagar);
        }
        else if (itemCode ==5){
            System.out.print("Quantos refrigerantes deseja? ");
            int quantidadeItem = sc.nextInt();
            double ValorPagar = quantidadeItem * 1.50;
            System.out.printf("Valor total a pagar: R$ %.2f%n",ValorPagar);
        }
        else {
            System.out.println("Retorne ao início e faça seu pedido, por gentileza.");
        }
        sc.close();

    }
}
