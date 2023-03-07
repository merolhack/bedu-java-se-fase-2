import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    private Calculadora calculadora = new Calculadora();

    @Test
    @DisplayName("Test Addition")
    void suma() {
        int esperado = 5;
        assertEquals(esperado, calculadora.sumar(3, 2));
    }

    @Test
    @DisplayName("Test Subtraction")
    void resta() {
        int esperado = 1;
        assertEquals(esperado, calculadora.restar(3, 2));
    }

    @Test
    @DisplayName("Test Multiplication")
    void multiplicar() {
        int esperado = 6;
        assertEquals(esperado, calculadora.multiplicar(3, 2));
    }

    @Test
    @DisplayName("Test Division OK")
    void divide() {
        int esperado = 6;
        assertEquals(esperado, calculadora.dividir(12, 2));
    }

    @Test
    @DisplayName("Test Division KO")
    void divideExcepcion() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> calculadora.dividir(68, 0));
        assertEquals("No es posible dividir un valor entre 0", exception.getMessage());
    }
}