/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.projetoarvorehierarquica;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Luis
 */
public class BolsistaTest {
    
    public BolsistaTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of renovarBolsa method, of class Bolsista.
     */
    @org.junit.jupiter.api.Test
    public void testRenovarBolsa() {
        System.out.println("renovarBolsa");
        Bolsista instance = new Bolsista();
        instance.renovarBolsa();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pagarMensalidade method, of class Bolsista.
     */
    @org.junit.jupiter.api.Test
    public void testPagarMensalidade() {
        System.out.println("pagarMensalidade");
        Bolsista instance = new Bolsista();
        instance.pagarMensalidade();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBolsa method, of class Bolsista.
     */
    @org.junit.jupiter.api.Test
    public void testGetBolsa() {
        System.out.println("getBolsa");
        Bolsista instance = new Bolsista();
        float expResult = 0.0F;
        float result = instance.getBolsa();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBolsa method, of class Bolsista.
     */
    @org.junit.jupiter.api.Test
    public void testSetBolsa() {
        System.out.println("setBolsa");
        float bolsa = 0.0F;
        Bolsista instance = new Bolsista();
        instance.setBolsa(bolsa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Bolsista.
     */
    @org.junit.jupiter.api.Test
    public void testGetNome() {
        System.out.println("getNome");
        Bolsista instance = new Bolsista();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Bolsista.
     */
    @org.junit.jupiter.api.Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Bolsista instance = new Bolsista();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
