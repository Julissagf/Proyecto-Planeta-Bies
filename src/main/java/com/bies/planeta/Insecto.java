package com.bies.planeta;

/**
 * Representa un insecto dentro del ecosistema de un planeta.
 * Es una clase abstracta que extiende de EnteVivo.
 * 
 * Autores:
 * - Fernando Acuña Zeledón (1-1890-0988)
 * - Julissa Gómez Fuentes (1-1890-0658)
 * - Julián David Ramírez Salas (1-1874-0667)
 * - Juan Pablo Segura Astúa (1-1875-0806)
 * 
 * @version 1.0
 * @since 2024-09-02
 */

public abstract class Insecto extends EnteVivo{

    /**
     * Devuelve una representación en cadena de un insecto.
     * 
     * @return una cadena que describe al insecto.
     */
    public String toString(){
        return "Soy un insecto, ";
    }
}
