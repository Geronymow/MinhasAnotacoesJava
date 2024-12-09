package CursoJavaNelioAlves1;
import java.util.Locale;
import java.util.Scanner;

public class Exe30_4 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /* Fazer um programa que leia o número de um funcionário, seu número de
        horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário.
        A seguir, mostre o número e o salário do funcionário,
        com duas casas decimais. */

        int code, horaTra;
        double valorPerHora, salario;

        System.out.print("Digite seu código de usuário: ");
        code = sc.nextInt();
        System.out.print("Digite quantas horas trabalhou: ");
        horaTra = sc.nextInt();
        System.out.print("Valor que recebe por hora: ");
        valorPerHora = sc.nextDouble();

        salario = horaTra * valorPerHora;

        System.out.println();
        System.out.println("Código de usuário: "+code);
        System.out.printf("Salario do mês: U$%.2f%n",salario);

        sc.close();

    }
}
