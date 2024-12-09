package CursoJavaNelioAlves1;
import java.util.Locale;
import java.util.Scanner;

public class Exe30_2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /* Faça um programa para ler o valor do raio de um círculo, e
       depois mostrar o valor da área deste círculo com quatro
       casas decimais.
       Fórmula da área: area = π . raio2
       Considere o valor de π = 3.14159 */

        double raio,area, pi = 3.14159;

        System.out.print("Digite o Raio do Circulo: ");
        raio = sc.nextDouble();

        area = pi * Math.pow(raio,2.0);

        System.out.printf("A area do circulo é: %.4f%n",area);

        sc.close();

    }
}
