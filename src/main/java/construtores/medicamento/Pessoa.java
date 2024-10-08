package construtores.medicamento;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private String nome;
    private String sintoma;
//contrutor
    public Pessoa(String nome, String sintoma) {
        setNome(nome);
        setSintoma(sintoma);
    }
//gets e sets basicos
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
//toString padrao tbm
    @Override
    public String toString() {
        return getNome()+" (" +getSintoma()+")\n";
    }


}