package heranca.Zoologico;

public class AnimalPerigoso extends Animal{

    private int nvlPerigo;

    public AnimalPerigoso(String nome, String ruido, String comida, String modoAlim, int nvlPerigo){
        super(nome, ruido, comida, modoAlim);
        this.nvlPerigo = nvlPerigo;
    }
}
