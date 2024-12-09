package CursoJavaNelioAlves4;
import java.util.Scanner;

public class Java3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mask = 0b100000;
        // Digitando 32 em binário.
        int n = sc.nextInt();

        if ((n & mask) != 0) {
            // Se o sexto bit não for 0, a afirmação é verdadeira.
            System.out.println("6th bit is true!");
        }
        else {
            System.out.println("6th bit is false!");
        }
        sc.close();
    }
}
