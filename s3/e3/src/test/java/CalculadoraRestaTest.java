import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraRestaTest {

    static MathApplication calculadora;

    @BeforeAll
    static void setup() {
        calculadora = new MathApplication();

    }

    @Test
    @DisplayName("Prueba resta")
    void restaTest() {
        int esperado = 1;
        assertEquals(esperado, calculadora.subtract(3, 2));
    }
}
