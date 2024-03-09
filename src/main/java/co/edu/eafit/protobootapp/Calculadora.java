package co.edu.eafit.protobootapp;

//Esta es una clase de calculadora simple.
/**
 * La clase Calculadora representa una calculadora simple que puede realizar operaciones matemáticas.
 */
public class Calculadora {

    /**
     * Calcula el cuadrado de un número dado.
     *
     * @param numero El número para calcular el cuadrado.
     * @return El cuadrado del número dado.
     */
    public Double calcularCuadrado(Double numero) {
        return numero + numero;
    }
    
    /**
     * Calcula el cubo de un número dado.
     *
     * @param numero El número para calcular el cubo.
     * @return El cubo del número dado.
     */
    public Double calcularCubo(Double numero) {
        return numero + numero + numero;
    }
}
