package com.bies.planeta;

import com.bies.planeta.entes.Mosca;

public class App 
{
    public static void main( String[] args )
    {
        Mosca mosca =  new Mosca();


        System.err.println(mosca.comer());
        System.err.println(mosca.toString());
    }
}
