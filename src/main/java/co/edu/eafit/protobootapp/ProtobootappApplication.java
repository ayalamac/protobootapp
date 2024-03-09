package co.edu.eafit.protobootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//Aplicación para hallar el cuadrado y el cubo de un número
//Se lanza y se ejecuta con http://localhost:8080 o la URL específica al proveedor cloud
@SpringBootApplication
@RestController
public class ProtobootappApplication {

    Calculadora calculadora;
    
    public static void main(String[] args) {
        SpringApplication.run(ProtobootappApplication.class, args);
    }

    /**
     * Este método devuelve un mensaje de bienvenida para la aplicación.
     * Se ejecuta con la URL http://localhost:8080/
     *
     * @return El mensaje de bienvenida.
     */
    @GetMapping("/")
    public String index() {
        return "Bienvenido! Esta aplicación ayuda a elevar números a sus potencias.";
    }    

    /**
     * Este método devuelve un mensaje de saludo con el nombre dado.
     * Se ejecuta con la URL http://localhost:8080/hola o http://localhost:8080/hola?nombre=John
     *
     * @param nombre El nombre a incluir en el mensaje de saludo.
     * @return El mensaje de saludo.
     */
    @GetMapping("/hola")
    public String hola(@RequestParam(value = "nombre", defaultValue = "Mundo") String nombre) {
        return String.format("Hola %s!", nombre);
    }
    
    /**
     * Este método calcula y devuelve el cuadrado del número dado.
     * Se ejecuta con la URL http://localhost:8080/cuadrado o http://localhost:8080/cuadrado?numero=5
     *
     * @param numero El número para calcular su cuadrado.
     * @return El cuadrado del número dado.
     */
    @GetMapping("/cuadrado")
    public String cuadrado(@RequestParam(value = "numero", defaultValue = "0") Double numero) {
        this.calculadora = new Calculadora();
        double resultado = this.calculadora.calcularCuadrado(numero);
        return String.format("El cuadrado de %.1f es %.1f", numero, resultado);
    }
    
    /**
     * Este método calcula y devuelve el cubo del número dado.
     * Se ejecuta con la URL http://localhost:8080/cubo o http://localhost:8080/cubo?numero=5
     *
     * @param numero El número para calcular su cubo.
     * @return El cubo del número dado.
     */
    @GetMapping("/cubo")
    public String cubo(@RequestParam(value = "numero", defaultValue = "0") Double numero) {
        this.calculadora = new Calculadora();
        double resultado = this.calculadora.calcularCubo(numero);
        return String.format("El cubo de %.1f es %.1f", numero, resultado);
    }
}
