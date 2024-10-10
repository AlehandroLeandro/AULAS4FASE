package biblioteca;

import javax.swing.*;
import java.util.ArrayList;

public class Livro {
    //atributos
    private String nome;
    private Autor autor;
    private Bibliotecario bibliotecario;
    private ArrayList<String> emprestimos = new ArrayList<String>();

    //metodo emprestar
    public void emprestar(String nomeLivro, String pessoa) {
        for(Livro nome  : bibliotecario.livrosSobResponsabilidade){
            if(bibliotecario.livrosSobResponsabilidade.contains(nome)){
                emprestimos.add("Nome: " + pessoa + " - Livro: " + nome);
            } else JOptionPane.showMessageDialog(null, "Livro não encontrado");
        }


    }

    //construtores
    public Livro() {
    }

    public Livro(String nome, Autor autor, Bibliotecario bibliotecario) {
        this.nome = nome;
        this.autor = autor;
        this.bibliotecario = bibliotecario;
    }

    //gets sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }
    //toString()
    public String toString(){
        return "Nome: " + nome + " - Autor: " + autor + " == Bibliotecário responsável: " + bibliotecario;
    }
}
