import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class CalculadoraDivideTest {

    static MathApplication calculadora;

    @BeforeAll
    static void setup() {
        calculadora = new MathApplication();
    }

    @Test
    @DisplayName("Prueba division")
    void divideTest() {
        int esperado = 9;
        assertEquals(esperado, calculadora.split(18, 2));
    }
}