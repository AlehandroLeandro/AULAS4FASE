package heranca.exemplo;

public class MetodosEspeciais {
    public static void main(String[] args) {
        Pessoa p1= new Pessoa();
        p1.setNome("A");
        p1.setIdade(15);

        Pessoa p2= new Pessoa();
        p1.setNome("A");
        p1.setIdade(15);

        Pessoa p3 = p1;

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));

    }
}
