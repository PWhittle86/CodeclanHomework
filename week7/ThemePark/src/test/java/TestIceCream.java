import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestIceCream {

    IceCreamStall mrwhippy;

    @Before
    public void setUp() throws Exception {
        mrwhippy = new IceCreamStall("Mr Whippy", "Franco Lombardo", "Bay 1");
    }

    @Test
    public void mrwhippyHasName(){
        assertEquals("Mr Whippy", mrwhippy.getName());
    }

    @Test
    public void mrwhippyHasOwner(){
        assertEquals("Franco Lombardo", mrwhippy.getOwnername());
    }

    @Test
    public void mrwhippyHasParking(){
        assertEquals("Bay 1", mrwhippy.getParkingspot());
    }
}
