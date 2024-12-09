package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

/* Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três
trimestres do ano (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final,
mostrar qual a nota final do aluno no ano. Dizer também se o aluno está aprovado (PASS) ou
não (FAILED) e, em caso negativo, quantos pontos faltam para o aluno obter o mínimo para
ser aprovado (que é 60% da nota). Você deve criar uma classe Student para resolver
este problema. */

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        student.name = sc.nextLine();
        student.testScore1 = sc.nextDouble();
        student.gradeCheck();
        student.testScore2 = sc.nextDouble();
        student.gradeCheck();
        student.testScore3 = sc.nextDouble();
        student.gradeCheck();

        if ((student.testScore1 > 30 || student.testScore1 < 0) ||
                (student.testScore2 > 35 || student.testScore2 < 0) ||
                (student.testScore3 > 35 || student.testScore3 < 0)) {

            System.out.println("End of Program");
        }
        else {
            student.decision();
        }
        sc.close();
    }
}
