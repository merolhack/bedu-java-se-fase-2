import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraMultiplicaTest {

    static MathApplication calculadora;

    @BeforeAll
    static void setup() {
        calculadora = new MathApplication();
    }

    @Test
    @DisplayName("Prueba multiplicación")
    void multiplicaTest() {
        int esperado = 6;
        assertEquals(esperado, calculadora.multiply(3, 2));
    }
}
