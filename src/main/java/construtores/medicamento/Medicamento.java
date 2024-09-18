package construtores.medicamento;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Medicamento {

    private String nome;
    private String  administracao;
    private List<String> listaIndicacoes = new ArrayList<>();


    public Medicamento() {
    }

    public Medicamento(String nome, String administracao, List<String> listaIndicacoes) {
        this.nome = nome;
        this.administracao = administracao;
        this.listaIndicacoes = listaIndicacoes;
    }

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

    public List<String> getListaIndicacoes() {
        return listaIndicacoes;
    }

    public void setListaIndicacoes(List<String> listaIndicacoes) {
        this.listaIndicacoes = listaIndicacoes;
    }

}
