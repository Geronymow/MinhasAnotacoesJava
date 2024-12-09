package application;

import entities.Aluno;
import entities.Curso;
import entities.Disciplina;
import entities.Professor;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Adicionar Curso");
        String cursoNome = sc.nextLine();

        Curso curso = new Curso(cursoNome);

        System.out.println("Curso criado!!");
        System.out.println();

        System.out.println("Suas 2 disciplinas: ");
        System.out.print("Nome primeira disciplina: ");
        String disciplinaNome1 = sc.nextLine();
        System.out.print("Nome primeira disciplina: ");
        String disciplinaNome2 = sc.nextLine();

        Disciplina disciplina1 = new Disciplina(disciplinaNome1);
        Disciplina disciplina2 = new Disciplina(disciplinaNome2);

        curso.addDisciplina(disciplina1);
        curso.addDisciplina(disciplina2);


        Professor professor1 = new Professor("Paulo Freire","Engenharia de Software");
        Professor professor2 = new Professor(
                "Fabíola Castanha","Análise e Desenvolvimento de Sistemas");

        disciplina1.setProfessor(professor1);
        disciplina2.setProfessor(professor2);

        Aluno aluno1 = new Aluno("Guilherme Geronymo",3043115);
        Aluno aluno2 = new Aluno("Gabriel Felipe",3043116);
        Aluno aluno3 = new Aluno("Larissa Manoela",3043117);
        Aluno aluno4 = new Aluno("Rodolfo da Silva",3043118);
        Aluno aluno5 = new Aluno("Giovana Fonseca",3043119);

        disciplina1.addAluno(aluno1);
        disciplina2.addAluno(aluno1);
        disciplina1.addAluno(aluno2);
        disciplina2.addAluno(aluno3);
        disciplina2.addAluno(aluno4);
        disciplina2.addAluno(aluno5);


        professor1.addDisciplina(disciplina1);
        professor1.addDisciplina(disciplina2);
        professor2.addDisciplina(disciplina1);
        professor2.addDisciplina(disciplina2);

        aluno1.addDisciplina(disciplina1);
        aluno2.addDisciplina(disciplina1);
        aluno2.addDisciplina(disciplina2);
        aluno3.addDisciplina(disciplina2);
        aluno4.addDisciplina(disciplina1);
        aluno4.addDisciplina(disciplina2);
        aluno5.addDisciplina(disciplina2);

        System.out.println(curso);
        curso.listarInformacoesAluno(aluno1);
        curso.listarInformacoesAluno(aluno2);
        curso.listarInformacoesAluno(aluno3);
        curso.listarInformacoesAluno(aluno4);
        curso.listarInformacoesAluno(aluno5);


    }
}
