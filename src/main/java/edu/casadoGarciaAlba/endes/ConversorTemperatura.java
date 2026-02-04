package edu.casadoGarciaAlba.endes;

/**
 * Conversor de temperaturas entre Celsius y Fahrenheit.
 */
public class ConversorTemperatura {

    /**
     * Convierte grados Celsius a Fahrenheit.
     *
     * @param celsius temperatura en Celsius
     * @return temperatura equivalente en Fahrenheit
     */
    public double celsiusAFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }

    /**
     * Convierte grados Fahrenheit a Celsius.
     *
     * @param fahrenheit temperatura en Fahrenheit
     * @return temperatura equivalente en Celsius
     */
    public double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }
}

