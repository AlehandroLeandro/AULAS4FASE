package heranca.exercicioBanco;

import java.util.ArrayList;

public class Conta {
    /*Todas as contas possuem:

- número

- agencia

- saldo

E podem realizar:

- Depósito

- Saque

- Transferência (somente entre contas da mesma agência)*/

    private int conta;
    private int agencia;
    private double saldo;

    ArrayList<Conta> contas = new ArrayList<Conta>();


    public boolean deposito(int conta, int agencia, double valor){
        if(getConta() == conta && getAgencia() == agencia){
            saldo += valor;
            return true;
        }
        return false;
    }
    public boolean saque(double valor){
        if(valor <= getSaldo()){
            saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferencia(int agencia, int conta, double valor){
        if(getAgencia() == agencia){
            for(Conta c : contas){
                if(c.getConta() == conta){
                    setSaldo(getSaldo() - valor);
                    c.setSaldo(getSaldo() + valor);
                    return true;
                }
            }
        }
        return false;
    }

    public Conta(int conta, int agencia) {
        this.conta = conta;
        this.agencia = agencia;
    }

    public Conta() {
    }



    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return getAgencia() + " " + getConta();
    }
}
