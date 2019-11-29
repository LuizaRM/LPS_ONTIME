package Controller;

import Dao.CursoDao;
import Dao.TurmaDao;
import Dao.UsuarioDao;
import Model.Curso;
import Model.Disciplina;
import Model.Professor;
import Model.Turma;
import Model.Usuario;
import View.FrAdicionarCurso;
import View.FrAdicionarTurma;
import View.FrEditarCurso;
import View.FrFichaTurma;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class CursoController {

    private ArrayList<Curso> listaCurso;


    public CursoController(int operacao) {
        switch (operacao) {
            case 1:
                //incluir
                FrAdicionarCurso telaAdicionarCurso = new FrAdicionarCurso();
                telaAdicionarCurso.setVisible(true);
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
    
     public CursoController(int operacao, Curso curso) {
        switch (operacao) {
            case 2:
                
                FrEditarCurso telaEditarCurso = new FrEditarCurso(curso);
                telaEditarCurso.setVisible(true);
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



    public CursoController() {
    }

 

    public void consultar() {
        System.out.println("chamou consultar");
        CursoDao cursoDao = new CursoDao();
        this.listaCurso = cursoDao.consultar();
    }

    public ArrayList<Curso> getListaCurso() {
        return listaCurso;
    }

    public void editar(Curso curso) {
        CursoDao cursoDao = new CursoDao();
        cursoDao.alterar(curso);
    }


    public void adicionar(String nome) {
        CursoDao cursoDao = new CursoDao();
        cursoDao.adicionar(nome);
    }


    public void excluir(int id) {
        CursoDao cursoDao = new CursoDao();
        cursoDao.excluir(id);
    }

}
