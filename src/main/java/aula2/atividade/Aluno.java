package aula2.atividade;

public class Aluno {
    String nome;
    Double[] notas = new Double[3];

    Aluno a = new Aluno();
    void cadAluno(String nm, double nt) {
        a.nome = nm;
        for(int i = 0; i <3; i++){
            a.notas[i] = nt;
        }
    }

    double calcMedia(int nt){
        double totalNotas = 0;
        for(int i = 0; i < 3; i++){
            totalNotas += a.notas[i];
        }

        return totalNotas/3;

    }


}



