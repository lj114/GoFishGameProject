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
public class AIPlayerTest {
    
    public AIPlayerTest() {
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
     * Test of randomAsk method, of class AIPlayer.
     */
    @Test
    public void testRandomAsk() {
        System.out.println("randomAsk");
        AIPlayer instance = new AIPlayer();
        String expResult = "";
        String result = instance.randomAsk();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkForPairs method, of class AIPlayer.
     */
    @Test
    public void testCheckForPairs() {
        System.out.println("checkForPairs");
        AIPlayer instance = new AIPlayer();
        boolean expResult = false;
        boolean result = instance.checkForPairs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPairIndexes method, of class AIPlayer.
     */
    @Test
    public void testGetPairIndexes() {
        System.out.println("getPairIndexes");
        AIPlayer instance = new AIPlayer();
        int[] expResult = null;
        int[] result = instance.getPairIndexes();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
