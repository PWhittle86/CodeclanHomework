import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCandyFloss{

    CandyFlossStall pinkfluff;

    @Before
    public void setUp() throws Exception {
        pinkfluff = new CandyFlossStall("Pink Fluff", "Big Davey", "Bay 2");
    }

    @Test
    public void pinkfluffHasName(){
        assertEquals("Pink Fluff", pinkfluff.getName());
    }

    @Test
    public void pinkfluffHasOwner(){
        assertEquals("Big Davey", pinkfluff.getOwnername());
    }

    @Test
    public void pinkfluffHasParking(){
        assertEquals("Bay 2", pinkfluff.getParkingspot());
    }

}
