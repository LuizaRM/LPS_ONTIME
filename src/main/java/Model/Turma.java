package Model;

public class Turma {

    private int idTurma;
    private int idDisciplina;
    private int idProfessor;
    private int idCurso;
    private int anoTurma;
    private int semestreTurma;
    private String salaTurma;
    private int periodoTurma;
    private Disciplina disciplina;
    private Professor professor;
    private Curso curso;

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    
    public int getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(int idTurma) {
        this.idTurma = idTurma;
    }

    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public int getAnoTurma() {
        return anoTurma;
    }

    public void setAnoTurma(int anoTurma) {
        this.anoTurma = anoTurma;
    }

    public int getSemestreTurma() {
        return semestreTurma;
    }

    public void setSemestreTurma(int semestreTurma) {
        this.semestreTurma = semestreTurma;
    }

    public String getSalaTurma() {
        return salaTurma;
    }

    public void setSalaTurma(String salaTurma) {
        this.salaTurma = salaTurma;
    }

    public int getPeriodoTurma() {
        return periodoTurma;
    }

    public void setPeriodoTurma(int periodoTurma) {
        this.periodoTurma = periodoTurma;
    }

}
