/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.connect.pagamento;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lucas Miguel
 */
public class PagamentoTest {
    
    public PagamentoTest() {
    }

    /**
     * Test of getIdPagamento method, of class Pagamento.
     */
    @Test
    public void testGetIdPagamento() {
        System.out.println("getIdPagamento");
        Pagamento instance = null;
        Integer expResult = null;
        Integer result = instance.getIdPagamento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdPagamento method, of class Pagamento.
     */
    @Test
    public void testSetIdPagamento() {
        System.out.println("setIdPagamento");
        Integer idPagamento = null;
        Pagamento instance = null;
        instance.setIdPagamento(idPagamento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoPagamento method, of class Pagamento.
     */
    @Test
    public void testGetTipoPagamento() {
        System.out.println("getTipoPagamento");
        Pagamento instance = null;
        String expResult = "";
        String result = instance.getTipoPagamento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoPagamento method, of class Pagamento.
     */
    @Test
    public void testSetTipoPagamento() {
        System.out.println("setTipoPagamento");
        String tipoPagamento = "";
        Pagamento instance = null;
        instance.setTipoPagamento(tipoPagamento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Pagamento.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Pagamento instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Pagamento.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Pagamento instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Pagamento.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Pagamento instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
