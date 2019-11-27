/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author luikt
 */
public class DisciplinaControllerTest {
    
    public DisciplinaControllerTest() {
    }

    /**
     * Test of adicionar method, of class DisciplinaController.
     */
    @org.junit.jupiter.api.Test
    public void testAdicionar() {
        System.out.println("adicionar");
        int idDisciplina = 0;
        String nomeDisciplina = "";
        String cargaHorariaDisciplina = "";
        String codigoDisciplina = "";
        DisciplinaController instance = new DisciplinaController();
        instance.adicionar(idDisciplina, nomeDisciplina, cargaHorariaDisciplina, codigoDisciplina);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
