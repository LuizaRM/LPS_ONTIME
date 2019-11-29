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

public class CursoDao {

    private Connection conectar;

    public CursoDao() {
        conectar = Conexao.conectar();
    }

    public void adicionar(String nome) {
        String sql;
        PreparedStatement ps;
        Curso curso = new Curso();
        //primeiro insere em turma, depois o horário da turma
        try {
            //evitar verificação de chave estrangeira
            PreparedStatement teste = conectar.prepareStatement("SET FOREIGN_KEY_CHECKS=0");
            teste.execute();
            sql = "INSERT INTO Curso(nomeCurso) VALUES(?)";

            ps = conectar.prepareStatement(sql);
            ps.setString(1, nome);
            int rs = ps.executeUpdate();

            if (rs >= 1) {
                JOptionPane.showMessageDialog(null, "Curso cadastrado com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar curso");

            }
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!\n" + se);
        }
    }

    //excluir Turma
    public void excluir(int id) {
        String sql;
        PreparedStatement ps;

        try {
            PreparedStatement teste = conectar.prepareStatement("SET FOREIGN_KEY_CHECKS=0");
            teste.execute();
            sql = "DELETE FROM Curso WHERE idCurso = ?";

            ps = conectar.prepareStatement(sql);
            ps.setInt(1, id);
            int rs = ps.executeUpdate();
            if (rs >= 1) {
                JOptionPane.showMessageDialog(null, "Curso deletado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao deletar curso!");

            }
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!\n" + se);
        }
    } // fim do excluir

    public void alterar(Object obj) {
        String sql;
        PreparedStatement ps;
        Curso curso = (Curso) obj;

        try {
            PreparedStatement teste = conectar.prepareStatement("SET FOREIGN_KEY_CHECKS=0");
            teste.execute();
            sql = "UPDATE Curso SET nomeCurso = ? WHERE idCurso = ?";

            ps = conectar.prepareStatement(sql);
            ps.setString(1, curso.getNome());
            ps.setInt(2, curso.getId());

            int rs = ps.executeUpdate();

            if (rs >= 1) {
                JOptionPane.showMessageDialog(null, "Curso alterado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao alterar Curso!");

            }
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!\n" + se);
        }
    }//FIM DO ALTERAR

    public ArrayList<Curso> consultar() {
       
        String sql;
        PreparedStatement ps;
        ArrayList<Curso> objCurso = new ArrayList<>();

        try {
            sql = "SELECT * FROM Curso";

            ps = conectar.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Curso curso = new Curso();

                curso.setId(rs.getInt("idCurso"));
                curso.setNome(rs.getString("nomeCurso"));

                objCurso.add(curso);
            }

        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erroXAXA!\n" + se);
        }
        return objCurso;
    }

}
