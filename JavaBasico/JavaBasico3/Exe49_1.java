package CursoJavaNelioAlves3;
import java.util.Scanner;

/* Escreva um programa que repita a leitura de uma senha até que ela seja válida.
Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida".
Quando a senha for informada corretamente deve ser impressa a mensagem
"Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002. */

public class Exe49_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua senha de 4 dígitos: ");
        int password = sc.nextInt();

        while (password > 9999 || password < 1000) {
            System.out.println("A senha deve possuir 4 dígitos!");
            System.out.print("Digite sua senha de 4 dígitos: ");
            password = sc.nextInt();
        }
        while (password != 2002) {
            System.out.println("Senha inválida");
            System.out.print("Digite sua senha: ");
            password = sc.nextInt();
            while (password > 9999 || password < 1000) {
                System.out.println("A senha deve possuir 4 dígitos!");
                System.out.print("Digite sua senha: ");
                password = sc.nextInt();
            }
        }
        System.out.println("Acesso Permitido");
        sc.close();
    }
}
