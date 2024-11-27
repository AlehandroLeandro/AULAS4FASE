package heranca.exercicioBanco;

import javax.swing.*;
import java.util.List;

public class Caixa {

    public boolean realizarDeposito(Conta conta, double valor){
        return conta.deposito(conta.getConta(), conta.getAgencia(), valor);
    }

    public boolean realizarSaque(Conta conta, double valor){
        return conta.saque(valor);
    }

    public boolean realizarTranferencia(Conta ctOrigem, Conta ctDestino, double valor){
        return ctOrigem.transferencia(ctDestino.getAgencia(), ctDestino.getConta(), valor);
    }

}
