package com.bies.planeta;

/**
 * Representa una araña en el sistema. La araña es un tipo de insecto que se alimenta
 * inicialmente de hongos, pero su dieta puede ser modificada utilizando el patrón Strategy.
 * 
 * <p>Autores: 
 * Fernando Acuña Zeledón - 1-1890-0988, 
 * Julissa Gómez Fuentes - 1-1890-0658, 
 * Julián David Ramírez Salas - 1-1874-0667, 
 * Juan Pablo Segura Astúa - 1-1875-0806
 * 
 * <p>Fecha: 2024-09-01
 * 
 * <p>Propósito: Implementar una clase que representa una araña, la cual puede alimentarse
 * de diferentes tipos de alimentos según el contexto.
 */

public class Arana extends Insecto {

    /**
     * Constructor que inicializa la dieta de la araña a alimentarse de hongos.
     */
    public Arana(){ //Strategy
        alimentarse = new AlimentarseDeHongo();
    }

    @Override
    public void setAlimentarse(Alimentarse a){
        alimentarse = a;
    }

    @Override
    public String comer(){
        return alimentarse.alimentarse();
    }

    @Override
    public String toString(){
        return super.toString() + " una Araña.";
    }

}
