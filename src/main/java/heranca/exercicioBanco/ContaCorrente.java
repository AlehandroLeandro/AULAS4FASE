package heranca.exercicioBanco;

public class ContaCorrente extends Conta{

    //- Conta corrente: permite realizar saque apenas se tiver saldo (verificar também a transferência).


    public ContaCorrente(int conta, int agencia) {
        super(conta, agencia);
    }

    @Override
    public boolean transferencia(int agencia, int conta, double valor){
        if(getSaldo() > valor){
            return super.transferencia(agencia, conta, valor);
        }
        return false;
    }

    @Override
    public boolean saque(double valor){
        if(getSaldo() >= valor){
            return super.saque(valor);
        }
        return false;
    }
}
