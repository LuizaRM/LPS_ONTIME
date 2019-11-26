
package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Login;

public class LoginDao {

    private Connection conectar;

    public LoginDao() {
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

    public void excluir(Object obj) {

    }

    public void alterar(Object obj) {

    }

  

}
