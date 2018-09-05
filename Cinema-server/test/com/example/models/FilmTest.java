/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.models;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Simone
 */
public class FilmTest {
    
    public FilmTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getTitolo method, of class Film.
     */
    @Test
    public void testGetTitolo() {
        System.out.println("getTitolo");
Film instance = new Film.Builder().build();
        String expResult = "Unknown";
        String result = instance.getTitolo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getGenere method, of class Film.
     */
    @Test
    public void testGetGenere() {
        System.out.println("getGenere");
        Film instance = new Film.Builder().build();
        String expResult = "Unknown";
        String result = instance.getGenere();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDurata method, of class Film.
     */
    @Test
    public void testGetDurata() {
        System.out.println("getDurata");
        Film instance = new Film.Builder().build();
        String expResult = "Unknown";
        String result = instance.getDurata();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTrama method, of class Film.
     */
    @Test
    public void testGetTrama() {
        System.out.println("getTrama");
        Film instance = new Film.Builder().build();
        String expResult = "Unknown";
        String result = instance.getTrama();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of Builder, success case.
     */
    @Test
    public void testBuilderOK() {
        System.out.println("testBuilderOK");
        try {
            new Film.Builder()
                    .setTitolo("Mission Impossible")
                    .setDurata("120''")
                    .build();
        } catch (IllegalArgumentException e) {
            fail("Should use default values.");
        }
    }

    /**
     * Test of Builder,title not set.
     */
    @Test
    public void testBuilderNoTitle() {
        System.out.println("testBuilderNoTitle");
        Film film = null;
        try {
            film = new Film.Builder()
                    .setDurata("120''")
                    .build();
            //IL FAIL DEVE ANDARE DOVE IL TEST NON DEVE PASSARE (in questo caso se va nella catch va bene)
            fail("Il build è fallito");
        } catch (IllegalArgumentException e) {
            //assertNotNull(film);
        }
    }

    /**
     * Test of Builder,duration not set.
     */
    @Test
    public void testBuilderNoDuration() {
        System.out.println("testBuilderNoTitle");
        Film film = null;
        try {
            film = new Film.Builder()
                    .setTitolo("Mission Impossible")
                    .build();
            fail("Il build è fallito");
        } catch (IllegalArgumentException e) {
            
        }
    }
    
    /**
     * Test of Builder, none of values is setted
     */
    @Test
    public void testBuilderNoValues() {
        System.out.println("testBuilderFromTo2");
        try {
            new Film.Builder()
                    .build();
        } catch (IllegalArgumentException e) {
            fail(e.getMessage());
        }
    }
}
