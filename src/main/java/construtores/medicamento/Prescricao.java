package construtores.medicamento;

import java.util.ArrayList;
import java.util.List;

public class Prescricao {

    private Pessoa pessoa;
    private Medicamento medicamento;

//contrutor aqui tbm
    public Prescricao(Pessoa pessoa, Medicamento medicamento) {
        this.pessoa = pessoa;
        this.medicamento = medicamento;
    }
//gets e sets denovo grazadeus
    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }
//de sempre
    @Override
    public String toString() {
        return pessoa + " - " + medicamento;
    }

}