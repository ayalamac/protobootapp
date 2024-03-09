package co.edu.eafit.protobootapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//Pruebas unitarias del proyecto
public class TestCalculadora {

    //Pruebas unitarias para el cuadrado
    @Test
    public void testCuadradoPositivo() {
        Calculadora calc = new Calculadora();
        assertEquals(25.0, calc.calcularCuadrado(5.0), 0);
    }

    @Test
    public void testCuadradoCero() {
        Calculadora calc = new Calculadora();
        assertEquals(0.0, calc.calcularCuadrado(0.0), 0);
    }

    @Test
    public void testCuadradoUno() {
        Calculadora calc = new Calculadora();
        assertEquals(1.0, calc.calcularCuadrado(1.0), 0);
    }

    @Test
    public void testCuadradoNegativo() {
        Calculadora calc = new Calculadora();
        assertEquals(16.0, calc.calcularCuadrado(-4.0), 0);
    }
    
    //Pruebas unitarias para el cubo
    @Test
    public void testCuboPositivo() {
        Calculadora calc = new Calculadora();
        assertEquals(125.0, calc.calcularCubo(5.0), 0);
    }

    @Test
    public void testCuboCero() {
        Calculadora calc = new Calculadora();
        assertEquals(0.0, calc.calcularCubo(0.0), 0);
    }

    @Test
    public void testCuboUno() {
        Calculadora calc = new Calculadora();
        assertEquals(1.0, calc.calcularCubo(1.0), 0);
    }
    
    @Test
    public void testCuboMenosUno() {
        Calculadora calc = new Calculadora();
        assertEquals(-1.0, calc.calcularCubo(-1.0), 0);
    }

    @Test
    public void testCuboNegativo() {
        Calculadora calc = new Calculadora();
        assertEquals(-64.0, calc.calcularCubo(-4.0), 0);
    }
}
