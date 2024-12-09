package CursoJavaNelioAlves2;

import java.util.Scanner;

public class Java2 {
    public static void main(String[] args) {

        String expressao1;
        String expressao2;
        String expressao3;
        String expressao4;
        String expressao5;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro acontecimento: ");
        expressao1 = sc.nextLine();
        System.out.print("Digite o segundo acontecimento: ");
        expressao2 = sc.nextLine();

        if (expressao1.equalsIgnoreCase("Ganhei um carro") ||
                (expressao1.equalsIgnoreCase("Ganhei uma moto"))
                        || (expressao2.equalsIgnoreCase("Ganhei uma moto")) ||
                (expressao2.equalsIgnoreCase("Ganhei um carro"))) {
            System.out.println("VERDADEIRO");
             /* O || que significa "Ou" será verdadeiro nos casos em que pelo menos uma
            entrada seja verdadeira. */
        }
        else {
            System.out.println("FALSO");
        }

        System.out.print("Digite o terceiro acontecimento: ");
        expressao3 = sc.nextLine();
        System.out.print("Digite o quarto acontecimento: ");
        expressao4 = sc.nextLine();

        if (expressao3.equalsIgnoreCase("Ganhei um pirulito") ||
                (expressao3.equalsIgnoreCase("Ganhei um chocolate")) &&
                (expressao4.equalsIgnoreCase("Ganhei um chocolate")) ||
                (expressao4.equalsIgnoreCase("Ganhei um pirulito"))) {
            /* O && que significa "E" será verdadeiro nos casos em que as duas
            entradas sejam verdadeiras. */
            System.out.println("VERDADEIRO");
        }
        else {
            System.out.println("FALSO");
        }

        System.out.print("Digite o quinto: ");
        expressao5 = sc.nextLine();

        if (!(expressao5.equalsIgnoreCase("Ganhei nada"))) {
            /* O "!" que significa "Não" inverte a saída, se a entrada for falsa, saída será
            verdadeira, e vice e versa. */
            System.out.println("VERDADEIRO");
        }
        else {
            System.out.println("Falso");
        }
        sc.close();

    }
}
