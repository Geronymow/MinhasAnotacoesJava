package CursoJavaNelioAlves3;
import java.util.Scanner;

/* Ler um número inteiro N e calcular todos os seus divisores */
public class Exe54_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; n >= i; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        } sc.close();
    }
}
