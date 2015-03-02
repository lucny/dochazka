/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hujer;

import dochazka.Osoba;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ml
 */
public class OsobaTest {
    
    public OsobaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getJmeno method, of class Osoba.
     */
    @Test
    public void testGetJmeno() {
        System.out.println("getJmeno");
        Osoba instance = new Osoba();
        String expResult = "";
        String result = instance.getJmeno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJmeno method, of class Osoba.
     */
    @Test
    public void testSetJmeno() {
        System.out.println("setJmeno");
        String jmeno = "";
        Osoba instance = new Osoba();
        instance.setJmeno(jmeno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrijmeni method, of class Osoba.
     */
    @Test
    public void testGetPrijmeni() {
        System.out.println("getPrijmeni");
        Osoba instance = new Osoba();
        String expResult = "";
        String result = instance.getPrijmeni();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrijmeni method, of class Osoba.
     */
    @Test
    public void testSetPrijmeni() {
        System.out.println("setPrijmeni");
        String prijmeni = "";
        Osoba instance = new Osoba();
        instance.setPrijmeni(prijmeni);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Osoba.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Osoba instance = new Osoba();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
