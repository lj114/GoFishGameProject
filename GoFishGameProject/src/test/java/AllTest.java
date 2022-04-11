import org.junit.runner.RunWith;
import org.junit.runners.Suite;
/**
 *
 * @author Lily Jennings and Carla Flores Garcia
 */
 
@RunWith(Suite.class)

@Suite.SuiteClasses({
   CardTest.class,
   DeckTest.class,
   PlayerTest.class,
   AIPlayerTest.class
})
public class AllTest { 
}
