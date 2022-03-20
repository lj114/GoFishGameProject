
/**
 *
 * @author Lily Jennings
 */
public class Deck {
    //Private Variables
    private Card[] deckOfCards;         //Deck of 52 cards.
    private int currentCard;            //Keep track of which card will be dealt next.
    
    
    //Constructor
    public Deck()
    {
        deckOfCards = new Card[52];     //Create array.
        currentCard = 0;                //Fresh deck of cards, start dealing from the beginning.
        
        int i = 0;
        
        for(int s = 0; s <= 3; s++){
            for(int r = 1; r <= 13; r++){
                deckOfCards[i++] = new Card(s, r); //Inserts new card at position i.
            }
        }
    }
    
    //Method to deal 1 card.
    public Card dealCard(){
        
        if(currentCard < 52){           //Check to see that there are still cards left in the deck.
            int c = currentCard;        //Store value of the current card before changing it.
            currentCard++;              //Move to next card in the deck.
            return (deckOfCards[c]);    //Returns the current card.
        }
        else {
            System.out.println("No more cards left in deck");
            return (null); 
        }
    }
    
    //Method to shuffle deck with n movements.
    public void shuffleDeck(int n){
        
        int i, j, k;
        
        for(k = 0; k < n; k++){         //Repeat Shuffle n times.
            
            i = (int) (52 * Math.random());     //Picks 2 random cards in the deck.
            j = (int) (52 * Math.random()); 
            
            Card temp = deckOfCards[i];         //Store value of first Card.
            deckOfCards[i] = deckOfCards[j];    //Put second card where the first card was.
            deckOfCards[j] = temp;              //Put first card where the second card was.
        }
    }
}
