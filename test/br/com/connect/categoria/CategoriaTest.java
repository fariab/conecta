/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.connect.categoria;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lucas Miguel
 */
public class CategoriaTest {
    
    public CategoriaTest() {
    }

    /**
     * Test of getIdCategoria method, of class Categoria.
     */
    @Test
    public void testGetIdCategoria() {
        System.out.println("getIdCategoria");
        Categoria instance = null;
        Integer expResult = null;
        Integer result = instance.getIdCategoria();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdCategoria method, of class Categoria.
     */
    @Test
    public void testSetIdCategoria() {
        System.out.println("setIdCategoria");
        Integer idCategoria = null;
        Categoria instance = null;
        instance.setIdCategoria(idCategoria);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDesCategoria method, of class Categoria.
     */
    @Test
    public void testGetDesCategoria() {
        System.out.println("getDesCategoria");
        Categoria instance = null;
        String expResult = "";
        String result = instance.getDesCategoria();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDesCategoria method, of class Categoria.
     */
    @Test
    public void testSetDesCategoria() {
        System.out.println("setDesCategoria");
        String desCategoria = "";
        Categoria instance = null;
        instance.setDesCategoria(desCategoria);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Categoria.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Categoria instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Categoria.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Categoria instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Categoria.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Categoria instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
