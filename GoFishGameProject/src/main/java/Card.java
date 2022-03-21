
/**
 *
 * @author Lily Jennings and Carla Flores Garcia
 */
public class Card {
    //Private variables
    private int suit; //Club = 0, Spade = 1, Heart = 2, Diamond = 3.
    private int rank; //Ace = 1, Two = 2, ... , King = 13.
    private String[] cardSuit = {"Clubs", "Spades", "Hearts", "Diamonds"};
    private String[] cardRank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    private String cardIMG; //Filename for the card image.
    
    //Constructor
    public Card(int s, int r) //s = suit, r = rank
    {
        suit = s;
        rank = r;
        setCardIMG(s, r);
    }
    
    
    //Sets card IMG based on card suit and rank.
    private void setCardIMG(int s, int r)
    {
        if(s == 0){
            cardIMG = r + "Clubs.png";
        }
        if(s == 1){
            cardIMG = r + "Spades.png";
        }
        if(s == 2){
            cardIMG = r + "Heart.png";
        }
        if(s == 3){
            cardIMG = r + "Diamond.png";
        }
    }
    
    //Returns the value of the suit of the card.
    public String getSuit(){
        return cardSuit[suit];
    }
    
    //Returns the value of the rank of the card.
    public String getRank(){
        return cardRank[rank];
    }
    
    //Returns the filename of the card image.
    public String getCardIMG(){
        return cardIMG;
    }
}
