package com.bies.planeta.entes;

import com.bies.planeta.alimentacion.Alimentarse;

/**
 * Representa un ente vivo que es innombrable.
 *
 * <p>Propósito: Modelar un ente con características específicas y sin nombre definido.
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

public class Innombrable extends EnteVivo{
    
    /**
     * Establece la estrategia de alimentación para el innombrable.
     *
     * @param a Estrategia de alimentación a ser establecida.
     */
    @Override
    public void setAlimentarse(Alimentarse a){
        alimentarse = a;
    }

    /**
     * Describe cómo el innombrable se alimenta.
     *
     * Returns Una cadena que describe la acción de comer del innombrable.
     */
    @Override
    public String comer(){
        return alimentarse.alimentarse();
    }

    /**
     * Retorna una descripción del innombrable.
     *
     * Returns Una cadena que describe al innombrable.
     */
    @Override
    public String toString(){
        return "Soy un innombrable.";
    }

}
