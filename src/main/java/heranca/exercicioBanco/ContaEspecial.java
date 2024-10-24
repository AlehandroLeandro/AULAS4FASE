package heranca.exercicioBanco;

public class ContaEspecial extends ContaCorrente{

    /*- Conta especial: possui além dos atributos de conta corrente, também um limite (cadastrado pelo usuário).
    O saque é permitido até o limite contradado (verificar também a transferência).
*/
    private double limite;

    public ContaEspecial(int conta, int agencia, double limite){
        super(conta, agencia);
        this.limite = limite;
    }

    @Override
    public boolean saque(double valor) {
        if(valor <= limite+getSaldo()){
            return super.saque(valor);
        }
        return false;
    }

    @Override
    public boolean transferencia(int agencia, int conta, double valor) {
        if(valor <= limite+getSaldo()) {
            return super.transferencia(agencia, conta, valor);
        } return false;
    }
}
