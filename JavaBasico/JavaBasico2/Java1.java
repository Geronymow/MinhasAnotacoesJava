package CursoJavaNelioAlves2;
import java.util.Scanner;

public class Java1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sexo;
        int idade;

        System.out.print("Digite o seu sexo: ");
        sexo = sc.next();

        if (sexo.equalsIgnoreCase("masculino")) {
            /* "sexo.equals" verifica se "sexo" é igual a String masculino */
            System.out.println("Sexo masculino");
            System.out.print("Digite sua idade: ");
            /* A afirmativa sendo verdadeira, o programa continua, pedindo
            para digitar sua idade */
            idade = sc.nextInt();

            if (idade >= 18) {
                System.out.println("Você é maior de idade");
            }
            else {
                System.out.println("Você é menor de idade");
                /* É possível fazer o encadeamento de estruturas condicionais */
            }

        }
        else if (sexo.equalsIgnoreCase("feminino")) {
            /* "sexo.equals" verifica se "sexo" é igual a String feminino */
            System.out.println("Sexo feminino");
            System.out.print("Digite sua idade: ");
            /* A afirmativa sendo verdadeira, o programa continua, pedindo
            para digitar sua idade */
            idade = sc.nextInt();

            if (idade >= 18) {
                System.out.println("Você é maior de idade");
            }
            else {
                System.out.println("Você é menor de idade");
                /* É possível fazer o encadeamento de estruturas condicionais */
            }
        }
        else {
            System.out.println("ERRO!");
            /* Caso ambas situações serem falsas, o programa da "ERRO" */
        }

        sc.close();

    }
}
