package contrutores.matricula;

import java.util.ArrayList;

public class Sistema {

    private ArrayList<Professor> professores = new ArrayList<Professor>();
    private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    private ArrayList<Matricula> matriculas = new ArrayList<Matricula>();

    public void cadProfessor(String nome, int formacao){
        professores.add(new Professor(nome, formacao));
    }

    public void cadDiscplina(String nome, double cargaHoraria, Professor p){
        disciplinas.add(new Disciplina(nome, cargaHoraria, p));
    }

    public void cadAluno(String nome){
        alunos.add(new Aluno(nome));
    }

    public void fazMatricula(Aluno a, Disciplina d){
        matriculas.add(new Matricula(a,d));
    }

    public void cadastrarNotas(Matricula m, double n1, double n2, double n3){
        m.setNota1(n1);
        m.setNota2(n2);
        m.setN3(n3);
    }
    public String listaDisciplinaAluno(Aluno a) {
        String ret = "";
        for (Matricula m : matriculas) {
            if (m.getAluno().getNome().equalsIgnoreCase(a.getNome())) {
                ret += m.getDisciplina().getNome() + " - " + m.getMedia() + "\n";
            }
        }
        return ret;
    }

    public String listaDisciplinasPos(){
        String ret = "";
        for(Disciplina d : disciplinas){
            if(d.getProfessor().getFormacao() == 3) {
                ret += d.getNome()+ "\n";
            }
        }
        return ret;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(ArrayList<Matricula> matriculas) {
        this.matriculas = matriculas;
    }
}
