package entities;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String cursoNome;

    private List<Disciplina> disciplinaCurso = new ArrayList<>();

    public Curso() {
    }

    public Curso(String cursoNome) {
        this.cursoNome = cursoNome;
    }

    public String getCursoNome() {
        return cursoNome;
    }

    public void setCursoNome(String cursoNome) {
        this.cursoNome = cursoNome;
    }

    public List<Disciplina> getDisciplinaCurso() {
        return disciplinaCurso;
    }

    public void addDisciplina(Disciplina disciplina) {
        disciplinaCurso.add(disciplina);
    }

    public void removeDisciplina(Disciplina disciplina) {
        disciplinaCurso.remove(disciplina);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int count = 1;

        sb.append("=== Curso: ").append(cursoNome).append(" ===").append("\n").append("\n");
        sb.append("Disciplinas do Curso: ").append("\n");

        for (Disciplina disciplina : disciplinaCurso) {
            sb.append(count++).append(". ").append(disciplina.getDisciplinaNome()).append("\n");
            sb.append("Professor: ").append(disciplina.getProfessor()
                    .getProfessorNome()).append("\n").append("Alunos Matriculados: \n");
                    for(Aluno aluno : disciplina.getAlunoList()) {
                        sb.append("- ").append(aluno.getAlunoNome()).append(" (").append("Matrícula: ")
                                .append(aluno.getAlunoNum()).append(")"). append("\n");
                    }
                    sb.append("\n");
        }

        sb.append("====================================");
        sb.append("\n");
        return sb.toString();
    }

    public void listarInformacoesAluno(Aluno aluno) {
        System.out.println("Aluno: " + aluno.getAlunoNome() + " (Matrícula: " + aluno.getAlunoNum() + ")");
        System.out.println("Disciplinas cursando:");
        for (Disciplina d : aluno.getDisciplinaAluno()) {
            System.out.println("  - " + d.getDisciplinaNome());

        }
        System.out.println();

    }

}
