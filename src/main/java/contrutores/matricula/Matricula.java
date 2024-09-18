package contrutores.matricula;

public class Matricula {
    private Aluno aluno = new Aluno();
    private Disciplina disciplina = new Disciplina();
    double n1;
    double n2;
    double n3;

    public Matricula(){

    }

    public Matricula(Aluno aluno, Disciplina disciplina, double nota1, double nota2, double n3) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.n1 = nota1;
        this.n2 = nota2;
        this.n3 = n3;
    }

    public Matricula(Aluno aluno, Disciplina disciplina) {
        this.aluno = aluno;
        this.disciplina = disciplina;
    }

    public double getMedia() {
        return(n1+n2+n3)/3;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public double getNota1() {
        return n1;
    }

    public void setNota1(double nota1) {
        this.n1 = nota1;
    }

    public double getNota2() {
        return n2;
    }

    public void setNota2(double nota2) {
        this.n2 = nota2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }
}
