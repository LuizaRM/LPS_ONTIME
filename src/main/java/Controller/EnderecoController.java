package Controller;

import Dao.EnderecoDao;
import Model.Endereco;
import java.util.ArrayList;

public class EnderecoController {

    Endereco endereco;
    ArrayList<Endereco> lista = new ArrayList<Endereco>();

    public EnderecoController() {
    }

    public void adicionar(String ruaEndereco, String numeroEndereco, String complementoEndereco,
            String bairroEndereco, String cidadeEndereco, String estadoEndereco) {

        //Instanciando e setando o modelo
        Endereco endereco = new Endereco();
        endereco.setRuaEndereco(ruaEndereco);
        endereco.setNumeroEndereco(numeroEndereco);
        endereco.setComplementoEndereco(complementoEndereco);
        endereco.setBairroEndereco(bairroEndereco);
        endereco.setCidadeEndereco(cidadeEndereco);
        endereco.setEstadoEndereco(estadoEndereco);

        EnderecoDao enderecoDAO = new EnderecoDao();
        enderecoDAO.adicionar(endereco);

        endereco.setIdEndereco(enderecoDAO.getId());

        this.endereco = endereco;
    }

    public void consultar() {

        //Instanciando e setando o modelo
        Endereco endereco = new Endereco();

        EnderecoDao enderecoDAO = new EnderecoDao();
        this.lista = enderecoDAO.consultar();
    }

    Endereco getEndereco() {
        return endereco;
    }
    public ArrayList<Endereco> getLista(){
        return this.lista;
    }

}
