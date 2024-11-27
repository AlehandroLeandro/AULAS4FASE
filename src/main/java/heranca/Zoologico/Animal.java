package heranca.Zoologico;

public class Animal {
    private String nome;
    private String ruido;
    private String comida;
    private String modoAlim;

    public Animal(String nome, String ruido, String comida, String modoAlim) {
        this.nome = nome;
        this.ruido = ruido;
        this.comida = comida;
        this.modoAlim = modoAlim;
    }

    public Animal() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRuido() {
        return ruido;
    }

    public void setRuido(String ruido) {
        this.ruido = ruido;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public String getModoAlim() {
        return modoAlim;
    }

    public void setModoAlim(String modoAlim) {
        this.modoAlim = modoAlim;
    }
}
