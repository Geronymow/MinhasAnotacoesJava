package entities;

import java.util.HashSet;
import java.util.Set;

public class Curso {

    private Set<Aluno> list = new HashSet<>();

    public Curso() {
    }

    public Set<Aluno> getList() {
        return list;
    }

    public void setList(Set<Aluno> list) {
        this.list = list;
    }
}
