/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import Entidades.Rectangulo;
import Servicios.RectanguloService;
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
public class RectanguloTest {
    
    public RectanguloTest() {
    }
    
    //
    RectanguloService rs;
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        //Antes de ejecutar cada test, inicializa esto
        //para no tener un objeto global siempre presente
        rs = new RectanguloService();
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void deberiaInicializarColor(){
        assertNotNull(new Rectangulo(10,10).getColor());
    }
    
    @Test
    //Se prueba que devuelva valores coherentes
    public void CalcularArea(){
        assertEquals(100, rs.calcularArea(new Rectangulo(10,10)), 0);
        assertEquals(20, rs.calcularArea(new Rectangulo(4,5)), 0);
        assertEquals(1, rs.calcularArea(new Rectangulo(1,1)), 0);
    }
    
    @Test
    public void deberiaCalcularPerimetro(){
        assertEquals(100, rs.calcularPerimetro(new Rectangulo(20,30)), 0);
        assertEquals(40, rs.calcularPerimetro(new Rectangulo(10,10)), 0);
        assertEquals(30, rs.calcularPerimetro(new Rectangulo(5,7)), 0);
    }
    
    @Test
    public void deberiaActivarDesactivar(){
        //Cada test debe crear el objeto sobre
        //el que se probara algo
        Rectangulo r = new Rectangulo(5, 5);
        //Para valores booleanos sera objeto.isAtributo()
        assertTrue(r.isActive());
        r.setActive(false);
        assertFalse(r.isActive());
    }
    
}
