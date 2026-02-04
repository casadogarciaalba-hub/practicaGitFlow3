package edu.casadoGarciaAlba.endes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias de {@link ConversorTemperatura}.
 */
public class ConversorTemperaturaTest {

    private final ConversorTemperatura conversor = new ConversorTemperatura();

    @Test
    void celsiusAFahrenheit_convierteBien() {
        assertEquals(32.0, conversor.celsiusAFahrenheit(0.0), 0.0001);
        assertEquals(212.0, conversor.celsiusAFahrenheit(100.0), 0.0001);
    }

    @Test
    void fahrenheitACelsius_convierteBien() {
        assertEquals(0.0, conversor.fahrenheitACelsius(32.0), 0.0001);
        assertEquals(100.0, conversor.fahrenheitACelsius(212.0), 0.0001);
    }
}


