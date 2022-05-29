package fine;

import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Zyad
 */
public class FineTest {
    
    public FineTest() {
    }

    /**
     * Test of computeFine1 method, of class Fine.
     */
    @Test
    public void testComputeFine1() {
    }

    /**
     * Test of computeFine1Stub method, of class Fine.
     */
    @Test
    public void testComputeFine1Stub() {
    }

    /**
     * Test of payFine method, of class Fine.
     */
    @Test
    public void testPayFine() {
    /*   Fine f = new Fine("Ali","100 steps","Zyad","Nada",new Date(2022,5,5),new Date(2022,6,25),false);
        int expected = 400;
        int actual = (int) f.payFine();
        assertEquals(expected,actual);*/
    }

    /**
     * Test of main method, of class Fine.
     */
    @Test
    public void testMain() {
    }

    /**
     * Test of payFineDriver method, of class Fine.
     */
    @Test
    public void testPayFineDriver() {
        Fine f = new Fine("Ali","100 steps","Zyad","Nada",new Date(2022,5,5),new Date(2022,7,2),false);
        int expected = 560;
        int actual = (int) f.payFineDriver();
        assertEquals(expected,actual);
    }
    
}