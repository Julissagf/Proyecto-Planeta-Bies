package com.bies.planeta.entes;

import java.util.Random;

import com.bies.planeta.alimentacion.Alimentarse;

/**
 * Decorador que permite a un ente vivo adquirir la habilidad de volar.
 *
 * <p>Propósito: Implementar la habilidad de volar para un ente vivo y gestionar
 * la degradación motora cuando pierde sus patas.
 *
 * <p>Autores:
 * - Fernando Acuña Zeledón (1-1890-0988)
 * - Julissa Gómez Fuentes (1-1890-0658)
 * - Julián David Ramírez Salas (1-1874-0667)
 * - Juan Pablo Segura Astúa (1-1875-0806)
 *
 * @since 1.0
 * @version 1.0
 */

public class Volador extends EnteVivoDecorador {
    private int alas;
    private static final Random random = new Random();

    /**
     * Constructor que inicializa un ente caminante con un número específico de alas.
     *
     * @param ente El ente vivo que se decorará con la habilidad de volar.
     * @param patasIniciales El número inicial de alas del ente.
     */
    public Volador(EnteVivo ente, int alasIniciales) {
        super(ente);
        this.alas = alasIniciales;
    }

    /**
     * Método que permite al ente movilizarse volando. Si pierde todas sus alas,
     * se convierte en carroña.
     *
     * Returns Una cadena que describe el estado actual del ente al volar.
     */
    public String movilizarse() {
        if (alas > 2) {
            if (random.nextDouble() < 1.0 / alas) {
                alas--;
                return "El ser vivo ha perdido un ala. Alas restantes: " + alas;
            } else {
                return "El ser vivo vuela con " + alas + " alas.";
            }
        } else {
            degradacionMotora();
            return "El ser vivo no puede volar porque no tiene alas. Ahora es carroña.";
        }
    }

    /**
     * Establece la estrategia de alimentación para el ente volador.
     *
     * @param a Estrategia de alimentación a ser establecida.
     */
    @Override
    public void setAlimentarse(Alimentarse a) {
        getEnte().setAlimentarse(a);
    }

    /**
     * Describe cómo el ente volador se alimenta.
     *
     * Returns Una cadena que describe la acción de comer del ente.
     */
    @Override
    public String comer() {
        return getEnte().comer();
    }

    /**
     * Retorna una descripción del ente volador, incluyendo el número de alas.
     *
     * Returns Una cadena que describe al ente volador.
     */
    @Override
    public String toString() {
        return getEnte().toString() + " (Volador con " + alas + " alas)";
    }
}
