package construtores.medicamento;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Medicamento {

    private String nome;
    private String administracao;
    private ArrayList<String> indicacoes = new ArrayList<String>();
//contrutor
    public Medicamento(String nome, String administracao, ArrayList<String> indicacoes) {
        this.nome = nome;
        this.administracao = administracao;
        this.indicacoes = indicacoes;
    }
//gets e sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAdministracao() {
        return administracao;
    }

    public void setAdministracao(String administracao) {
        this.administracao = administracao;
    }

    public ArrayList<String> getIndicacoes() {
        return indicacoes;
    }

    public void setIndicacoes(ArrayList<String> indicacoes) {
        this.indicacoes = indicacoes;
    }
//toString padrao
    @Override
    public String toString() {
        return getNome() + "\n";
    }
}
