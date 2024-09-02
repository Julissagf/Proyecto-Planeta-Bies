package com.bies.planeta;

import java.util.Random;

/**
 * Decorador que permite a un ente vivo adquirir la habilidad de caminar.
 *
 * <p>Propósito: Implementar la habilidad de caminar para un ente vivo y gestionar
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

public class Caminante extends EnteVivoDecorador {
    private int patas;
    private static final Random random = new Random();

    /**
     * Constructor que inicializa un ente caminante con un número específico de patas.
     *
     * @param ente El ente vivo que se decorará con la habilidad de caminar.
     * @param patasIniciales El número inicial de patas del ente.
     */
    public Caminante(EnteVivo ente, int patasIniciales) {
        super(ente);
        this.patas = patasIniciales;
    }


    /**
     * Método que permite al ente movilizarse caminando. Si pierde todas sus patas,
     * se convierte en carroña.
     *
     * Returns Una cadena que describe el estado actual del ente al caminar.
     */
    public String movilizarse() {
        if (patas > 2) {
            if (random.nextDouble() < 1.0 / patas) {
                patas--;
                return "El ser vivo ha perdido una pata. Patas restantes: " + patas;
            } else {
                return "El ser vivo se mueve con " + patas + " patas.";
            }
        } else {
            degradacionMotora();
            return "El ser vivo no puede caminar porque no tiene patas. Ahora es carroña.";
        }
    }

    /**
     * Establece la estrategia de alimentación para el ente caminante.
     *
     * @param a Estrategia de alimentación a ser establecida.
     */
    @Override
    public void setAlimentarse(Alimentarse a) {
        getEnte().setAlimentarse(a);
    }

    /**
     * Describe cómo el ente caminante se alimenta.
     *
     * Returns Una cadena que describe la acción de comer del ente.
     */
    @Override
    public String comer() {
        return getEnte().comer();
    }

    /**
     * Retorna una descripción del ente caminante, incluyendo el número de patas.
     *
     * Returns Una cadena que describe al ente caminante.
     */
    @Override
    public String toString() {
        return getEnte().toString() + " (Caminante con " + patas + " patas)";
    }

}
