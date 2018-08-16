import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRollercoaster {

    Rollercoaster nemesis;
    Visitor bigjamie;
    Visitor wee_timmy;
    Visitor bigweedavie;
    Visitor bigbigdavie;

    @Before
    public void setUp() throws Exception {
        nemesis = new Rollercoaster("Nemesis");
        bigjamie = new Visitor("Big Jamie", 200, 21, 60.00);
        wee_timmy = new Visitor("Wee Timmy", 120, 11, 15.00);
        bigweedavie = new Visitor("Big Wee Davie", 230, 10, 10.00);
        bigbigdavie = new Visitor("Big Big Davie", 245, 43, 2500.00);
    }

    @Test
    public void nemesisHasName() {
        assertEquals("Nemesis", nemesis.getName());
    }

    @Test
    public void canRideTheRollercoaster(){
        assertEquals(true, nemesis.isAllowedTo(bigjamie));
    }

    @Test
    public void tooShortForTheRollercoaster(){
        assertEquals(false, nemesis.isAllowedTo(wee_timmy));
    }

    @Test
    public void massiveChildIsTooYoungForTheRollercoaster(){
        assertEquals(false, nemesis.isAllowedTo(bigweedavie));
    }

    @Test
    public void massiveAdultPaysAnExtortionatePrice(){
        assertEquals(16.80, nemesis.priceFor(bigbigdavie), 0.1);
    }



}
