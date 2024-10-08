package construtores.medicamento;

import java.util.ArrayList;

public class Farmacia {
//cria os novos objetos e joga para uma ArrayList
    private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
    private ArrayList<Medicamento> medicamentos = new ArrayList<Medicamento>();
    private ArrayList<Prescricao> prescricoes = new ArrayList<Prescricao>();
//puxando os objetos
    public ArrayList<Prescricao> getPrescricoes() {
        return prescricoes;
    }
    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }
    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void adicionaPaciente(Pessoa p) {
        pessoas.add(p);
    }

    public void adicionaMedicamentos(Medicamento m) {
        medicamentos.add(m);
    }
/*faz a prescriçao propriamente dita. Explicação: usamos a estrutura for each para percorrer as indicações do medicamento,
 com o if comparamos o valor da string da indicação com a string do sintoma do paciente. Caso a String seja a mesma,
 adicionamos uma prescrição a ArrayList de prescricoes passando os parametros 'p' e 'm'. Caso a string não seja a mesma,
 a função retorna false e nada acontece.
*/
    public boolean prescreverMedicamento(Pessoa p, Medicamento m) {
        for (String indicacao : m.getIndicacoes()) {
            if(indicacao.equalsIgnoreCase(p.getSintoma())) {
                prescricoes.add(new Prescricao(p, m));
                return true;
            }
        }
        return false;
    }
/*
listagem de medicamentos por pessoa:
passamos o nome da pessoa que desejamos saber a medicação usada, for each para acessarmos e percorrermos a ArrayList prescricoes
se o nome contido em um dos itens de prescricoes for igual ao nome que passamos, a função irá nos retornar o nome do medicamento*/
    public String medicamentosPorPessoa(String nome) {
        String ret = "";
        for (Prescricao presc : prescricoes) {
            if(presc.getPessoa().getNome().equalsIgnoreCase(nome) ) {
                ret += presc.getMedicamento();
            }
        }
        return ret;
    }

}