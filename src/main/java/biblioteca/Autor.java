package biblioteca;

import java.util.ArrayList;
import java.util.concurrent.RecursiveTask;

public class Autor {
    private String nome;
    private ArrayList<Livro> livrosEscritos;

    public void addLivro(Livro livro) {
        livrosEscritos.add(livro);
    }

    public Autor() {
    }

    public Autor(String nome) {
        this.nome = nome;
        this.livrosEscritos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Livro> getLivrosEscritos() {
        return livrosEscritos;
    }

    public void setLivrosEscritos(ArrayList<Livro> livros) {
        this.livrosEscritos = livros;
    }

    public String toString() {
        return "Nome: " + nome;
    }
}
