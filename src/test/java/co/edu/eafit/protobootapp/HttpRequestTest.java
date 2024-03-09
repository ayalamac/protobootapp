package co.edu.eafit.protobootapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SuppressWarnings("deprecation")
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class HttpRequestTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void GetHolaEndpoint_WhenIsCalledWithoutParamNombre_ShouldReturnHolaMundo() {
        String response = restTemplate.getForObject("http://localhost:" + port + "/hola", String.class);
        assertThat(response).isEqualTo("Mundo!");
    }

    @Test
    void GetCuadradoEndpoint_WhenIsCalledWithoutNumber_ShouldReturnDefaultSquare() {
        String response = restTemplate.getForObject("http://localhost:" + port + "/cuadrado", String.class);
        assertThat(response).matches("El cuadrado de 0[,.]0 es 0[,.]0");
    }

    @Test
    void GetCuadradoEndpoint_WhenIsCalledWithNumber_ShouldReturnSquareOfNumber() {
        String response = restTemplate.getForObject("http://localhost:" + port + "/cuadrado?numero=3", String.class);
        assertThat(response).matches("El cuadrado de 3[,.]0 es 9[,.]0");
    }

    @Test
    void GetCuboEndpoint_WhenIsCalledWithoutNumber_ShouldReturnDefaultCube() {
        String response = restTemplate.getForObject("http://localhost:" + port + "/cubo", String.class);
        assertThat(response).matches("0[,.]0 es 0[,.]0");
    }

    @Test
    void GetCuboEndpoint_WhenIsCalledWithNumber_ShouldReturnCubeOfNumber() {
        String response = restTemplate.getForObject("http://localhost:" + port + "/cubo?numero=3", String.class);
        assertThat(response).matches("3[,.]0 es 27[,.]0");
    }
}
