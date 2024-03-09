package co.edu.eafit.protobootapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestCalculadora {

    @Test
    void calculateCuadrado_WhenInputIs5_ShouldReturn25() {
        Calculadora calc = new Calculadora();
        assertEquals(25.0, calc.calcularCuadrado(5.0), 0);
    }

    @Test
    void calculateCuadrado_WhenInputIsZero_ShouldReturnZero() {
        Calculadora calc = new Calculadora();
        assertEquals(0.0, calc.calcularCuadrado(0.0), 0);
    }

    @Test
    void calculateCuadrado_WhenInputIsOne_ShouldReturnOne() {
        Calculadora calc = new Calculadora();
        assertEquals(1.0, calc.calcularCuadrado(1.0), 0);
    }

    @Test
    void calculateCuadrado_WhenInputIsNegative_ShouldReturnPositiveValue() {
        Calculadora calc = new Calculadora();
        assertEquals(16.0, calc.calcularCuadrado(-4.0), 0);
    }

    @Test
    void calculateCubo_WhenInputIs5_ShouldReturn125() {
        Calculadora calc = new Calculadora();
        assertEquals(125.0, calc.calcularCubo(5.0), 0);
    }

    @Test
    void calculateCubo_WhenInputIsZero_ShouldReturnZero() {
        Calculadora calc = new Calculadora();
        assertEquals(0.0, calc.calcularCubo(0.0), 0);
    }

    @Test
    void calculateCubo_WhenInputIsOne_ShouldReturnOne() {
        Calculadora calc = new Calculadora();
        assertEquals(1.0, calc.calcularCubo(1.0), 0);
    }

    @Test
    void calculateCubo_WhenInputIsNegativeOne_ShouldReturnNegativeOne() {
        Calculadora calc = new Calculadora();
        assertEquals(-1.0, calc.calcularCubo(-1.0), 0);
    }

    @Test
    void calculateCubo_WhenInputIsNegative_ShouldReturnNegativeValue() {
        Calculadora calc = new Calculadora();
        assertEquals(-64.0, calc.calcularCubo(-4.0), 0);
    }
}
