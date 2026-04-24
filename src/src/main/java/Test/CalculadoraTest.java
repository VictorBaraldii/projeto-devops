package main.java.Test;

import main.java.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    Calculadora calc = new Calculadora();

    @Test
    void deveSomarCorretamente() {
        assertEquals(5, calc.somar(2, 3));
    }

    @Test
    void deveSubtrairCorretamente() {
        assertEquals(3, calc.subtrair(5, 2));
    }

    @Test
    void deveMultiplicarCorretamente() {
        assertEquals(12, calc.multiplicar(3, 4));
    }

    @Test
    void deveDividirCorretamente() {
        assertEquals(5, calc.dividir(10, 2));
    }

    @Test
    void naoDevePermitirDivisaoPorZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.dividir(10, 0);
        });

        assertEquals("Não pode dividir por zero", exception.getMessage());
    }
}