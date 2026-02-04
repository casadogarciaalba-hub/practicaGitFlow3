package edu.casadoGarciaAlba.endes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias de {@link Calculadora}.
 */
public class CalculadoraTest {

    private final Calculadora calculadora = new Calculadora();

    @Test
    void sumar_devuelveResultadoCorrecto() {
        assertEquals(5, calculadora.sumar(2, 3));
        assertEquals(-1, calculadora.sumar(2, -3));
    }

    @Test
    void restar_devuelveResultadoCorrecto() {
        assertEquals(-1, calculadora.restar(2, 3));
        assertEquals(5, calculadora.restar(2, -3));
    }

    @Test
    void multiplicar_devuelveResultadoCorrecto() {
        assertEquals(6, calculadora.multiplicar(2, 3));
        assertEquals(0, calculadora.multiplicar(2, 0));
    }

    @Test
    void dividir_devuelveResultadoCorrecto() {
        assertEquals(2, calculadora.dividir(6, 3));
        assertEquals(-2, calculadora.dividir(6, -3));
    }

    @Test
    void dividir_entreCero_lanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.dividir(10, 0));
    }
}
