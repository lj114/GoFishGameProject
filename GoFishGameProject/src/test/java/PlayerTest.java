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
    public static void setUpClass(){
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
     * Test of isTurn method, of class Player.
     */
    @Test
    public void testIsTurn() {
        System.out.println("isTurn");
        Player p = new Player();
        assertEquals(false, p.isTurn());    //Default is set to false.
    }
    
    /**
     * Test of setTurn method, of class Player.
     */
    @Test
    public void testSetTurn() {
        System.out.println("setTurn");
        Player p = new Player();
        p.setTurn(true);
        assertEquals(true, p.isTurn());     //Check if turn is true after setting it to true.
    }

    /**
     * Test of getPairs method, of class Player.
     */
    @Test
    public void testGetPairs() {
        System.out.println("getPairs");
        Player p = new Player();
        assertEquals(0, p.getPairs());      //Player has 0 pairs by default.
    }
    
    /**
     * Test of addPair method, of class Player.
     */
    @Test
    public void testAddPair() {
        System.out.println("addPair");
        Player p = new Player();
        p.addPair();
        assertEquals(1, p.getPairs());      //Check if player has 1 pair after using addPair() once.
    }
    
    /**
     * Test of handSize method, of class Player.
     */
    @Test
    public void testHandSize() {
        System.out.println("handSize");
        Player p = new Player();
        assertEquals(0, p.handSize());      //Player has 0 cards by default.
    }

    /**
     * Test of addCardtoHand method, of class Player.
     */
    @Test
    public void testAddCardtoHand() {
        System.out.println("addCardtoHand");
        Card c = new Card(0, 0);
        Player p = new Player();
        p.addCardtoHand(c);
        assertEquals(1, p.handSize());      //Check if hand size increased by 1 after addCardtoHand().
    }

    /**
     * Test of removeCardfromHand method, of class Player.
     */
    @Test
    public void testRemoveCardfromHand() {
        System.out.println("removeCardfromHand");
        Card c = new Card(0, 0);
        Player p = new Player();
        p.addCardtoHand(c);
        Card result = p.removeCardfromHand(c);
        assertEquals(c, result);            //Check if the card added is the same as the card removed.
    }
    
    /**
     * Test of removeCardfromHand method, of class Player.
     */
    @Test
    public void testRemoveCardfromHand2(){
        System.out.println("removeCardfromHand2");
        Card c = new Card(0, 1);
        Card a = new Card(2, 0);
        Player p = new Player();
        p.addCardtoHand(c);
        Card result = p.removeCardfromHand(a);
        assertEquals(null, result);         //Check that the result of removing a card that isn't in the player's hand is null.
    } 
}
