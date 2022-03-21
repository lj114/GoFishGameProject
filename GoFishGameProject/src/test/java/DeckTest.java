/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lily Jennings and Carla Flores Garcia
 */
public class DeckTest {
    
    public DeckTest() {
    }

    /**
     * Test of dealCard method, of class Deck.
     */
    @Test
    public void testDealCard() {
        System.out.println("dealCard");
        Deck instance = new Deck();
        Card result = instance.dealCard();
        assertTrue(Card.class.isInstance(result)); //Checking if dealCard returns a Card.
    }
    
    public void testEmptyDeal(){
        System.out.println("dealCard empty");
        Deck instance = new Deck();
        for(int i = 0; i < 52; i++){
            instance.dealCard();
        }
        assertEquals(null, instance.dealCard()); //Checking if dealCard returns null when deck is empty.
    }

    /**
     * Test of shuffleDeck method, of class Deck.
     */
    @Test
    public void testShuffleDeck() {
        System.out.println("shuffleDeck");
        int n = 10;
        Deck instance = new Deck();
        Card one = instance.getCurrentCard();
        instance.shuffleDeck();
        Card two = instance.getCurrentCard();
        assertTrue(one != two); //Tests that there is a new Card in the first position of the deck.
    }
    
}
