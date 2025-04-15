package modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RetanguloTest {

    @Test
    public void testGetArea() {
        Retangulo instance = new Retangulo(3.0, 2.0);
        double expResult = 6.0;
        double result = instance.getArea();
        assertEquals(expResult, result, 0);
    }

}
