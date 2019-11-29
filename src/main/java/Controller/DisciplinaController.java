package Controller;

import Dao.DisciplinaDao;
import Model.Disciplina;

public class DisciplinaController {

   
    
    public DisciplinaController(){        
    }
    
    public void adicionar(String nomeDisciplina, String cargaHorariaDisciplina, String codigoDisciplina){
        
        //Instanciando e setando o modelo
        Disciplina disciplina = new Disciplina();
        disciplina.setNomeDisciplina(nomeDisciplina);
        disciplina.setCargaHorariaDisciplina(cargaHorariaDisciplina);
        disciplina.setCodigoDisciplina(codigoDisciplina);
        
        //Instanciando e setando o DAO
        DisciplinaDao disciplinaDao = new DisciplinaDao();
        disciplinaDao.adicionar(disciplina);
    }
    
}
