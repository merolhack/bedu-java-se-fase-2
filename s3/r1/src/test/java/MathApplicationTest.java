import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * 
 */
@ExtendWith(MockitoExtension.class)
public class MathApplicationTest {

    @Mock
    CalcServiceImpl calcService;

    /**
     * Dependency injection
     */
    @InjectMocks
    MathApplication mathApplication;

    /**
     * Before all test
     */
    @BeforeEach
    void setUp() {
        given(calcService.add(10.0, 20.0)).willReturn(30.00);
    }

    @Test
    public void testAdd() {
        when(calcService.add(10.0, 20.0)).thenReturn(30.00);
        assertEquals(mathApplication.add(10.0, 20.0), 30.0, 0);
        verify(calcService).add(10.0, 20.0);
    }
}