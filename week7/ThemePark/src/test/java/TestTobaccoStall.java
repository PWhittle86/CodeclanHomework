import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTobaccoStall {

    TobaccoStall marlboro4all;
    Visitor bigjamie;
    Visitor wee_timmy;

    @Before
    public void setUp() throws Exception {
        marlboro4all = new TobaccoStall("Marlboro 4 All", "Phil Koffing", "Bay 3");
        bigjamie = new Visitor("Big Jamie", 200, 21, 60.00);
        wee_timmy = new Visitor("Wee Timmy", 120, 12, 15.00);
    }

    @Test
    public void marlboro4allHasName(){
        assertEquals("Marlboro 4 All", marlboro4all.getName());
    }

    @Test
    public void marlboro4allHasOwner(){
        assertEquals("Phil Koffing", marlboro4all.getOwnername());
    }

    @Test
    public void marlboro4allHasParking(){
        assertEquals("Bay 3", marlboro4all.getParkingspot());
    }

    @Test
    public void stallHasAgeLimit(){
        assertEquals(true, marlboro4all.isAllowedTo(bigjamie));
    }

    @Test
    public void stallWontSellToKids(){
        assertEquals(false, marlboro4all.isAllowedTo(wee_timmy));
    }
}
