package Dao;

import View.FrInicioAdm;
import View.FrInicioProfessor;
import View.FrLogin;
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
                int nivel = rs.getInt("nivelUsuario");

                JOptionPane.showMessageDialog(null, "Login feito com sucesso");
                if (nivel == 0) {
                    //abre tela professor
                    FrInicioProfessor frp = new FrInicioProfessor();
                    frp.setVisible(true);
                } else {
                    //abre tela administrador
                    FrInicioAdm fra = new FrInicioAdm();
                    fra.setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Login ou senha inválidos");
                FrLogin frlogin = new FrLogin();
                frlogin.setVisible(true);

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
