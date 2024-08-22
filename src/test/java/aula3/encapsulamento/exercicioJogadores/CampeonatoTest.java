package aula3.encapsulamento.exercicioJogadores;

import aula3.encapsulamento.exercicioJogadores.Campeonato;
import aula3.encapsulamento.exercicioJogadores.Jogador;
import aula3.encapsulamento.exercicioJogadores.Time;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CampeonatoTest {

    Campeonato champ = new Campeonato();

    @BeforeEach
    void inicializa(){
        champ.getTimes().clear();

        champ.cadastrarTime("Time 2");
        champ.addJogador("Time 2", "J2", 1, 2);
        champ.addJogador("Time 2", "J3", 2, 2);
        champ.addJogador("Time 2", "J4", 3, 2);
        champ.addJogador("Time 2",  "J5", 5, 6);

        champ.cadastrarTime("Time 1");
        champ.addJogador("Time 1", "J1", 1, 2);
        champ.addJogador("Time 1", "J6", 2, 2);
        champ.addJogador("Time 1", "J7", 3, 2);
        champ.addJogador("Time 1",  "J8", 5, 6);
    }

    @Test
    void timeMaisGolsTest(){
        Time t = champ.timeMaisGols();
        assertEquals("Time 1", t.getNome());
    }

    @Test
    void timesMaisGolSemTimeCadTest () {
        champ.getTimes().clear();
        Time t = champ.timeMaisGols();
        assertNull(t);
    }

    @Test
    void articCampeonatoSemTimeCadTest(){
        champ.getTimes().clear();
        Jogador j = champ.artilheiroCampeonato();
        assertNull(j);
    }

    @Test
    void listaJogadoreTime(){
        String s = champ.listaJogadoresTime("Time 2");
        String esperado = "*** Jogadores do time Time 2 ***\n\n";
        esperado += "J5(Camisa 5): 1 gols\n";
        esperado += "J5(Camisa 5): 1 gols\n";
        esperado += "J5(Camisa 5): 1 gols\n";
        esperado += "J5(Camisa 5): 1 gols\n";

    }


}