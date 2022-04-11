/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author carlafloresgarcia00
 */
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of setTurn method, of class Player.
     */
    @Test
    public void testSetTurn() {
        System.out.println("setTurn");
        boolean t = false;
        Player instance = new Player();
        instance.setTurn(t);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isTurn method, of class Player.
     */
    @Test
    public void testIsTurn() {
        System.out.println("isTurn");
        Player instance = new Player();
        boolean expResult = false;
        boolean result = instance.isTurn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of handSize method, of class Player.
     */
    @Test
    public void testHandSize() {
        System.out.println("handSize");
        Player instance = new Player();
        int expResult = 0;
        int result = instance.handSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addCardtoHand method, of class Player.
     */
    @Test
    public void testAddCardtoHand() {
        System.out.println("addCardtoHand");
        Card c = null;
        Player instance = new Player();
        instance.addCardtoHand(c);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of removeCardfromHand method, of class Player.
     */
    @Test
    public void testRemoveCardfromHand() {
        System.out.println("removeCardfromHand");
        Card c = null;
        Player instance = new Player();
        Card expResult = null;
        Card result = instance.removeCardfromHand(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addPair method, of class Player.
     */
    @Test
    public void testAddPair() {
        System.out.println("addPair");
        Player instance = new Player();
        instance.addPair();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPairs method, of class Player.
     */
    @Test
    public void testGetPairs() {
        System.out.println("getPairs");
        Player instance = new Player();
        int expResult = 0;
        int result = instance.getPairs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
