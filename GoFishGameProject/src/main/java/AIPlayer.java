import java.util.ArrayList;

/**
 *
 * @author Lily Jennings and Carla Flores Garcia
 */
public class AIPlayer extends Player {
    
    //Randomly chooses a Card from AI Player's hand, and returns the 
    //rank of that card in order to ask for that value on turn.
    public String randomAsk(){
        int size = hand.size();
        int rand = (int)(Math.random() * size);
        return hand.get(rand).getRank();
    }
    
    //Returns true if there are Cards in the AI Player's hand
    //eligible to be paired. 
    public boolean checkForPairs(){

        for(int i = 0; i < hand.size(); i++){
            for(int j = i+1; j < hand.size(); j++){
                if(hand.get(j).getRank().equals(hand.get(i).getRank()))
                    return true;
            }
        }
        return false;
    }
    
    //Returns array with the indexes from AI Player's hand
    //of the Cards that can be paired.
    public int[] getPairIndexes(){
        int[] ps = new int[2];
        
        for(int i = 0; i < hand.size(); i++){
            for(int j = i+1; j < hand.size(); j++){
                if(hand.get(j).getRank().equals(hand.get(i).getRank())){
                    ps[0] = i;
                    ps[1] = j;
                }     
            }
        }
        
        return ps;
    }
}
