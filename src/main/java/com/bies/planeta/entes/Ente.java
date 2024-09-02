package com.bies.planeta.entes;

import com.bies.planeta.alimentacion.Alimentarse;

/**
 * Clase abstracta que representa un ente, el cual puede ser vivo o no vivo.
 *
 * <p>Propósito: Establecer una base común para todos los entes, con métodos que deben
 * ser implementados por las subclases específicas.
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

public abstract class Ente {

    /**
     * Método abstracto que retorna una descripción del ente.
     *
     * Returns Una cadena que describe el ente.
     */
    public abstract String toString();

    /**
     * Método abstracto que define cómo el ente se alimenta.
     *
     * Returns Una cadena que describe la acción de comer.
     */
    public abstract String comer();

    /**
     * Método abstracto para establecer la estrategia de alimentación del ente.
     *
     * @param s Estrategia de alimentación a establecer.
     */
    public abstract void setAlimentarse(Alimentarse s);

}
