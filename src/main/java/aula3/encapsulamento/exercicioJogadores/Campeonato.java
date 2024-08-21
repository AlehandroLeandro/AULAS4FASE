package aula3.encapsulamento.exercicioJogadores;

import java.util.ArrayList;

public class Campeonato {
    private ArrayList<Time> times = new ArrayList<Time>();

    public void cadastrarTime(String nome){
        Time t = new Time();
        t.cadastrarTime(nome);
        times.add(t);
    }

    public void addJogador(String nomeTime, String nomeJogador, int camisa, int gols){
        Jogador j = new Jogador();
        j.cadastraJogador(nomeJogador, camisa, gols);
        Time t = buscaTime(nomeTime);
        if(t!=null) {
            t.addJogador(j);
        }

    }

    public String listaJogadoresTime(String nomeTime){
        Time t = buscaTime(nomeTime);
        if(t!=null)
            return t.mostraJogadores();
        return null;
    }

    public Jogador artilheiroCampeonato(){
        Jogador artilheiro = new Jogador();
        for(Time t : times){
            if(t.artilheiroTime().getGols() > artilheiro.getGols())
                artilheiro = t.artilheiroTime();
        }
        return artilheiro;
    }
    public Time timeMaisGols(){
        if(times.size() == 0)
            return null;

        Time timeMaisGols = times.get(0);
        for(Time t : times){
            if(t.golsTime() > timeMaisGols().golsTime())
                timeMaisGols = t;
        }
        return timeMaisGols;
    }

    public Time buscaTime(String nome){
        for(Time t : times){
            if(t.getNome().equalsIgnoreCase(nome))
                return t;
        }
        return null;
    }

    public ArrayList<Time> getTimes() {
        return times;
    }

    public void setTimes(ArrayList<Time> times) {
        this.times = times;
    }
}
