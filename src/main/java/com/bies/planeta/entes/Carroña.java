package com.bies.planeta.entes;

/**
 * Representa un ente que ha perdido su vitalidad y se ha convertido en carroña.
 *
 * <p>Propósito: Modelar el estado final de un ente vivo que ha perdido sus capacidades
 * motoras o vitales, convirtiéndose en un ente no vivo.
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
public class Carroña extends EnteNoVivo {

  /**
   * Constructor por defecto para crear una instancia de Carroña.
   */
  public Carroña () {
    super();
  }

  /**
     * Método que describe el hecho de que el ente ya no puede movilizarse.
     *
     * Returns Una cadena que indica que el ente no puede movilizarse porque es carroña.
     */
  public String movilizarse() {
      return "Ya no puede movilizarse porque es carroña";
   }

  /**
     * Retorna una descripción del ente, indicando que es carroña.
     *
     * Returns Una cadena que describe al ente como carroña.
     */
  @Override
  public String toString() {
    return "El ente es carroña";
  }
}
