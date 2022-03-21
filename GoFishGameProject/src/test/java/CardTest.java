
import java.util.ArrayList;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;

/**
 *
 * @author Lily Jennings and Carla Flores Garcia
 */

@RunWith(Parameterized.class)
public class CardTest {
    private int inS, inR, exS, exR;
    private String[] cardSuit = {"Clubs", "Spades", "Hearts", "Diamonds"};
    private String[] cardRank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace",};
    
    //Constructor
    public CardTest(int s, int r, int xS, int xR){
        inS = s;
        inR = r;
        exS = xS;
        exR = xR;
    }
    
    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        
        Collection<Object[]> data = new ArrayList<Object[]>();
        for(int i = 0; i <  4; i++){
            for(int j = 0; j < 13; j++){
                Object[] c = new Object[]{i, j, i, j};
                data.add(c);
            }
        }
        return data;
    }
    
    
    @Test
    public void testSuitandValue() {
        Card cTest = new Card(inS, inR);
        
        assertEquals(cardSuit[exS], cTest.getSuit());
        assertEquals(cardRank[exR], cTest.getRank());
    }
    
}