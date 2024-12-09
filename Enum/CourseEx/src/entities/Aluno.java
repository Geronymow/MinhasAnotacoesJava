package entities;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private String AlunoNome;
    private Integer AlunoNum;

    private List<Disciplina> disciplinaAluno = new ArrayList<Disciplina>();

    public Aluno() {
    }

    public Aluno(String nome, Integer alunoNum) {
        this.AlunoNome = nome;
        AlunoNum = alunoNum;
    }

    public String getAlunoNome() {
        return AlunoNome;
    }

    public void setAlunoNome(String alunoNome) {
        AlunoNome = alunoNome;
    }

    public Integer getAlunoNum() {
        return AlunoNum;
    }

    public void setAlunoNum(Integer alunoNum) {
        AlunoNum = alunoNum;
    }

    public List<Disciplina> getDisciplinaAluno() {
        return disciplinaAluno;
    }

    public void addDisciplina(Disciplina disciplina) {
        disciplinaAluno.add(disciplina);
    }

    public void removeDisciplina(Disciplina disciplina) {
        disciplinaAluno.remove(disciplina);
    }

}

