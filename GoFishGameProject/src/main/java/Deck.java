import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Lily Jennings
 */
public class Deck {
    //Private Variables
    private ArrayList<Card> deckOfCards;         //Deck of 52 cards.
    private int currentCard;            //Keep track of which card will be dealt next.
    
    
    //Constructor
    public Deck()
    {
        deckOfCards = new ArrayList<Card>();     //Create ArrayList.
        currentCard = 0;                //Fresh deck of cards, start dealing from the beginning.
        
        int i = 0;
        
        for(int s = 0; s <= 3; s++){
            for(int r = 1; r <= 13; r++){
                deckOfCards.add(new Card(s, r)); //Inserts new card at position i.
            }
        }
    }
    
    public Card getCurrentCard(){
        return deckOfCards.get(currentCard);
    }
    
    //Method to deal 1 card.
    public Card dealCard(){
        
        if(currentCard < 52){           //Check to see that there are still cards left in the deck.
            int c = currentCard;        //Store value of the current card before changing it.
            currentCard++;              //Move to next card in the deck.
            return (deckOfCards.get(c));    //Returns the current card.
        }
        else {
            System.out.println("No more cards left in deck");
            return (null); 
        }
    }
    
    //Method to shuffle deck.
    public void shuffleDeck(){
        Collections.shuffle(deckOfCards);
    }
}
