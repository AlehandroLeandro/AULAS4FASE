package aula3.encapsulamento;

public class UsaAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome("Joãozinho");
        a1.setIdade(9548);
        System.out.println(a1.retornaDados());
    }
}
