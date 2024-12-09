package CursoJavaNelioAlves2;

import java.util.Scanner;

public class Java7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número que corresponde o dia: ");
        int  dia = sc.nextInt();
        String diaDaSemana;

        diaDaSemana = (dia >= 2 && dia <= 7) ? "Dia válido: ": "Dia inválido.";
        System.out.print(diaDaSemana);

        switch (dia) {
            case 1:
                diaDaSemana = "Domingo";
                System.out.println(diaDaSemana);
                System.out.println("Final de semana");
                break;
            case 2:
                diaDaSemana = "Segunda";
                System.out.println(diaDaSemana);
                System.out.println("Dia útil");
                break;
            case 3:
                diaDaSemana = "Terça";
                System.out.println(diaDaSemana);
                System.out.println("Dia útil");
                break;
            case 4:
                diaDaSemana = "Quarta";
                System.out.println(diaDaSemana);
                System.out.println("Dia útil");
                break;
            case 5:
                diaDaSemana = "Quinta";
                System.out.println(diaDaSemana);
                System.out.println("Dia útil");
                break;
            case 6:
                diaDaSemana = "Sexta";
                System.out.println(diaDaSemana);
                System.out.println("Dia útil");
                break;
            case 7:
                diaDaSemana = "Sábado";
                System.out.println(diaDaSemana);
                System.out.println("Final de semana");
                break;
            default:
                System.out.println(" Por gentileza, digite um número válido.");
        }
        sc.close();
    }
}
