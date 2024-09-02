package com.bies.planeta.alimentacion;

/**
 * Esta clase define la estrategia de alimentación de Carroña.
 *
 * <p>Propósito: Implementar la estrategia específica de alimentación basada en Carroña.
 *
 * <p>Autores:
 * - Fernando Acuña Zeledón (1-1890-0988)
 * - Julissa Gómez Fuentes (1-1890-0658)
 * - Julián David Ramírez Salas (1-1874-0667)
 * - Juan Pablo Segura Astúa (1-1875-0806)
 *
 * <p>Fecha: 2024-09-01
 *
 * @since 1.0
 * @version 1.0
 */

public class AlimentarseDeCarrona implements Alimentarse {

     /**
     * Método que define cómo se alimenta un ente de carroña.
     *
     * Returns Una cadena que describe la acción de alimentarse de carroña.
     */
    public String alimentarse(){
        return "Me alimento de Carroña";
    }

}
