/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Servicios;

import Entidades.Calculadora;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jpc
 */
public class OperacionesTest {
    
    public OperacionesTest() {
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
     * Test of cargarNumeros method, of class Operaciones.
     */
    @Test
    public void testCargarNumeros() {
        System.out.println("cargarNumeros");
        Operaciones instance = new Operaciones();
        Calculadora expResult = null;
        Calculadora result = instance.cargarNumeros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Sumar method, of class Operaciones.
     */
    @Test
    public void testSumar() {
        System.out.println("Sumar");
        Calculadora op = null;
        Operaciones instance = new Operaciones();
        instance.Sumar(op);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Restar method, of class Operaciones.
     */
    @Test
    public void testRestar() {
        System.out.println("Restar");
        Calculadora op = null;
        Operaciones instance = new Operaciones();
        instance.Restar(op);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Multiplicar method, of class Operaciones.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("Multiplicar");
        Calculadora op = null;
        Operaciones instance = new Operaciones();
        instance.Multiplicar(op);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Dividir method, of class Operaciones.
     */
    @Test
    public void testDividir() {
        System.out.println("Dividir");
        Calculadora op = null;
        Operaciones instance = new Operaciones();
        instance.Dividir(op);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
