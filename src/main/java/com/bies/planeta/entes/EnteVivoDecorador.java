package com.bies.planeta.entes;

/**
 * Decorador abstracto para los entes vivos, que permite añadirles nuevas capacidades.
 *
 * <p>Propósito: Proveer una estructura base para decoradores que añaden funcionalidades
 * adicionales a los entes vivos, como habilidades de movimiento o alimentación.
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

public abstract class EnteVivoDecorador extends EnteVivo {
    private Ente ente;

    /**
     * Constructor que inicializa el decorador con el ente a decorar.
     *
     * @param e El ente vivo que será decorado.
     */
    public EnteVivoDecorador(EnteVivo e) {
        this.ente = e;
    }

    /**
     * Obtiene el ente decorado.
     *
     * Returns El ente decorado.
     */
    protected Ente getEnte() {
        return ente;
    }

    /**
     * Establece un nuevo ente a decorar.
     *
     * @param nuevoEnte El nuevo ente que será decorado.
     */
    protected void setEnte(Ente nuevoEnte) {
        this.ente = nuevoEnte;
    }

    /**
     * Degrada el ente vivo a un ente no vivo (carroña).
     */
    void degradacionMotora(){
        setEnte(new Carroña());
    }

}
