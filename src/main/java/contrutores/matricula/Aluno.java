package contrutores.matricula;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Aluno {

    private String nome;

    public Aluno() {
        this("Joaozinho");
    }

    public void cadAluno(String nome){
        setNome(nome);
    }

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
