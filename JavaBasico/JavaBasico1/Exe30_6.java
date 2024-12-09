package CursoJavaNelioAlves1;
import java.util.Locale;
import java.util.Scanner;

public class Exe30_6 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /* Fazer um programa que leia três valores com ponto flutuante:
        A, B e C. Em seguida, calcule e mostre:

        a) a área do triângulo retângulo que tem A por base e C por altura.
        b) a área do círculo de raio C. (pi = 3.14159)
        c) a área do trapézio que tem A e B por bases e C por altura.
        d) a área do quadrado que tem lado B.
        e) a área do retângulo que tem lados A e B. */

        double A,B,C, pi = 3.14159;
        double areaTri,areaCir,areaTra,areaQua,areaRet;

        System.out.print("Digite o valores de A,B e C: ");
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        areaTri = (A * C)/2.0;
        areaCir = pi * Math.pow(C,2.0);
        areaTra = ((A+B)*C)/2;
        areaQua = Math.pow(B,2.0);
        areaRet = A * B;

        System.out.printf("Area do Triângulo: %.3f%n",areaTri);
        System.out.printf("Area do Circulo: %.3f%n", areaCir);
        System.out.printf("Area do Trapézio: %.3f%n", areaTra);
        System.out.printf("Area do Quadrado: %.3f%n", areaQua);
        System.out.printf("Area do Retângulo: %.3f%n",areaRet);

        sc.close();

    }
}
