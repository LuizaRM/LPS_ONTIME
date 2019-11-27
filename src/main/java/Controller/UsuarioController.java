package Controller;

import Dao.UsuarioDao;
import Model.Endereco;
import Model.Usuario;
import View.FrCadastrarUsuarioOuProfessor;
import View.FrEditarUsuarioOuProfessor;
import View.FrFichaUsuario;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class UsuarioController {

    int id;
    EnderecoController enderecoController;
    ArrayList<Usuario> lista = new ArrayList<Usuario>();
    private Usuario objEditar;

    public UsuarioController(int operacao, EnderecoController enderecoController) {
        this.enderecoController = enderecoController;

        switch (operacao) {
            case 1:
                //incluir
                FrCadastrarUsuarioOuProfessor jfrCadUsuario = new FrCadastrarUsuarioOuProfessor(this, enderecoController);
                jfrCadUsuario.setVisible(true);
                break;
            case 2:
                //alterar
                //FrEditarUsuarioOuProfessor jfrEditUsuario = new FrEditarUsuarioOuProfessor(this, enderecoController);
                //jfrEditUsuario.setVisible(true);
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

    public UsuarioController(int operacao, Usuario user) {

        switch (operacao) {
            case 1:
                //incluir
                FrCadastrarUsuarioOuProfessor jfrCadUsuario = new FrCadastrarUsuarioOuProfessor(this, enderecoController);
                jfrCadUsuario.setVisible(true);
                break;
            case 2:
                //alterar
                FrEditarUsuarioOuProfessor jfrEditUsuario = new FrEditarUsuarioOuProfessor(user);
                jfrEditUsuario.setVisible(true);
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

    public UsuarioController() {
    }

    public UsuarioController(Usuario user) {
        FrFichaUsuario telaFichaUsuario = new FrFichaUsuario(user);
        telaFichaUsuario.setVisible(true);
    }

    public void adicionar(String nome, String cpf, String email, String senha, String telefone,
            String departamento, int nivelDeAcesso) {

        //Instanciando e setando o modelo
        Usuario usuario = new Usuario();
        usuario.setEmail(email);
        usuario.setSenha(senha);
        usuario.setCpf(cpf);
        usuario.setDepartamento(departamento);
        usuario.setTelefone(telefone);
        usuario.setNome(nome);
        usuario.setNivelDeAcesso(nivelDeAcesso);
        System.out.println("ta aq");

        usuario.setEndereco(enderecoController.getEndereco());

        //Instanciando e setando o DAO
        UsuarioDao usuarioDao = new UsuarioDao();
        usuarioDao.adicionar(usuario);
    }

    public void editar(Usuario usuario) {
        //ele abre a tela e seta os dados
        //Instanciando e setando o DAO

        UsuarioDao usuarioDao = new UsuarioDao();
        usuarioDao.editar(usuario);
    }

    public void excluir(int id) {
        UsuarioDao usuarioDao = new UsuarioDao();
        usuarioDao.excluir(id);
    }

    public void consultar() {
        //Instanciando e setando o DAO
        UsuarioDao usuarioDao = new UsuarioDao();
        this.lista = usuarioDao.consultar();

    }

    public void setObjEditar(Usuario objEditar) {
        this.objEditar = objEditar;
    }

    public Usuario getObjEditar() {
        return objEditar;
    }

    public ArrayList<Usuario> getLista() {
        return this.lista;
    }

    public DefaultTableModel carregarUsuarioPorTipo(int tipodeusuario) {
        System.out.println("Controler");
        ArrayList<Usuario> lista = new ArrayList<Usuario>();
        UsuarioDao usuarioDao = new UsuarioDao();
        lista = usuarioDao.consultarPorNivelDeUsuario(tipodeusuario);
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"Tipo de Usuario", "Nome", "Departamento"}, 0);
        for (int i = 0; i < lista.size(); i++) {
            Object dados[] = {
                lista.get(i).getNivelDeAcesso(),
                lista.get(i).getNome(),
                lista.get(i).getDepartamento()};

            modelo.addRow(dados);

        }
        return modelo;
    }
}
