package Controller;

import Dao.TurmaDao;
import Dao.UsuarioDao;
import Model.Turma;
import Model.Usuario;
import View.FrAdicionarTurma;
import java.util.ArrayList;

public class TurmaController {
    ArrayList<Turma> lista = new ArrayList<Turma>();

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
      public ArrayList<Turma> getLista() {
        return this.lista;
    }

    public void adicionar(int idTurma, int idDisciplina, int idProfessor, int idCurso, int anoTurma,
            int semestreTurma, String salaTurma, int periodoTurma) {

        //Instanciando e setando o modelo
        Turma turma = new Turma();
        turma.setIdTurma(idTurma);
        turma.setIdDisciplina(idDisciplina);
        turma.setIdProfessor(idProfessor);
        turma.setIdCurso(idCurso);
        turma.setAnoTurma(anoTurma);
        turma.setSemestreTurma(semestreTurma);
        turma.setSalaTurma(salaTurma);
        turma.setPeriodoTurma(periodoTurma);

        //Instanciando e setando o DAO
        TurmaDao turmaDao = new TurmaDao();
        turmaDao.adicionar(turma);
    }
    
     public void consultar() {
        //Instanciando e setando o DAO
        TurmaDao turmaDao = new TurmaDao();
        this.lista = turmaDao.consultar();

    }

}
