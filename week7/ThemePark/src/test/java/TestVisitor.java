import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestVisitor {

    Visitor wee_timmy;

    @Before
    public void setUp() throws Exception {
        wee_timmy = new Visitor("Wee Timmy", 120, 12, 15.00);
    }

    @Test
    public void wee_timmyHasName(){
        assertEquals("Wee Timmy", wee_timmy.getName());
    }

    @Test
    public void wee_timmyHasHeight(){
        assertEquals(120, wee_timmy.getHeight());
    }

    @Test
    public void wee_timmyHasAge(){
        assertEquals(12, wee_timmy.getAge());
    }

    @Test
    public void wee_timmyHasMoney(){
        assertEquals(15.00, wee_timmy.getMoney(),0.01);
    }


}
