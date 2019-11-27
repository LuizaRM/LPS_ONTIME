/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Endereco;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author luikt
 */
public class EnderecoControllerTest {
    
    public EnderecoControllerTest() {
    }

    /**
     * Test of adicionar method, of class EnderecoController.
     */
    @org.junit.jupiter.api.Test
    public void testAdicionar() {
        System.out.println("adicionar");
        String ruaEndereco = "Unica";
        String numeroEndereco = "10";
        String complementoEndereco = "fim da rua";
        String bairroEndereco = "centro";
        String cidadeEndereco = "arantina";
        String estadoEndereco = "MG";
        EnderecoController instance = new EnderecoController();
        instance.adicionar(ruaEndereco, numeroEndereco, complementoEndereco, bairroEndereco, cidadeEndereco, estadoEndereco);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of consultar method, of class EnderecoController.
     */
    @org.junit.jupiter.api.Test
    public void testConsultar() {
        System.out.println("consultar");
        EnderecoController instance = new EnderecoController();
        instance.consultar();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLista method, of class EnderecoController.
     */
    @org.junit.jupiter.api.Test
    public void testGetLista() {
        System.out.println("getLista");
        EnderecoController instance = new EnderecoController();
        ArrayList<Endereco> expResult = null;
        ArrayList<Endereco> result = instance.getLista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
