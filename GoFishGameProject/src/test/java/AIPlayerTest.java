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
    
    AIPlayer p;
    
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
        p = new AIPlayer();
        for(int i = 0; i < 4; i++){
            Card c = new Card(i, 0);        //All Cards are rank 2 of each suit.
            p.addCardtoHand(c);
        }
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
        assertEquals("2", p.randomAsk());       //Check if the rank found is 2.
    }

    /**
     * Test of checkForPairs method, of class AIPlayer.
     */
    @Test
    public void testCheckForPairs() {
        System.out.println("checkForPairs");
        assertEquals(true, p.checkForPairs()); //Since every card is rank 2, we expect checkForPairs() to be true.
    }

    /**
     * Test of getPairIndexes method, of class AIPlayer.
     */
    @Test
    public void testGetPairIndexes() {
        System.out.println("getPairIndexes");
        int[] expResult = {0, 1};
        int[] result = p.getPairIndexes();
        assertArrayEquals(expResult, result);
    }
    
}
