package aula3.encapsulamento;

public class Aluno {
    private String nome;
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade<0 || idade>18 )
            this.idade = 0;
        else
            this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    String retornaDados(){
        return nome + " - " + idade;
    }
}

