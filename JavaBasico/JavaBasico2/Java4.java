package CursoJavaNelioAlves2;

import java.util.Scanner;

public class Java4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Fazer um programa para ler um valor inteiro de 1 a 7 representando
        um di a da semana (Sendo 1 = domingo, 2 = segunda, e assim por diante).
        Escrever na tela o dia da semana correspondente, conforme exemplos. */

        System.out.print("Digite o número correspondente ao dia: ");
        int valorDia = sc.nextInt();
        String dia;

        switch (valorDia) {
            /* O switch irá "trocar" a variável para o número atribuído, retornando o dia */
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                /* Caso digite um número inválido, o default nesse contexto
                funciona como um "Else" */
                dia = "Dia inválido";
        }
        System.out.println("Dia da semana: "+ dia);
        sc.close();
    }
}
