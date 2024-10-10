package biblioteca;

import javax.swing.*;
import java.util.ArrayList;

public class Bibliotecario {
    //atributos
    private String nome;
    ArrayList<Livro> livrosSobResponsabilidade;

    //metodo para cadastrar livro -- já adiciona o livro na lista de livros do autor e de livrosSobResponsabilidade do bibliotecário
    public void cadastrarLivro(String titulo, Autor autor){
        Livro novoLivro = new Livro(titulo, autor,this);
        addLivro(novoLivro);
        autor.addLivro(novoLivro);
        JOptionPane.showMessageDialog(null, "Livro" + nome + " cadastrado na responsabilidade de " + nome);
    }

    //metodo para adicionar livros a lista de livros livrosSobResponsabilidade
     public void addLivro(Livro livro){
        livrosSobResponsabilidade.add(livro);
     }

    //construtores
    public Bibliotecario() {
    }

    public Bibliotecario(String nome) {
        this.nome = nome;
        this.livrosSobResponsabilidade = new ArrayList<>();
    }

    //gets sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Livro> getLivrosEmprestados() {
        return livrosSobResponsabilidade;
    }

    public void setLivrosEmprestados(ArrayList<Livro> livros) {
        this.livrosSobResponsabilidade = livros;
    }

    public String toString(){
        return "Nome: " + nome;
    }
}
