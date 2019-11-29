package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.io.FileInputStream;
import java.io.IOException;

public class Conexao {

    private static Connection conn;

    private Conexao() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

           
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ontime","root",""); 
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Erro de Conexão!\n" + se);
        } catch (ClassNotFoundException cnf) {
            JOptionPane.showMessageDialog(null, "Driver não encontrado!\n" + cnf);
        }
    }

    public static Connection conectar() {
        if (conn == null) {
            new Conexao();
        }
        return conn;
    }
}
