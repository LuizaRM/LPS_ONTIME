package Dao;

import Model.Endereco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import Model.Usuario;
import java.util.ArrayList;

public class UsuarioDao {

    private Connection conectar;

    public UsuarioDao() {
        conectar = Conexao.conectar();
    }

    public void adicionar(Object obj) {
        String sql;
        PreparedStatement ps;
        Usuario usuario = (Usuario) obj;

        try {

            sql = "INSERT INTO Usuario(idEndereco, nomeUsuario, cpfUsuario, emailUsuario,"
                    + " senhaUsuario, telefoneUsuario, departamentoUsuario, nivelUsuario) VALUES(?,?,?,?,?,?,?,?)";

            ps = conectar.prepareStatement(sql);

            ps.setInt(1, usuario.getEndereco().getIdEndereco());
            ps.setString(2, usuario.getNome());
            ps.setString(3, usuario.getCpf());
            ps.setString(4, usuario.getEmail());
            ps.setString(5, usuario.getSenha());
            ps.setString(6, usuario.getTelefone());
            ps.setString(7, usuario.getDepartamento());
            ps.setInt(8, usuario.getNivelDeAcesso());
            int rs = ps.executeUpdate();
            if (rs == 1) {
                JOptionPane.showMessageDialog(null, "Usuario cadastradox com sucesso!");

            } else {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar o usuário!");

            }
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro! 1\n" + se);
        }
    }//fim do adicionar

    public void excluir(int id) {
        String sql;
        PreparedStatement ps;

        try {

            //sql = "DELETE FROM Usuario, Endereco WHERE Usuario.idUsuario = ? AND Endereco.idEndereco = Usuario.idEndereco";
            sql = "DELETE T1,T2 FROM Usuario AS T1 INNER JOIN Endereco AS T2 ON T1.idEndereco = T2.idEndereco WHERE T1.idUsuario = ?";

            ps = conectar.prepareStatement(sql);
            ps.setInt(1, id);
            int rs = ps.executeUpdate();
            if (rs >= 1) {
                JOptionPane.showMessageDialog(null, "Usuario deletado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao deletar o usuário!");

            }
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!\n" + se);
        }
    } // fim do excluir

    public void editar(Usuario usuario) {
        String sql;
        String sql2;
        PreparedStatement ps, ps2;

        try {

            sql = "UPDATE Usuario SET nomeUsuario = ?,cpfUsuario = ?, emailUsuario = ?, senhaUsuario = ?, telefoneUsuario = ?, departamentoUsuario = ?, nivelUsuario = ? WHERE idUsuario = ?";
            sql2 = "UPDATE Endereco SET ruaEndereco = ?,numeroEndereco = ?, complementoEndereco = ?, bairroEndereco = ?, cidadeEndereco = ?, estadoEndereco = ? WHERE idEndereco = ?";

            ps = conectar.prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getCpf());
            ps.setString(3, usuario.getEmail());
            ps.setString(4, usuario.getSenha());
            ps.setString(5, usuario.getTelefone());
            ps.setString(6, usuario.getDepartamento());
            ps.setInt(7, usuario.getNivelDeAcesso());
            ps.setInt(8, usuario.getIdUsuario());

            ps2 = conectar.prepareStatement(sql2);
            ps2.setString(1, usuario.getEndereco().getRuaEndereco());
            System.out.println("a rua do endereco eh " + usuario.getEndereco().getRuaEndereco());
            System.out.println("d id do endereco " + usuario.getEndereco().getIdEndereco());
            System.out.println("d id do usuario " + usuario.getIdUsuario());

            ps2.setString(2, usuario.getEndereco().getNumeroEndereco());
            ps2.setString(3, usuario.getEndereco().getComplementoEndereco());
            ps2.setString(4, usuario.getEndereco().getBairroEndereco());
            ps2.setString(5, usuario.getEndereco().getCidadeEndereco());
            ps2.setString(6, usuario.getEndereco().getEstadoEndereco());
            ps2.setInt(7, usuario.getEndereco().getIdEndereco());

            //nome, cpf, email, senha, telefone, departamento, nivel , idusu
            int rs = ps.executeUpdate();
            int rs2 = ps2.executeUpdate();

            if (rs >= 1) {
                JOptionPane.showMessageDialog(null, "Usuario alterado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao alterar o usuário!");
            }

            if (rs2 >= 1) {
                JOptionPane.showMessageDialog(null, "Endereco alterado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao alterar o endereco!");

            }
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!\n" + se);
        }
    }//FIM DO ALTERAR

    public ArrayList<Usuario> consultar() {
        String sql;
        PreparedStatement ps;
        ArrayList<Usuario> objUsuario = new ArrayList<>();

        try {
            sql = "SELECT * FROM Usuario u, Endereco e WHERE u.idEndereco = e.idEndereco";
            ps = conectar.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("começou");
                Usuario usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt("u.idUsuario"));
                usuario.setNome(rs.getString("u.nomeUsuario"));
                usuario.setIdEndereco(rs.getInt("u.idEndereco"));
                System.out.println(usuario.getNome());
                usuario.setCpf(rs.getString("u.cpfUsuario"));
//                usuario.getEndereco().setIdEndereco(rs.getInt("idEndereco"));            
                usuario.setEmail(rs.getString("u.emailUsuario"));
                usuario.setSenha(rs.getString("u.senhaUsuario"));
                usuario.setTelefone(rs.getString("u.telefoneUsuario"));
                usuario.setDepartamento(rs.getString("u.departamentoUsuario"));
                usuario.setNivelDeAcesso(rs.getInt("u.nivelUsuario"));

                Endereco edx = new Endereco();
                edx.setIdEndereco(rs.getInt("e.idEndereco"));
                edx.setRuaEndereco(rs.getString("e.ruaEndereco"));
                edx.setNumeroEndereco(rs.getString("e.numeroEndereco"));
                edx.setComplementoEndereco(rs.getString("e.complementoEndereco"));
                edx.setBairroEndereco(rs.getString("e.bairroEndereco"));
                edx.setCidadeEndereco(rs.getString("e.cidadeEndereco"));
                edx.setEstadoEndereco(rs.getString("e.estadoEndereco"));

                usuario.setEndereco(edx);

                System.out.println(usuario.getEndereco().getIdEndereco() + "ID DESSA BOSTA DE ADDRESS");

//                usuario.getEndereco().setRuaEndereco(rs.getString("e.ruaEndereco"));
//                usuario.getEndereco().setNumeroEndereco(rs.getString("e.ruaEndereco"));
//                usuario.getEndereco().setComplementoEndereco(rs.getString("e.ruaEndereco"));
//                usuario.getEndereco().setBairroEndereco(rs.getString("e.bairroEndereco"));
//                usuario.getEndereco().setCidadeEndereco(rs.getString("e.cidadeEndereco"));
//                usuario.getEndereco().setEstadoEndereco(rs.getString("e.estadoEndereco"));
                //ide, rua, numero, complemento, bairro, cidade, estado
                //Recupera valor referente ao nome da coluna
                objUsuario.add(usuario);
            }

        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!\n" + se);
        }
        return objUsuario;
    }

}
