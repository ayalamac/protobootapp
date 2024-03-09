package co.edu.eafit.protobootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//App para hallar el cuadrado y el cubo de un número
//Se lanza y se ejecuta con http://localhost:8080 o la URL específica al proveedor cloud
@SpringBootApplication
@RestController
public class ProtobootappApplication {

    Calculadora calculadora;
    
    public static void main(String[] args) {
        SpringApplication.run(ProtobootappApplication.class, args);
    }

    /**
     * This method returns a welcome message for the application.
     * It is executed with the URL http://localhost:8080/
     *
     * @return The welcome message.
     */
    @GetMapping("/")
    public String index() {
        return String.format("Bienvenido! Esta aplicación ayuda a elevar números a sus potencias.");
    }    

    /**
     * This method returns a greeting message with the given name.
     * It is executed with the URL http://localhost:8080/hola or http://localhost:8080/hola?nombre=John
     *
     * @param nombre The name to include in the greeting message.
     * @return The greeting message.
     */
    @GetMapping("/hola")
    public String hola(@RequestParam(value = "nombre", defaultValue = "Mundo") String nombre) {
        return String.format("Hola %s!", nombre);
    }
    
    /**
     * This method calculates and returns the square of the given number.
     * It is executed with the URL http://localhost:8080/cuadrado or http://localhost:8080/cuadrado?numero=5
     *
     * @param numero The number to calculate the square of.
     * @return The square of the given number.
     */
    @GetMapping("/cuadrado")
    public String cuadrado(@RequestParam(value = "numero", defaultValue = "0") Double numero) {
        this.calculadora = new Calculadora();
        return String.format("El cuadrado de %f es %f", numero, this.calculadora.calcularCuadrado(numero));
    }
    
    /**
     * This method calculates and returns the cube of the given number.
     * It is executed with the URL http://localhost:8080/cubo or http://localhost:8080/cubo?numero=5
     *
     * @param numero The number to calculate the cube of.
     * @return The cube of the given number.
     */
    @GetMapping("/cubo")
    public String cubo(@RequestParam(value = "numero", defaultValue = "0") Double numero) {
        this.calculadora = new Calculadora();
        return String.format("El cubo de %f es %f", numero, this.calculadora.calcularCubo(numero));
    }
}
