import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDodgems {

    Dodgems dodgems;
    Visitor wee_timmy;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Happy Dodgems!");
        wee_timmy = new Visitor("Wee Timmy", 120, 11, 15.00);
    }


    @Test
    public void dodgemsHasName(){
        assertEquals("Happy Dodgems!", dodgems.getName());
    }

    @Test
    public void youngChildPaysHalfPrice(){
        assertEquals(2.25, dodgems.priceFor(wee_timmy), 0.1);
    }

}
