package com.bies.planeta;

/**
 * Esta clase define la estrategia de alimentación de Hongos.
 *
 * <p>Propósito: Implementar la estrategia específica de alimentación basada en Hongos.
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

public class AlimentarseDeHongo implements Alimentarse {

    /**
     * Método que define cómo se alimenta un ente de hongos.
     *
     * @return Una cadena que describe la acción de alimentarse de hongos.
     */
    public String alimentarse(){
        return "Me alimento de hongos";
    }
}
