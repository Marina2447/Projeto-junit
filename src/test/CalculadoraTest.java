package projetojunit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class CalculadoraTest {
    @Test
    void testSomar() {
        Calculadora calc = new Calculadora();
        int resultado = calc.somar(2, 3);
        assertEquals(5, resultado, "A soma de 2 + 3 deve ser 5");
    }
}