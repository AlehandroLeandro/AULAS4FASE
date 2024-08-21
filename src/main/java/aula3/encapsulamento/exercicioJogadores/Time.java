package aula3.encapsulamento.exercicioJogadores;

import java.util.ArrayList;

public class Time {
    private String nome;
    private ArrayList<Jogador> jogadores = new ArrayList<Jogador>();

    public void cadastrarTime(String nome){
        setNome(nome);
    }

    public void addJogador(Jogador j){
        jogadores.add(j);
    }

    public String mostraJogadores(){
        String ret = "Jogadores do time " + getNome() + "\n\n";
        for(Jogador j: jogadores){
            ret += j.dados();
        }
        return ret;
    }

    public Jogador artilheiroTime(){
        if(jogadores.size() == 0 )
            return null;
        Jogador artilheiro = jogadores.get(0);
        for(Jogador j : jogadores) {
            if(j.getGols() > artilheiro.getGols()){
                artilheiro = j;
            }
        }
        return artilheiro;
    }

    public int golsTime(){
        int golsTime = 0;
        for(Jogador j : jogadores){
            golsTime += j.getGols();
        }
        return golsTime;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(ArrayList<Jogador> jogadores) {
        this.jogadores = jogadores;
    }
}
