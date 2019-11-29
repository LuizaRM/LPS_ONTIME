package Dao;

import Model.Disciplina;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Login;

public class DisciplinaDao {

    private Connection conectar;

    public DisciplinaDao() {
        conectar = Conexao.conectar();
    }

    public void login(Object obj) {
        String sql;
        PreparedStatement ps;
        Login login = (Login) obj;

        try {
            sql = "SELECT * from Usuario WHERE emailUsuario = ? AND senhaUsuario = ?";
            ps = conectar.prepareStatement(sql);
            ps.setString(1, login.getEmail());
            ps.setString(2, login.getSenha());
            ResultSet rs = ps.executeQuery();

            if (rs.first()) {
                JOptionPane.showMessageDialog(null, "Login feito com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "Login ou senha inválidos");

            }
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!\n" + se);
        }
    }
    
    public void adicionar(Object obj) {
        String sql;
        PreparedStatement ps;
        Disciplina disciplina = (Disciplina) obj;

        try {

            sql = "INSERT INTO Disciplina( nomeDisciplina, cargaHorariaDisciplina, codigoDisciplina,"
                    + " VALUES(?,?,?)";

            ps = conectar.prepareStatement(sql);
            
            
           
            ps.setString(1, disciplina.getNomeDisciplina());
            ps.setString(2, disciplina.getCargaHorariaDisciplina());
            ps.setString(3, disciplina.getCodigoDisciplina());
          
            ResultSet rs = ps.executeQuery();

            if (rs.first()) {
                JOptionPane.showMessageDialog(null, "Disciplina cadastrada com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar disciplina!");

            }
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!\n" + se);
        }
    }//fim do adicionar

    public void excluir(Object obj) {
        String sql;
        PreparedStatement ps;
        Disciplina disciplina = (Disciplina) obj;

        try {

            sql = "DELETE FROM Disciplina WHERE idDisciplina = ?";

            ps = conectar.prepareStatement(sql);
            ps.setInt(1, disciplina.getIdDisciplina());
            ResultSet rs = ps.executeQuery();

            if (rs.first()) {
                JOptionPane.showMessageDialog(null, "Disciplina deletada com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao deletar Disciplina!");

            }
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!\n" + se);
        }
    }//fim do excluir

    public void alterar(Object obj) {
        String sql;
        PreparedStatement ps;
        Disciplina disciplina = (Disciplina) obj;

        try {

            sql = "UPDATE Disciplina SET nomeDisciplina = ?, cargaHorariaDisciplina = ?, codigoDisciplina = ? WHERE idDisciplina = ?";

            ps = conectar.prepareStatement(sql);
            ps.setString(1, disciplina.getNomeDisciplina());
            ps.setString(2, disciplina.getCargaHorariaDisciplina());
            ps.setString(3, disciplina.getCodigoDisciplina());
            ps.setInt(4, disciplina.getIdDisciplina());
            

            ResultSet rs = ps.executeQuery();

            if (rs.first()) {
                JOptionPane.showMessageDialog(null, "Usuario alterado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao alterar o usuário!");

            }
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!\n" + se);
        }
    }//FIM DO ALTERAR

    public ArrayList<Object> consultar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
