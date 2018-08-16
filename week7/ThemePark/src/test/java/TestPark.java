import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPark {

    Park chill_park;

    @Before
    public void setUp() throws Exception {
        chill_park = new Park("Chill Park");
    }

    @Test
    public void parkHasName(){
        assertEquals("Chill Park", chill_park.getName());
    }

}
