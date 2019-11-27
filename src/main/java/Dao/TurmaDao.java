package Dao;

import Model.Disciplina;
import Model.Endereco;
import Model.Professor;
import Model.Turma;
import Model.Curso;
import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class TurmaDao {

    private Connection conectar;

    public TurmaDao() {
        conectar = Conexao.conectar();
    }

    public void adicionar(String disciplina, String curso, String professor, String ano, String semestre, String periodo, List<String> segunda, List<String> terca, List<String> quarta, List<String> quinta, List<String> sexta, String sala) {
        String sql;
        PreparedStatement ps;
        Turma turma = new Turma();
        //primeiro insere em turma, depois o horário da turma
        try {
            //evitar verificação de chave estrangeira
            PreparedStatement teste = conectar.prepareStatement("SET FOREIGN_KEY_CHECKS=0");
            teste.execute();
            sql = "INSERT INTO Turma(idDisciplina, idProfessor, idCurso, anoTurma,"
                    + " semestreTurma, salaTurma, periodoTurma) VALUES(?,?,?,?,?,?,?)";
//String disciplina, String curso, String professor, String ano, String semestre, String periodo,
//List<String> segunda, List<String> terca, List<String> quarta, List<String> quinta, List<String> sexta

            ps = conectar.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(disciplina));
            ps.setInt(2, Integer.parseInt(professor));
            ps.setInt(3, Integer.parseInt(curso));
            ps.setInt(4, Integer.parseInt(ano));
            ps.setInt(5, Integer.parseInt(semestre));
            ps.setInt(6, Integer.parseInt(sala));
            ps.setString(7, periodo);
            int rs = ps.executeUpdate();

            if (rs >= 1) {
                JOptionPane.showMessageDialog(null, "Turma cadastrada com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar Turma");

            }
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!\n" + se);
        }
    }

    public void excluir(Object obj) {
        String sql;
        PreparedStatement ps;
        Turma turma = (Turma) obj;

        try {

            sql = "DELETE FROM Turma WHERE idTurma = ?";

            ps = conectar.prepareStatement(sql);
            ps.setInt(1, turma.getIdTurma());
            ResultSet rs = ps.executeQuery();

            if (rs.first()) {
                JOptionPane.showMessageDialog(null, "Turma deletada com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao deletar Turma!");

            }
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!\n" + se);
        }
    }//fim do excluir

    //excluir Turma
        public void excluir(int id) {
        String sql;
        PreparedStatement ps;

        try {

            sql = "DELETE FROM Turma WHERE idTurma = ?";
            //sql = "DELETE T1,T2 FROM Usuario AS T1 INNER JOIN Endereco AS T2 ON T1.idEndereco = T2.idEndereco WHERE T1.idUsuario = ?";

            ps = conectar.prepareStatement(sql);
            ps.setInt(1, id);
            int rs = ps.executeUpdate();
            if (rs >= 1) {
                JOptionPane.showMessageDialog(null, "Turma deletada com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao deletar Turma!");

            }
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!\n" + se);
        }
    } // fim do excluir
    public void alterar(Object obj) {
        String sql;
        PreparedStatement ps;
        Turma turma = (Turma) obj;

        try {

            sql = "UPDATE Turma SET idDisciplina = ?, idProfessor = ?, idCurso = ?, anoTurma = ?, semestreTurma = ?, salaTurma = ?, periodoTurmao = ? "
                    + "WHERE idTurma = ?";

            ps = conectar.prepareStatement(sql);
            ps.setInt(1, turma.getIdDisciplina());
            ps.setInt(2, turma.getIdProfessor());
            ps.setInt(3, turma.getIdCurso());
            ps.setInt(4, turma.getAnoTurma());
            ps.setInt(5, turma.getSemestreTurma());
            ps.setString(6, turma.getSalaTurma());
            ps.setInt(7, turma.getPeriodoTurma());
            ps.setInt(8, turma.getIdTurma());

            ResultSet rs = ps.executeQuery();

            if (rs.first()) {
                JOptionPane.showMessageDialog(null, "Turma alterada com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao alterar Turma!");

            }
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!\n" + se);
        }
    }//FIM DO ALTERAR

    public ArrayList<Curso> getDadosCurso() {
        String sql;
        PreparedStatement ps;
        ArrayList<Curso> objCurso = new ArrayList<>();

        try {
            sql = "SELECT * FROM Curso";
            //"idTurma", "anoTurma", "semestreTurma", "salaTurma", "periodoTurma", "nomeDisciplina", "nomeCurso"};

            ps = conectar.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Curso curso = new Curso();
                curso.setId(rs.getInt("idCurso"));
                objCurso.add(curso);
            }

        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erroXAXA!\n" + se);
        }
        return objCurso;
    }

    public ArrayList<Professor> getDadosProfessor() {
        String sql;
        PreparedStatement ps;
        ArrayList<Professor> objProfessor = new ArrayList<>();

        try {
            sql = "SELECT * FROM Professor p, Usuario u WHERE p.idUsuario = u.idUsuario";
            //"idTurma", "anoTurma", "semestreTurma", "salaTurma", "periodoTurma", "nomeDisciplina", "nomeCurso"};

            ps = conectar.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Professor p = new Professor();
                p.setId(rs.getInt("p.idProfessor"));
                System.out.println("idkdokdkodadok aquii ale " + p.getId());
                objProfessor.add(p);
            }

        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erroXAXA!\n" + se);
        }
        return objProfessor;
    }

    public ArrayList<Disciplina> getDadosDisciplina() {
        String sql;
        PreparedStatement ps;
        ArrayList<Disciplina> objDisciplina = new ArrayList<>();

        try {
            sql = "SELECT * FROM Disciplina";
            //"idTurma", "anoTurma", "semestreTurma", "salaTurma", "periodoTurma", "nomeDisciplina", "nomeCurso"};

            ps = conectar.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Disciplina disciplina = new Disciplina();
                disciplina.setIdDisciplina(rs.getInt("idDisciplina"));
                objDisciplina.add(disciplina);
            }

        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erroXAXA!\n" + se);
        }
        return objDisciplina;
    }

    public ArrayList<Turma> consultar() {
        String sql;
        PreparedStatement ps;
        ArrayList<Turma> objTurma = new ArrayList<>();

        try {
            sql = "SELECT * FROM Turma t, Disciplina d, Professor p, Curso c, Usuario u"
                    + " WHERE t.idDisciplina = d.idDisciplina"
                    + " AND t.idProfessor = p.idProfessor"
                    + " AND t.idCurso = c.idCurso"
                    + " AND p.idUsuario = u.idUsuario";
            //"idTurma", "anoTurma", "semestreTurma", "salaTurma", "periodoTurma", "nomeDisciplina", "nomeCurso"};

            ps = conectar.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("começou");
                Turma turma = new Turma();
                turma.setIdTurma(rs.getInt("t.idTurma"));
                turma.setAnoTurma(rs.getInt("t.anoTurma"));
                turma.setSemestreTurma(rs.getInt("t.semestreTurma"));
                turma.setSalaTurma(rs.getString("t.salaTurma"));
                turma.setPeriodoTurma(rs.getInt("t.periodoTurma"));

                Disciplina disciplina = new Disciplina();
                disciplina.setIdDisciplina(rs.getInt("d.idDisciplina"));
                disciplina.setNomeDisciplina(rs.getString("d.nomeDisciplina"));
                disciplina.setCargaHorariaDisciplina(rs.getString("d.cargaHorariaDisciplina"));
                disciplina.setCodigoDisciplina(rs.getString("d.codigoDisciplina"));
                turma.setDisciplina(disciplina);

                Professor p = new Professor();
                Usuario u = new Usuario();
                u.setNome(rs.getString("u.nomeUsuario"));
                p.setId(rs.getInt("p.idProfessor"));
                p.setUsuario(u);
                turma.setProfessor(p);
                System.out.println("o id daquiiiiiiiii" + p.getId());

                Curso c = new Curso();
                c.setId(rs.getInt("c.idCurso"));
                c.setNome(rs.getString("c.nomeCurso"));
                turma.setCurso(c);

                objTurma.add(turma);
            }

        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erroXAXA!\n" + se);
        }
        return objTurma;
    }

    public ArrayList<Turma> consultarPorAno(int ano) {
        ArrayList<Turma> lista = new ArrayList();
        String sql = "SELECT * FROM Turma WHERE Turma.anoTurma = ?";
        try {

            conectar = Conexao.conectar();
            PreparedStatement stmt = conectar.prepareStatement(sql);
            stmt.setInt(1, ano);
            stmt.executeQuery();
            ResultSet rs = stmt.getResultSet();

            while (rs.next()) {
                Turma turma = new Turma();
                turma.setAnoTurma(rs.getInt("anoTurma"));
                turma.setSemestreTurma(rs.getInt("semestreTurma"));
                turma.setPeriodoTurma(rs.getInt("periodoTurma"));
                turma.setIdDisciplina(rs.getInt("idDisciplina"));
                turma.setIdProfessor(rs.getInt("idProfessor"));

                lista.add(turma);
            }
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return lista;
    }

}
