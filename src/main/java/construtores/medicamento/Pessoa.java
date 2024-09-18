package construtores.medicamento;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private String sintoma;
    private List<Medicamento> listaMed = new ArrayList<>();



    public Pessoa() {
    }

    public Pessoa(String nome, String sintoma) {
        this.nome = nome;
        this.sintoma = sintoma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    public List<Medicamento> getListaMed() {
        return listaMed;
    }

    public void setListaMed(List<Medicamento> listaMed) {
        this.listaMed = listaMed;
    }
    public void addMedicamento(Medicamento medicamento){
        listaMed.add(medicamento);
    }

}

