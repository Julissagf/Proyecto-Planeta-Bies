package com.bies.planeta;

/**
 * Interfaz que define el comportamiento de alimentación para los entes.
 *
 * <p>Propósito: Proveer una interfaz común para diferentes estrategias de alimentación
 * que pueden ser implementadas por diversos tipos de entes.
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

public interface Alimentarse {

    /**
     * Método que define cómo un ente se alimenta.
     *
     * @return Una cadena que describe la acción de alimentarse.
     */
    String alimentarse();
    
}
