package edu.casadoGarciaAlba.endes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias de {@link ValidadorPassword}.
 */
public class ValidadorPasswordTest {

    private final ValidadorPassword validador = new ValidadorPassword();

    @Test
    void passwordNull_esInvalida() {
        assertFalse(validador.esValida(null));
    }

    @Test
    void passwordCorta_esInvalida() {
        assertFalse(validador.esValida("Abc123"));
    }

    @Test
    void sinMayuscula_esInvalida() {
        assertFalse(validador.esValida("abc12345"));
    }

    @Test
    void sinNumero_esInvalida() {
        assertFalse(validador.esValida("Abcdefgh"));
    }

    @Test
    void passwordValida_devuelveTrue() {
        assertTrue(validador.esValida("Abc12345"));
        assertTrue(validador.esValida("Z9xxxxxx"));
    }
}








