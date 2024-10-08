package construtores.medicamento;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import construtores.medicamento.Farmacia;
import construtores.medicamento.Medicamento;
import construtores.medicamento.Pessoa;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FarmaciaTest {
//puxamos a nossa classe Farmcacia
    private Farmacia f = new Farmacia();
//a tag faz com que o que está dentro dela seha executado antes de qualquer teste
    @BeforeEach
    void inicializa() {
//limpar qualquer valor que esteja dentro das classes
        f.getMedicamentos().clear();
        f.getPessoas().clear();
        f.getPrescricoes().clear();
//cadastro manual e Pessoa, passando os atributos nome e sintoma
        f.adicionaPaciente(new Pessoa("P1", "S1"));
        f.adicionaPaciente(new Pessoa("P2", "S2"));
        f.adicionaPaciente(new Pessoa("P3", "S2"));
//cadastro manual de medicamentos, atibutos:  nome, administraçaõ e indicação
        f.adicionaMedicamentos(new Medicamento("M1", "", new ArrayList<String>(Arrays.asList("S1", "S2"))));
        f.adicionaMedicamentos(new Medicamento("M2", "", new ArrayList<String>(Arrays.asList("S2"))));
        f.adicionaMedicamentos(new Medicamento("M3", "", new ArrayList<String>(Arrays.asList("S99"))));
    }

    @Test
    void prescreveMedicamentoTest() {
//verifica o tamanho da lista de pessoas
        assertEquals(3, f.getPessoas().size());
        assertEquals(3, f.getMedicamentos().size());
//prescrevendo os medicamentos passando como atributo p primeiro objeto da lista pessoa e medicamento
        f.prescreverMedicamento(f.getPessoas().get(0), f.getMedicamentos().get(0));
        f.prescreverMedicamento(f.getPessoas().get(1), f.getMedicamentos().get(0));
        f.prescreverMedicamento(f.getPessoas().get(2), f.getMedicamentos().get(0));
//verificar se a lista de prescricoes é igual ao valor, garantindo que todas as prescrições funcionaram
        assertEquals(3, f.getPrescricoes().size());
        f.prescreverMedicamento(f.getPessoas().get(0), f.getMedicamentos().get(1));
        f.prescreverMedicamento(f.getPessoas().get(1), f.getMedicamentos().get(1));
        f.prescreverMedicamento(f.getPessoas().get(2), f.getMedicamentos().get(1));
        assertEquals(5, f.getPrescricoes().size());
        f.prescreverMedicamento(f.getPessoas().get(0), f.getMedicamentos().get(2));
        f.prescreverMedicamento(f.getPessoas().get(1), f.getMedicamentos().get(2));
        f.prescreverMedicamento(f.getPessoas().get(2), f.getMedicamentos().get(2));
        assertEquals(5, f.getPrescricoes().size());
        String ret = f.medicamentosPorPessoa("P1");
        assertEquals("M1\n", ret);
        ret = f.medicamentosPorPessoa("P2");
        assertEquals("M1\nM2\n", ret);

    }

}