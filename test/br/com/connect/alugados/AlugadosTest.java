/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.connect.alugados;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gustavo
 */
public class AlugadosTest {
    
    public AlugadosTest() {
    }

    /**
     * Test of Alugados method, of class Alugados.
     */
    @Test
    public void testAlugados() {
        System.out.println("Alugados");
        int idAlugados = 0;
        String NomeEquipamentos = "";
        String DescricaoContrato = "";
        Alugados instance = null;
        Alugados expResult = null;
        Alugados result = null;
        assertEquals(expResult, result);
        instance.Alugados(idAlugados, NomeEquipamentos, DescricaoContrato);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdAlugados method, of class Alugados.
     */
    @Test
    public void testGetIdAlugados() {
        System.out.println("getIdAlugados");
        Alugados instance = null;
        Integer expResult = null;
        Integer result = instance.getIdAlugados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdAlugados method, of class Alugados.
     */
    @Test
    public void testSetIdAlugados() {
        System.out.println("setIdAlugados");
        Integer idAlugados = null;
        Alugados instance = null;
        instance.setIdAlugados(idAlugados);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNomeEquipamentos method, of class Alugados.
     */
    @Test
    public void testGetNomeEquipamentos() {
        System.out.println("getNomeEquipamentos");
        Alugados instance = null;
        String expResult = "";
        String result = instance.getNomeEquipamentos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNomeEquipamentos method, of class Alugados.
     */
    @Test
    public void testSetNomeEquipamentos() {
        System.out.println("setNomeEquipamentos");
        String NomeEquipamentos = "";
        Alugados instance = null;
        instance.setNomeEquipamentos(NomeEquipamentos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescricaoContrato method, of class Alugados.
     */
    @Test
    public void testGetDescricaoContrato() {
        System.out.println("getDescricaoContrato");
        Alugados instance = null;
        String expResult = "";
        String result = instance.getDescricaoContrato();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescricaoContrato method, of class Alugados.
     */
    @Test
    public void testSetDescricaoContrato() {
        System.out.println("setDescricaoContrato");
        String DescricaoContrato = "";
        Alugados instance = null;
        instance.setDescricaoContrato(DescricaoContrato);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Alugados.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Alugados instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Alugados.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Alugados instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Alugados.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Alugados instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
