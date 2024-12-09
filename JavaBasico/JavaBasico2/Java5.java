package CursoJavaNelioAlves2;
import java.util.Scanner;

public class Java5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Fazer um programa para ler um valor inteiro de 1 a 7 representando
        um di a da semana (Sendo 1 = domingo, 2 = segunda, e assim por diante).
        Escrever na tela o dia da semana correspondente, conforme exemplos. */

        System.out.print("Digite o dia correspondente ao número: ");
        String dia = sc.next().toLowerCase();
        /* Comando para alinhar e ignorar o maiúsculo */
        int diaNum = 0;

        switch (dia) {
            /* Testando o Switch com o inverso, Int para String */
            case "domingo":
               diaNum = 1;
                break;
            case "segunda":
                diaNum = 2;
                break;
            case "terça":
                diaNum = 3;
                break;
            case "quarta":
               diaNum = 4;
                break;
            case "quinta":
                diaNum = 5;
                break;
            case "sexta":
                diaNum = 6;
                break;
            case "sábado":
                diaNum = 7;
                break;
            default:
                /* Caso digite um número inválido, o default nesse contexto funciona como um "Else" */
                System.out.println("Dia inválido");
        }
        System.out.printf("Dia da semana: %d%n", diaNum);
        sc.close();
    }
}
