package aula2.exemplosmetodos;

public class PrincipalParametros {
    public static void main(String[] args) {
        int num = 10;
        testePrim(num);
        System.out.println(num);

        Pessoa pes = new Pessoa();
        //embora o objetos esteja recebendo os dados, por ser referenciado na classe testeReferencia, ele é alterado
        pes.nome = "Marcos";
        pes.idade = 21;
        testeReferencia(pes);
        System.out.println(pes.nome + " - " + pes.idade);

    }
    static void testePrim(int x){
        x = x* 2;
        System.out.println(x);
    }
    static void testeReferencia(Pessoa p){
        p.nome = "XXXX";
        p.idade = 5000;
        System.out.println(p.nome + " - " + p.idade);
    }
}
