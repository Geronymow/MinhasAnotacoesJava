package entities;

import java.util.ArrayList;
import java.util.List;

public class Professor {

    private String ProfessorNome;
    private String AreaEsp;

    private List<Disciplina> disciplinaProf = new ArrayList<Disciplina>();

    public Professor() {
    }

    public Professor(String professorNome, String areaEsp) {
        ProfessorNome = professorNome;
        AreaEsp = areaEsp;
    }

    public String getProfessorNome() {
        return ProfessorNome;
    }

    public void setProfessorNome(String professorNome) {
        ProfessorNome = professorNome;
    }

    public String getAreaEsp() {
        return AreaEsp;
    }

    public void setAreaEsp(String areaEsp) {
        AreaEsp = areaEsp;
    }

    public List<Disciplina> getDisciplinaProf() {
        return disciplinaProf;
    }

    public void addDisciplina(Disciplina disciplina) {
        disciplinaProf.add(disciplina);
    }

    public void removeDisciplina(Disciplina disciplina) {
        disciplinaProf.remove(disciplina);
    }



}
