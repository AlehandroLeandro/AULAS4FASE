package heranca.exemplo;

public class Medico extends Pessoa {
    private int crm;

    public String consultar(){
        return "Consultando";
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    //@override herda e moditifica algo que já existe na superClasse, como o tostring, que já existe, mas nãoa tende a tudo que o médico precisa
    @Override
    public String toString(){
        return "Doutor(a): " + super.toString() + " - " + getCrm();
    }


}
