package Dao;

import Model.Endereco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Model.Endereco;
import static Dao.Conexao.conectar;
import Model.Usuario;

public class EnderecoDao {

    private Connection conectar;

    public EnderecoDao() {
        conectar = Conexao.conectar();
    }

    public void adicionar(Object obj) {
        String sql;
        PreparedStatement ps;
        Endereco endereco = (Endereco) obj;

        try {
            sql = "INSERT INTO Endereco(idEndereco, ruaEndereco, numeroEndereco, complementoEndereco"
                    + ",bairroEndereco, cidadeEndereco, estadoEndereco) VALUES(?,?,?,?,?,?,?)";
            ps = conectar.prepareStatement(sql);
            ps.setInt(1, endereco.getIdEndereco());
            ps.setString(2, endereco.getRuaEndereco());
            ps.setString(3, endereco.getNumeroEndereco());
            ps.setString(4, endereco.getComplementoEndereco());
            ps.setString(5, endereco.getBairroEndereco());
            ps.setString(6, endereco.getCidadeEndereco());
            ps.setString(7, endereco.getEstadoEndereco());
            int rs = ps.executeUpdate();
//Use o executeQuery para seus Selects… Use o executeUpdate para Inserts e Updates.
            if (rs == 1) {
                JOptionPane.showMessageDialog(null, "Endereco cadastrado com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "O endereco não pode ser cadastrado");

            }
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro2!\n" + se);
        }
    }
    
    public ArrayList<Endereco> consultar() {
        String sql;
        PreparedStatement ps;
        ArrayList<Endereco> objEndereco = new ArrayList<Endereco>();

        try {
            sql = "SELECT * FROM Endereco WHERE idEndereco = 3";
            ps = conectar.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("começou");
                Endereco endereco = new Endereco();
                endereco.setIdEndereco(rs.getInt("idEndereco"));
                endereco.setRuaEndereco(rs.getString("ruaEndereco"));
                endereco.setNumeroEndereco(rs.getString("numeroEndereco"));
                endereco.setComplementoEndereco(rs.getString("complementoEndereco"));
                endereco.setBairroEndereco(rs.getString("bairroEndereco"));
                endereco.setCidadeEndereco(rs.getString("cidadeEndereco"));
                endereco.setEstadoEndereco(rs.getString("estadoEndereco"));
                //Recupera valor referente ao nome da coluna
                objEndereco.add(endereco);
            }
          
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!\n" + se);
        }
        return objEndereco;
    }

    public int getId() {
        String sql;
        PreparedStatement ps;
        ResultSet rs;
        int id = 0;

        try {
            sql = "Select max(idEndereco) as id from endereco";
            ps = conectar().prepareStatement(sql);
            rs = ps.executeQuery();
            rs.next();
            id = rs.getInt(1);
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Erro na consulta do id da tabela endereço!\n" + se);
        }
        return id;
    }

    public void excluir(Object obj) {
        String sql;
        PreparedStatement ps;
        Endereco endereco = (Endereco) obj;

        try {

            sql = "DELETE FROM Endereco WHERE idEndereco = ?";

            ps = conectar.prepareStatement(sql);
            ps.setInt(1, endereco.getIdEndereco());
            ResultSet rs = ps.executeQuery();

            if (rs.first()) {
                JOptionPane.showMessageDialog(null, "Endereco deletado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao deletar o endereco!");

            }
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!\n" + se);
        }
    }//fim excluir

    public void alterar(Object obj) {
        String sql;
        PreparedStatement ps;
        Endereco endereco = (Endereco) obj;

        try {

            sql = "UPDATE Endereco SET  ruaEndereco = ?, numeroEndereco = ?, complementoEndereco = ?"
                    + " bairroEndereco = ?, cidadeEndereco = ?, estadoEndereco = ? WHERE idEndereco = ?";

            ps = conectar.prepareStatement(sql);

            ps.setString(1, endereco.getRuaEndereco());
            ps.setString(2, endereco.getRuaEndereco());
            ps.setString(3, endereco.getNumeroEndereco());
            ps.setString(4, endereco.getComplementoEndereco());
            ps.setString(5, endereco.getBairroEndereco());
            ps.setString(6, endereco.getCidadeEndereco());
            ps.setString(7, endereco.getEstadoEndereco());
            ps.setInt(8, endereco.getIdEndereco());

            ResultSet rs = ps.executeQuery();

            if (rs.first()) {
                JOptionPane.showMessageDialog(null, "Endereco alterado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao alterar Endereço!");

            }
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!\n" + se);
        }
    }//FIM DO ALTERAR

}
