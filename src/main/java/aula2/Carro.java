package aula2;

public class Carro {
    String marca;
    int anoFab;
    String cor;

    Carro car = new Carro();

    boolean cadastrarCarro(String m, int a, String c) {
        if(m.isEmpty())
            return false;
        if( a < 1980 || a > 2025)
            return false;
        if(c.isEmpty())
            return false;
        marca = m.toUpperCase();
        anoFab = a;
        cor = c.toUpperCase();
        return true;
    };

    boolean isPeriodo(int anoIn, int anoFin){
        return anoFab >= anoIn && anoFab <= anoFin;
    }

    boolean isCor(String c) {
        return cor.equals(c.toUpperCase());
    }

    boolean isMarca(String m) {
        return marca.equals(m.toUpperCase());
    }
    String mostraCarro() {
        return "Marca : " + marca + "\n" +
                "Ano : " + anoFab+ "\n" +
                "Cor : " + cor + "\n";

    }
}




