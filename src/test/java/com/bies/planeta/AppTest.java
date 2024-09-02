package com.bies.planeta;

import com.bies.planeta.entes.Mariposa;
import com.bies.planeta.entes.Mosca;
import com.bies.planeta.entes.Arana;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    /**
     * Prueba unitaria de una mosca comiendo.
     */
    public void testMoscaComer() {
        Mosca mosca =  new Mosca();
        assertNotNull(mosca.comer());
    }

    /**
     * Prueba unitaria de una mosca movilizandose.
     */
    public void testMoscaMovilizar() {
        Mosca mosca =  new Mosca();
        assertNotNull(mosca.movilizarse());
    }
    
    /**
     * Prueba unitaria de una mariposa comiendo.
     */
    public void testMariposaComer() {
        Mariposa mariposa =  new Mariposa();
        assertNotNull(mariposa.comer());
    }

    /**
     * Prueba unitaria de una mariposa movilizandose.
     */
    public void testMariposaMovilizar() {
        Mariposa mariposa =  new Mariposa();
        assertNotNull(mariposa.movilizarse());
    }

    /**
     * Prueba unitaria de una araña comiendo.
     */
    public void testAranaComer() {
        Arana arana =  new Arana();
        assertNotNull(arana.comer());
    }

    /**
     * Prueba unitaria de una araña movilizandose.
     */
    public void testAranaMovilizar() {
        Arana arana =  new Arana();
        assertNotNull(arana.movilizarse());
    }
}
