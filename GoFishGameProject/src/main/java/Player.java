import java.util.ArrayList;

/**
 *
 * @author Lily Jennings and Carla Flores Garcia
 */
public class Player {
    
    protected ArrayList<Card> hand; //Player's hand of cards.
    protected int pairs; //Counts the number of pairs the player has.
    protected boolean turn; //Tracks if it is the player's turn. 
    
    public Player(){
        hand = new ArrayList<Card>();
        pairs = 0;
        turn = false;
    }
    
    //Set turn to true or false.
    public void setTurn(boolean t){
        turn = t;
    }
    
    //Returns true or false, to check if it is the Player's turn.
    public boolean isTurn(){
        return turn;
    }
    
    //Returns the number of cards in the player's hand.
    public int handSize(){
        return hand.size();
    }
    
    //Add a specified Card to the player's hand.
    public void addCardtoHand(Card c){
        hand.add(c);
    }
    
    //Remove a specified Card from the player's hand and returns it.
    public Card removeCardfromHand(Card c){
        int check = hand.indexOf(c);    //Checks if the card is in the player's hand. 
        if(check == -1){
            System.out.println("Card is not in player's hand, cannot be removed.");
            return null;
        }
        else{
            hand.remove(check);
            return c;
        }  
    }
    
    //Add 1 to pairs.
    public void addPair(){
        pairs++;
    }
    
    //Returns number of pairs the player has made.
    public int getPairs(){
        return pairs;
    }
}
