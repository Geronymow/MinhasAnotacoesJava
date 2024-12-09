package entities;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    private String disciplinaNome;
    private Professor professor;

    private List<Aluno> alunoList = new ArrayList<>();

    public Disciplina(String DisciplinaNome) {
        this.disciplinaNome = DisciplinaNome;
    }

    public Disciplina(String disciplinaNome, Professor professor) {
        this.disciplinaNome = disciplinaNome;
        this.professor = professor;
    }

    public String getDisciplinaNome() {
        return disciplinaNome;
    }

    public void setDisciplinaNome(String disciplinaNome) {
        this.disciplinaNome = disciplinaNome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(entities.Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunoList() {
        return alunoList;
    }

    public void addAluno(Aluno aluno) {
        alunoList.add(aluno);
    }

    public void removeAluno(Aluno aluno) {
        alunoList.add(aluno);
    }


}
