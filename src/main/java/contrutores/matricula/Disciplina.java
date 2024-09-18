package contrutores.matricula;

public class Disciplina {
    private String nome;
    private double cargaHoras;
    private Professor professor = new Professor();

    public Disciplina() {
        setNome("POO");
    }

    public Disciplina(String nome, double cargaHoras, Professor professor) {
        this.nome = nome;
        this.cargaHoras = cargaHoras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCargaHoras() {
        return cargaHoras;
    }

    public void setCargaHoras(double cargaHoras) {
        this.cargaHoras = cargaHoras;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
