package construtores.medicamento;

import java.util.ArrayList;
import java.util.List;

public class Prescricao {
    private List<Medicamento> medicamentos = new ArrayList<>();
    private List<Pessoa> pessoas = new ArrayList<>();

    public void cadMedicamento(Medicamento medicamento){
        medicamentos.add(medicamento);
    }

    public void cadPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public void prescMed(Pessoa pessoa, Medicamento medicamento){
        if(medicamento.getListaIndicacoes().contains(pessoa.getSintoma())){
           pessoa.addMedicamento(medicamento);
        }
    }

    public void listMediPrescPessoa(){
        for(Pessoa pessoa : pessoas){
            System.out.println("Pessoa: " + pessoa.getNome() + ", Sintoma: " + pessoa.getSintoma());
            if (pessoa.getListaMed().isEmpty()){
                System.out.println("Nenhum medicamento prescrito.");
            } else{
                System.out.println("Medicamentos prescritos: ");
                for(Medicamento medicamento : pessoa.getListaMed()){
                    System.out.println("- " + medicamento.getNome() + "(Administração: " + medicamento.getAdministracao() + ")");
                }
            }
        }
    }
}
