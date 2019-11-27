/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Curso;
import Model.Disciplina;
import Model.Professor;
import Model.Turma;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author luikt
 */
public class TurmaControllerTest {
    
    public TurmaControllerTest() {
    }

    /**
     * Test of getLista method, of class TurmaController.
     */
    @org.junit.jupiter.api.Test
    public void testGetLista() {
        System.out.println("getLista");
        TurmaController instance = new TurmaController();
        ArrayList<Turma> expResult = null;
        ArrayList<Turma> result = instance.getLista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDadosCurso method, of class TurmaController.
     */
    @org.junit.jupiter.api.Test
    public void testGetDadosCurso() {
        System.out.println("getDadosCurso");
        TurmaController instance = new TurmaController();
        instance.getDadosCurso();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDadosDisciplina method, of class TurmaController.
     */
    @org.junit.jupiter.api.Test
    public void testGetDadosDisciplina() {
        System.out.println("getDadosDisciplina");
        TurmaController instance = new TurmaController();
        instance.getDadosDisciplina();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getListaDisciplina method, of class TurmaController.
     */
    @org.junit.jupiter.api.Test
    public void testGetListaDisciplina() {
        System.out.println("getListaDisciplina");
        TurmaController instance = new TurmaController();
        ArrayList<Disciplina> expResult = null;
        ArrayList<Disciplina> result = instance.getListaDisciplina();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setListaDisciplina method, of class TurmaController.
     */
    @org.junit.jupiter.api.Test
    public void testSetListaDisciplina() {
        System.out.println("setListaDisciplina");
        ArrayList<Disciplina> listaDisciplina = null;
        TurmaController instance = new TurmaController();
        instance.setListaDisciplina(listaDisciplina);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getListaProfessor method, of class TurmaController.
     */
    @org.junit.jupiter.api.Test
    public void testGetListaProfessor() {
        System.out.println("getListaProfessor");
        TurmaController instance = new TurmaController();
        ArrayList<Professor> expResult = null;
        ArrayList<Professor> result = instance.getListaProfessor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDadosProfessor method, of class TurmaController.
     */
    @org.junit.jupiter.api.Test
    public void testGetDadosProfessor() {
        System.out.println("getDadosProfessor");
        TurmaController instance = new TurmaController();
        instance.getDadosProfessor();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setListaProfessor method, of class TurmaController.
     */
    @org.junit.jupiter.api.Test
    public void testSetListaProfessor() {
        System.out.println("setListaProfessor");
        ArrayList<Professor> listaProfessor = null;
        TurmaController instance = new TurmaController();
        instance.setListaProfessor(listaProfessor);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of consultar method, of class TurmaController.
     */
    @org.junit.jupiter.api.Test
    public void testConsultar() {
        System.out.println("consultar");
        TurmaController instance = new TurmaController();
        instance.consultar();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getListaCurso method, of class TurmaController.
     */
    @org.junit.jupiter.api.Test
    public void testGetListaCurso() {
        System.out.println("getListaCurso");
        TurmaController instance = new TurmaController();
        ArrayList<Curso> expResult = null;
        ArrayList<Curso> result = instance.getListaCurso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setListaCurso method, of class TurmaController.
     */
    @org.junit.jupiter.api.Test
    public void testSetListaCurso() {
        System.out.println("setListaCurso");
        ArrayList<Curso> listaCurso = null;
        TurmaController instance = new TurmaController();
        instance.setListaCurso(listaCurso);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of adicionar method, of class TurmaController.
     */
    @org.junit.jupiter.api.Test
    public void testAdicionar() {
        System.out.println("adicionar");
        String disciplina = "";
        String curso = "";
        String professor = "";
        String ano = "";
        String semestre = "";
        String periodo = "";
        List<String> segunda = null;
        List<String> terca = null;
        List<String> quarta = null;
        List<String> quinta = null;
        List<String> sexta = null;
        String sala = "";
        TurmaController instance = new TurmaController();
        instance.adicionar(disciplina, curso, professor, ano, semestre, periodo, segunda, terca, quarta, quinta, sexta, sala);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
