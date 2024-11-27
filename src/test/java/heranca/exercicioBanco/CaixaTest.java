package heranca.exercicioBanco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaixaTest {

    @Test
    public void testeOperacoes(){
        ContaCorrente cc = new ContaCorrente(1,100);
        ContaEspecial ce = new ContaEspecial(2,100,500);
        ContaUiversitaria cu = new ContaUiversitaria(3,100,2000);

        Caixa caixa  = new Caixa();

        //fazer deposito nas contas
        assertTrue(caixa.realizarDeposito(cc,1000));
        assertTrue(caixa.realizarDeposito(ce, 2000));
        assertFalse(caixa.realizarDeposito(cu, 2500));


        //e verificar o saldo
        assertEquals(cc.getSaldo(), 1000);
        assertEquals(ce.getSaldo(), 2000);
        assertEquals(cu.getSaldo(), 0);





    }



}