import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class CalculadoraTest {

    @Mock
    ICalculadoraDao calculadoraDao;

    /**
     * Dependency injection
     */
    @InjectMocks
    Calculadora calculadora;

    /**
     * Before all test
     */
    @BeforeEach
    void setUp() {
        given(calculadoraDao.findValorConstante()).willReturn(3);
    }

    @Test
    @DisplayName("Test addition")
    void sumaTest() {
        int esperado = 8;
        assertEquals(esperado, calculadora.suma(3, 2));
    }

    @Test
    @DisplayName("Test subtract")
    void restaTest() {
        int esperado = 4;
        assertEquals(esperado, calculadora.resta(3, 2));
    }

    @Test
    @DisplayName("Test multiply")
    void multiplicaTest() {
        int esperado = 9;
        assertEquals(esperado, calculadora.multiplica(3, 2));
    }
}
