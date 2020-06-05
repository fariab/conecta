/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.connect.equipamento;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gabriel.faria
 */
public class EquipamentoTest {
    
    public EquipamentoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getIdCadastroEquipamento method, of class Equipamento.
     */
    @Test
    public void testGetIdCadastroEquipamento() {
        System.out.println("getIdCadastroEquipamento");
        Equipamento instance = new Equipamento();
        Integer expResult = null;
        Integer result = instance.getIdCadastroEquipamento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdCadastroEquipamento method, of class Equipamento.
     */
    @Test
    public void testSetIdCadastroEquipamento() {
        System.out.println("setIdCadastroEquipamento");
        Integer idCadastroEquipamento = null;
        Equipamento instance = new Equipamento();
        instance.setIdCadastroEquipamento(idCadastroEquipamento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNomeEquipamento method, of class Equipamento.
     */
    @Test
    public void testGetNomeEquipamento() {
        System.out.println("getNomeEquipamento");
        Equipamento instance = new Equipamento();
        String expResult = "";
        String result = instance.getNomeEquipamento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNomeEquipamento method, of class Equipamento.
     */
    @Test
    public void testSetNomeEquipamento() {
        System.out.println("setNomeEquipamento");
        String nomeEquipamento = "";
        Equipamento instance = new Equipamento();
        instance.setNomeEquipamento(nomeEquipamento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumeroDeSerie method, of class Equipamento.
     */
    @Test
    public void testGetNumeroDeSerie() {
        System.out.println("getNumeroDeSerie");
        Equipamento instance = new Equipamento();
        Integer expResult = null;
        Integer result = instance.getNumeroDeSerie();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumeroDeSerie method, of class Equipamento.
     */
    @Test
    public void testSetNumeroDeSerie() {
        System.out.println("setNumeroDeSerie");
        Integer numeroDeSerie = null;
        Equipamento instance = new Equipamento();
        instance.setNumeroDeSerie(numeroDeSerie);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFabricanteEquipamento method, of class Equipamento.
     */
    @Test
    public void testGetFabricanteEquipamento() {
        System.out.println("getFabricanteEquipamento");
        Equipamento instance = new Equipamento();
        String expResult = "";
        String result = instance.getFabricanteEquipamento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFabricanteEquipamento method, of class Equipamento.
     */
    @Test
    public void testSetFabricanteEquipamento() {
        System.out.println("setFabricanteEquipamento");
        String fabricanteEquipamento = "";
        Equipamento instance = new Equipamento();
        instance.setFabricanteEquipamento(fabricanteEquipamento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValorBaseHora method, of class Equipamento.
     */
    @Test
    public void testGetValorBaseHora() {
        System.out.println("getValorBaseHora");
        Equipamento instance = new Equipamento();
        Float expResult = null;
        Float result = instance.getValorBaseHora();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValorBaseHora method, of class Equipamento.
     */
    @Test
    public void testSetValorBaseHora() {
        System.out.println("setValorBaseHora");
        Float valorBaseHora = null;
        Equipamento instance = new Equipamento();
        instance.setValorBaseHora(valorBaseHora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cadastroEquipamento method, of class Equipamento.
     */
    @Test
    public void testCadastroEquipamento() {
        System.out.println("cadastroEquipamento");
        Equipamento instance = new Equipamento();
        instance.cadastroEquipamento();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarEquipamentos method, of class Equipamento.
     */
    @Test
    public void testBuscarEquipamentos() {
        System.out.println("buscarEquipamentos");
        Equipamento instance = new Equipamento();
        List<Equipamento> expResult = null;
        List<Equipamento> result = instance.buscarEquipamentos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletaEquipamento method, of class Equipamento.
     */
    @Test
    public void testDeletaEquipamento() {
        System.out.println("deletaEquipamento");
        Equipamento instance = new Equipamento();
        Equipamento expResult = null;
        Equipamento result = instance.deletaEquipamento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alteraEquipamento method, of class Equipamento.
     */
    @Test
    public void testAlteraEquipamento() {
        System.out.println("alteraEquipamento");
        Equipamento instance = new Equipamento();
        instance.alteraEquipamento();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Equipamento.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Equipamento instance = new Equipamento();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
