/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Usuario;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author luikt
 */
public class UsuarioControllerTest {
    
    public UsuarioControllerTest() {
    }

    /**
     * Test of adicionar method, of class UsuarioController.
     */
    @org.junit.jupiter.api.Test
    public void testAdicionar() {
        System.out.println("adicionar");
        String nome = "";
        String cpf = "";
        String email = "";
        String senha = "";
        String telefone = "";
        String departamento = "";
        int nivelDeAcesso = 0;
        UsuarioController instance = new UsuarioController();
        instance.adicionar(nome, cpf, email, senha, telefone, departamento, nivelDeAcesso);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of editar method, of class UsuarioController.
     */
    @org.junit.jupiter.api.Test
    public void testEditar() {
        System.out.println("editar");
        Usuario usuario = null;
        UsuarioController instance = new UsuarioController();
        instance.editar(usuario);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of excluir method, of class UsuarioController.
     */
    @org.junit.jupiter.api.Test
    public void testExcluir() {
        System.out.println("excluir");
        int id = 0;
        UsuarioController instance = new UsuarioController();
        instance.excluir(id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of consultar method, of class UsuarioController.
     */
    @org.junit.jupiter.api.Test
    public void testConsultar() {
        System.out.println("consultar");
        UsuarioController instance = new UsuarioController();
        instance.consultar();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setObjEditar method, of class UsuarioController.
     */
    @org.junit.jupiter.api.Test
    public void testSetObjEditar() {
        System.out.println("setObjEditar");
        Usuario objEditar = null;
        UsuarioController instance = new UsuarioController();
        instance.setObjEditar(objEditar);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getObjEditar method, of class UsuarioController.
     */
    @org.junit.jupiter.api.Test
    public void testGetObjEditar() {
        System.out.println("getObjEditar");
        UsuarioController instance = new UsuarioController();
        Usuario expResult = null;
        Usuario result = instance.getObjEditar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getLista method, of class UsuarioController.
     */
    @org.junit.jupiter.api.Test
    public void testGetLista() {
        System.out.println("getLista");
        UsuarioController instance = new UsuarioController();
        ArrayList<Usuario> expResult = null;
        ArrayList<Usuario> result = instance.getLista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of carregarUsuarioPorTipo method, of class UsuarioController.
     */
    @org.junit.jupiter.api.Test
    public void testCarregarUsuarioPorTipo() {
        System.out.println("carregarUsuarioPorTipo");
        int tipodeusuario = 0;
        UsuarioController instance = new UsuarioController();
        DefaultTableModel expResult = null;
        DefaultTableModel result = instance.carregarUsuarioPorTipo(tipodeusuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
