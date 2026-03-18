package edu.casadoGarciaAlba.endes;

/**
 * Calculadora básica con operaciones aritméticas.
 */
public class Calculadora {

    /**
     * Suma dos enteros.
     *
     * @param a primer sumando
     * @param b segundo sumando
     * @return suma de a y b
     */
    public int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Resta dos enteros.
     *
     * @param a minuendo
     * @param b sustraendo
     * @return resta de a menos b
     */
    public int restar(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dos enteros.
     *
     * @param a primer factor
     * @param b segundo factor
     * @return producto de a y b
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide dos enteros.
     *
     * @param a dividendo
     * @param b divisor
     * @return cociente entero de a entre b
     * @throws IllegalArgumentException si b es 0
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("División por cero");
        }
        return a / b;
    }
}
