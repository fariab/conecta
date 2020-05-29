/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.connect.contrato;

import java.util.Calendar;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gustavo
 */
public class ContratoTest {
    
    public ContratoTest() {
    }

    /**
     * Test of Contrato method, of class Contrato.
     */
    @Test
    public void testContrato() {
        System.out.println("Contrato");
        Integer idContrato = null;
        Calendar CompetenciaContratoInicial = null;
        Calendar CompetenciaContratoFinal = null;
        Calendar DataVencimento = null;
        Float ValorBrutoContrato = null;
        String DescricaoServicos = "";
        Contrato instance = null;
        Contrato expResult = null;
        Contrato result = null;
        assertEquals(expResult, result);
        instance.Contrato(idContrato, CompetenciaContratoInicial, CompetenciaContratoFinal, DataVencimento, ValorBrutoContrato, DescricaoServicos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdContrato method, of class Contrato.
     */
    @Test
    public void testGetIdContrato() {
        System.out.println("getIdContrato");
        Contrato instance = null;
        Integer expResult = null;
        Integer result = instance.getIdContrato();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdContrato method, of class Contrato.
     */
    @Test
    public void testSetIdContrato() {
        System.out.println("setIdContrato");
        Integer idContrato = null;
        Contrato instance = null;
        instance.setIdContrato(idContrato);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompetenciaContratoInicio method, of class Contrato.
     */
    @Test
    public void testGetCompetenciaContratoInicio() {
        System.out.println("getCompetenciaContratoInicio");
        Contrato instance = null;
        Calendar expResult = null;
        Calendar result = instance.getCompetenciaContratoInicio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCompetenciaContratoInicio method, of class Contrato.
     */
    @Test
    public void testSetCompetenciaContratoInicio() {
        System.out.println("setCompetenciaContratoInicio");
        Calendar CompetenciaContratoInicio = null;
        Contrato instance = null;
        instance.setCompetenciaContratoInicio(CompetenciaContratoInicio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompetenciaContratoFinal method, of class Contrato.
     */
    @Test
    public void testGetCompetenciaContratoFinal() {
        System.out.println("getCompetenciaContratoFinal");
        Contrato instance = null;
        Calendar expResult = null;
        Calendar result = instance.getCompetenciaContratoFinal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCompetenciaContratoFinal method, of class Contrato.
     */
    @Test
    public void testSetCompetenciaContratoFinal() {
        System.out.println("setCompetenciaContratoFinal");
        Calendar CompetenciaContratoFinal = null;
        Contrato instance = null;
        instance.setCompetenciaContratoFinal(CompetenciaContratoFinal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataVencimento method, of class Contrato.
     */
    @Test
    public void testGetDataVencimento() {
        System.out.println("getDataVencimento");
        Contrato instance = null;
        Calendar expResult = null;
        Calendar result = instance.getDataVencimento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataVencimento method, of class Contrato.
     */
    @Test
    public void testSetDataVencimento() {
        System.out.println("setDataVencimento");
        Calendar DataVencimento = null;
        Contrato instance = null;
        instance.setDataVencimento(DataVencimento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValorBrutoContrato method, of class Contrato.
     */
    @Test
    public void testGetValorBrutoContrato() {
        System.out.println("getValorBrutoContrato");
        Contrato instance = null;
        Float expResult = null;
        Float result = instance.getValorBrutoContrato();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValorBrutoContrato method, of class Contrato.
     */
    @Test
    public void testSetValorBrutoContrato() {
        System.out.println("setValorBrutoContrato");
        Float ValorBrutoContrato = null;
        Contrato instance = null;
        instance.setValorBrutoContrato(ValorBrutoContrato);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescricaoServicos method, of class Contrato.
     */
    @Test
    public void testGetDescricaoServicos() {
        System.out.println("getDescricaoServicos");
        Contrato instance = null;
        String expResult = "";
        String result = instance.getDescricaoServicos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescricaoServicos method, of class Contrato.
     */
    @Test
    public void testSetDescricaoServicos() {
        System.out.println("setDescricaoServicos");
        String DescricaoServicos = "";
        Contrato instance = null;
        instance.setDescricaoServicos(DescricaoServicos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Contrato.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Contrato instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Contrato.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Contrato instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Contrato.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Contrato instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
