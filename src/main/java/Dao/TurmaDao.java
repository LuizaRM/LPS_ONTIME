package Dao;

import Model.Turma;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TurmaDao {

    private Connection conectar;

    public TurmaDao() {
        conectar = Conexao.conectar();
    }

    public void adicionar(Object obj) {
        String sql;
        PreparedStatement ps;
        Turma turma = (Turma) obj;

        try {
            sql = "INSERT INTO Turma( idTurma, idDisciplina, idProfessor, idCurso, anoTurma;\n"
                    + " semestreTurma, salaTurma, periodoTurmao) VALUES(?,?,?,?,?,?,?,?)";

            ps = conectar.prepareStatement(sql);
            ps.setInt(1, turma.getIdTurma());
            ps.setInt(2, turma.getIdDisciplina());
            ps.setInt(3, turma.getIdProfessor());
            ps.setInt(4, turma.getIdCurso());
            ps.setInt(5, turma.getAnoTurma());
            ps.setInt(6, turma.getSemestreTurma());
            ps.setString(7, turma.getSalaTurma());
            ps.setInt(8, turma.getPeriodoTurma());
            ResultSet rs = ps.executeQuery();

            if (rs.first()) {
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
  

}
