package heranca.exercicioBanco;

public class ContaUiversitaria extends ContaCorrente{

    /*
    - Conta universitária: saque apenas se tiver saldo (verificar também a transferência) e o saldo não pode ultrapassar o valor de 2.000,00
    (controlar no depósito e transferência).
     */

    final double vlMax = 2000;

    public ContaUiversitaria(int conta, int agencia, double vlMax){
        super(conta, agencia);
    }

    @Override
    public boolean deposito(int conta, int agencia, double valor) {
        if(valor+getSaldo() < vlMax){
            return super.deposito(conta, agencia, valor);
        }
        return false;
    }

    @Override
    public boolean transferencia(int agencia, int conta, double valor) {
        if(valor+getSaldo() < vlMax) {
            return super.transferencia(agencia, conta, valor);
        }
        return false;
    }
}
