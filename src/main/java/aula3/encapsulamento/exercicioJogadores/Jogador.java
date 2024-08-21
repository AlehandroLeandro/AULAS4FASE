package aula3.encapsulamento.exercicioJogadores;

public class Jogador {
    private String nome;
    private int gols;
    private int camisa;

    public void cadastraJogador(String nome, int gols, int camisa){
        setNome(nome);
        setCamisa(camisa);
        setGols(gols);
    }

    public String dados(){
        return getNome() + "(" + getCamisa() + ") - Gols: " + getGols() + "\n";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    public int getCamisa() {
        return camisa;
    }

    public void setCamisa(int camisa) {
        this.camisa = camisa;
    }
}
