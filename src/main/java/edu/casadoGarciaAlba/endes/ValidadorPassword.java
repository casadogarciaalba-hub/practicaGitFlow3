package edu.casadoGarciaAlba.endes;

import java.util.regex.Pattern;

/**
 * Validador de contraseñas con reglas básicas.
 */
public class ValidadorPassword {

    private static final int LONGITUD_MINIMA = 8;
    private static final Pattern PATRON = Pattern.compile("^(?=.*[A-Z])(?=.*\\d).+$");

    /**
     * Valida una contraseña.
     * Reglas:
     * - No puede ser null.
     * - Debe tener longitud mínima.
     * - Debe contener al menos una mayúscula.
     * - Debe contener al menos un número.
     *
     * @param password contraseña a validar
     * @return true si cumple las reglas; false en caso contrario
     */
    public boolean esValida(String password) {
        if (password == null) {
            return false;
        }
        if (password.length() < LONGITUD_MINIMA) {
            return false;
        }
        return PATRON.matcher(password).matches();
    }
}

