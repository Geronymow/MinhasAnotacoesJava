package application;

import entities.Aluno;
import entities.Curso;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many students for course A? ");
        int n = sc.nextInt();
        sc.nextLine();
        Curso a = new Curso();
        Curso b = new Curso();
        Curso c = new Curso();

        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            Aluno aluno = new Aluno(x);
            a.getList().add(aluno);
        }

        System.out.print("How many students for course B? ");
        int j = sc.nextInt();
        for (int i = 1; j <= n; j++) {
            int x = sc.nextInt();
            Aluno aluno = new Aluno(x);
            b.getList().add(aluno);
        }

        System.out.print("How many students for course C? ");
        int k = sc.nextInt();
        for (int i = 1; i <= k; i++) {
            int x = sc.nextInt();
            Aluno aluno = new Aluno(x);
            c.getList().add(aluno);
        }

        Set<Aluno> total = new HashSet<>(a.getList());
        total.addAll(b.getList());
        total.addAll(c.getList());


        System.out.println("Total students: " + total.size());

    }
}
