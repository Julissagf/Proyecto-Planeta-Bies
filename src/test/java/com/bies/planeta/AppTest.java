package com.bies.planeta;

import com.bies.planeta.entes.Mosca;

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

    public void testMoscaComer() {
        Mosca mosca =  new Mosca();

        // System.err.println(comerResult);
        // System.err.println(mosca.toString());

        assertNotNull(mosca.comer());
    }

    public void testMoscaMovilizar() {
        Mosca mosca =  new Mosca();

        // System.err.println(mosca.movilizarse());
        // System.err.println(mosca.toString());

        assertNotNull(mosca.movilizarse());
    }
}
