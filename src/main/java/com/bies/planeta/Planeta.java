package com.bies.planeta;

/**
 * Representa un planeta dentro del ecosistema.
 * Un planeta tiene un nombre que lo identifica.
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

public class Planeta {
  private String nombre;

  /**
   * Crea un nuevo planeta con el nombre especificado.
   * 
   * @param nombre el nombre del planeta.
   */
  public Planeta(String nombre) {
        this.nombre = nombre;
    }

  /**
     * Obtiene el nombre del planeta.
     * 
     * Returns el nombre del planeta.
     */
    public String getNombre() {
        return nombre;
    }

  /**
     * Establece un nuevo nombre para el planeta.
     * 
     * @param nombre el nuevo nombre del planeta.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
