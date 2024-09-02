package com.bies.planeta;
import java.util.ArrayList;

/**
 * Representa un ente vivo en el sistema.
 *
 * <p>Propósito: Modelar entidades que están vivas y pueden realizar funciones
 * básicas como alimentarse y movilizarse.
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

public abstract class EnteVivo extends Ente{
    Alimentarse alimentarse;
    ArrayList<EnteVivoDecorador> decorators = new ArrayList<>();

    /**
     * Establece la estrategia de alimentación para el ente vivo.
     *
     * @param a Estrategia de alimentación a ser establecida.
     */
    @Override
    public abstract void setAlimentarse(Alimentarse a);

    /**
     * Describe cómo el ente vivo se alimenta.
     *
     * Returns Una cadena que describe la acción de comer del ente.
     */
    @Override
    public abstract String comer();

    /**
     * Retorna una descripción del ente vivo.
     *
     * Returns Una cadena que describe al ente vivo.
     */
    @Override
    public abstract String toString();

    /**
     * Añade un decorador al ente vivo, permitiendo que adquiera nuevas capacidades.
     *
     * @param e Decorador que se añadirá al ente vivo.
     */
    public void addDecorator(EnteVivoDecorador e) { decorators.add(e); }

    /**
     * Permite que el ente vivo se movilice según sus decoradores.
     *
     * Returns Una cadena que describe cómo el ente vivo se moviliza.
     */
    public String movilizarse() {
        String retStr = "";
        for (EnteVivoDecorador e : decorators) {
            retStr += e.movilizarse();
        }
        return retStr;
    }
}
