package com.bies.planeta.entes;

import com.bies.planeta.alimentacion.Alimentarse;

/**
 * Representa un ente no vivo en el sistema.
 *
 * <p>Propósito: Modelar entidades que han perdido su vitalidad y ya no pueden
 * realizar funciones básicas como alimentarse o movilizarse.
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

public abstract class EnteNoVivo extends Ente {

   /**
     * Retorna una descripción del ente no vivo.
     *
     * Returns Una cadena que describe al ente no vivo.
     */
    @Override
    public abstract String toString();

   /**
     * Describe que el ente no vivo no puede comer.
     *
     * Returns Una cadena que indica que el ente no puede comer.
     */
    @Override
    public String comer(){ return "No puedo comer, porque soy un ente no vivo"; }

   /**
     * Método que no tiene implementación en entes no vivos.
     *
     * @param s No tiene efecto en un ente no vivo.
     */
    @Override
    public void setAlimentarse(Alimentarse s){ }
}
