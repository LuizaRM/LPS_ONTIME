
package Controller;

import Dao.TurmaDao;
import Model.Turma;

public class TurmaController {
    
    public TurmaController(){        
    }
    
    public void adicionar( int idTurma,int  idDisciplina, int idProfessor, int idCurso,int anoTurma,
    int semestreTurma,String salaTurma, int periodoTurma){
        
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
    
}
