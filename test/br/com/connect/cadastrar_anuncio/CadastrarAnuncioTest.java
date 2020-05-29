/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.connect.cadastrar_anuncio;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gustavo
 */
public class CadastrarAnuncioTest {
    
    public CadastrarAnuncioTest() {
    }

    /**
     * Test of CadastrarAnuncio method, of class CadastrarAnuncio.
     */
    @Test
    public void testCadastrarAnuncio() {
        System.out.println("CadastrarAnuncio");
        Integer idCadastro = null;
        String NomeCadastro = "";
        Float ValorItemCadastrado = null;
        CadastrarAnuncio instance = null;
        CadastrarAnuncio expResult = null;
        CadastrarAnuncio result = null;
        assertEquals(expResult, result);
        instance.CadastrarAnuncio(idCadastro, NomeCadastro, ValorItemCadastrado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdCadastro method, of class CadastrarAnuncio.
     */
    @Test
    public void testGetIdCadastro() {
        System.out.println("getIdCadastro");
        CadastrarAnuncio instance = null;
        Integer expResult = null;
        Integer result = instance.getIdCadastro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdCadastro method, of class CadastrarAnuncio.
     */
    @Test
    public void testSetIdCadastro() {
        System.out.println("setIdCadastro");
        Integer idCadastro = null;
        CadastrarAnuncio instance = null;
        instance.setIdCadastro(idCadastro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNomeCadastro method, of class CadastrarAnuncio.
     */
    @Test
    public void testGetNomeCadastro() {
        System.out.println("getNomeCadastro");
        CadastrarAnuncio instance = null;
        String expResult = "";
        String result = instance.getNomeCadastro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNomeCadastro method, of class CadastrarAnuncio.
     */
    @Test
    public void testSetNomeCadastro() {
        System.out.println("setNomeCadastro");
        String NomeCadastro = "";
        CadastrarAnuncio instance = null;
        instance.setNomeCadastro(NomeCadastro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValorItemCadastrado method, of class CadastrarAnuncio.
     */
    @Test
    public void testGetValorItemCadastrado() {
        System.out.println("getValorItemCadastrado");
        CadastrarAnuncio instance = null;
        Float expResult = null;
        Float result = instance.getValorItemCadastrado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValorItemCadastrado method, of class CadastrarAnuncio.
     */
    @Test
    public void testSetValorItemCadastrado() {
        System.out.println("setValorItemCadastrado");
        Float ValorItemCadastrado = null;
        CadastrarAnuncio instance = null;
        instance.setValorItemCadastrado(ValorItemCadastrado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class CadastrarAnuncio.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        CadastrarAnuncio instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class CadastrarAnuncio.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        CadastrarAnuncio instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class CadastrarAnuncio.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        CadastrarAnuncio instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
