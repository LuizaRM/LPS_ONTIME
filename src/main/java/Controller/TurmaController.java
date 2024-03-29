package Controller;

import Dao.TurmaDao;
import Dao.UsuarioDao;
import Model.Curso;
import Model.Disciplina;
import Model.Professor;
import Model.Turma;
import Model.Usuario;
import View.FrAdicionarTurma;
import View.FrFichaTurma;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class TurmaController {

    ArrayList<Turma> lista = new ArrayList<Turma>();
    ArrayList<Curso> listaCurso = new ArrayList<Curso>();
    ArrayList<Disciplina> listaDisciplina = new ArrayList<Disciplina>();
    ArrayList<Professor> listaProfessor = new ArrayList<Professor>();

    public TurmaController(int operacao) {
        switch (operacao) {
            case 1:
                //incluir
                FrAdicionarTurma telaAdicionarTurma2 = new FrAdicionarTurma();
                telaAdicionarTurma2.setVisible(true);
                break;
            case 2:
                //alterar
                //FrEditarUsuarioOuProfessor jfrEditUsuario = new FrEditarUsuarioOuProfessor(this, enderecoController);
                //jfrEditUsuario.setVisible(true);
                break;
            case 3:
                //excluir();
                break;
            case 4:
                //consultar
                consultar();
                break;
        }
    }

    public TurmaController(Turma turma) {
        FrFichaTurma telaFichaUsuario = new FrFichaTurma(turma);
        telaFichaUsuario.setVisible(true);
    }

    public TurmaController() {
    }

    public ArrayList<Turma> getLista() {
        return this.lista;
    }

    public void getDadosCurso() {
        TurmaDao turmaDao = new TurmaDao();
        this.listaCurso = turmaDao.getDadosCurso();
    }

    public void getDadosDisciplina() {
        TurmaDao turmaDao = new TurmaDao();
        this.listaDisciplina = turmaDao.getDadosDisciplina();
    }

    public ArrayList<Disciplina> getListaDisciplina() {
        return listaDisciplina;

    }

    public void setListaDisciplina(ArrayList<Disciplina> listaDisciplina) {
        this.listaDisciplina = listaDisciplina;
    }

    public ArrayList<Professor> getListaProfessor() {
        return listaProfessor;
    }

    public void getDadosProfessor() {
        TurmaDao turmaDao = new TurmaDao();
        this.listaProfessor = turmaDao.getDadosProfessor();
    }

    public void setListaProfessor(ArrayList<Professor> listaProfessor) {
        this.listaProfessor = listaProfessor;
    }

    public void consultar() {
        //Instanciando e setando o DAO
        TurmaDao turmaDao = new TurmaDao();
        this.lista = turmaDao.consultar();
    }

    public ArrayList<Curso> getListaCurso() {
        return listaCurso;
    }

    public void setListaCurso(ArrayList<Curso> listaCurso) {
        this.listaCurso = listaCurso;
    }

    public void adicionar(String disciplina, String curso, String professor, String ano, String semestre, String periodo, List<String> segunda, List<String> terca, List<String> quarta, List<String> quinta, List<String> sexta, String sala) {
        //não foi usado um modelo devido a diversidade dos dados(futuro)

        //Instanciando e setando o DAO
        TurmaDao turmaDao = new TurmaDao();
        turmaDao.adicionar(disciplina, curso, professor, ano, semestre, periodo, segunda, terca, quarta, quinta, sexta, sala);
    }

    public DefaultTableModel carregarUsuarioPorTipo(int ano) {
        System.out.println("Controler");
        ArrayList<Turma> lista = new ArrayList<Turma>();
        TurmaDao turmaDao = new TurmaDao();
        lista = turmaDao.consultarPorAno(ano);
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"Ano", "Semestre", "Periodo", "Disciplina", "Professor"}, 0);
        for (int i = 0; i < lista.size(); i++) {
            Object dados[] = {
                lista.get(i).getAnoTurma(),
                lista.get(i).getSemestreTurma(),
                lista.get(i).getPeriodoTurma(),
                lista.get(i).getDisciplina().getNomeDisciplina(),
                lista.get(i).getProfessor().getUsuario().getNome()};

            modelo.addRow(dados);

        }
        return modelo;
    }

    public void excluir(int id) {
        TurmaDao turmaDao = new TurmaDao();
        turmaDao.excluir(id);
    }

}
