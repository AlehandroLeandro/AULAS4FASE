package heranca.exemplo;

public class Pessoa {
    private String nome;
    private int idade;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String toString(){
        return getNome() + " - " + getIdade();
    }

    @Override
    public boolean equals(Object o) {
        Pessoa outra  = (Pessoa) o;
        if(getNome().equals(outra.getNome()) && getIdade() == outra.getIdade())
            return true;
        return false;
    }
}
