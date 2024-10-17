package heranca.exercicioFarmacia;

import java.util.Random;

public class Medicamento extends Produto {

    private boolean receitaObrigatoria;
    Random rd = new Random();


    public Medicamento() {
        super();
        this.receitaObrigatoria = rd.nextBoolean();
    }
    public Medicamento(String nome, int estoque, double valor, boolean receitaObrigatoria) {
        // Chama o construtor da classe Produto para inicializar nome, estoque e valor
        super(nome, estoque, valor);
        this.receitaObrigatoria = receitaObrigatoria; // Inicializa receita obrigatória
    }



}