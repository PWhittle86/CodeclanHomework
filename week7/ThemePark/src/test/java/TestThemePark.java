import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestThemePark {

    ThemePark shadytowers;
    CandyFlossStall pinkfluff;
    IceCreamStall mrwhippy;
    Rollercoaster nemesis;
    Dodgems dodgems;


    @Before
    public void setUp() throws Exception {
        shadytowers = new ThemePark("Shady Towers");
        dodgems = new Dodgems("Happy Dodgems!");
        nemesis = new Rollercoaster("Nemesis");
        mrwhippy = new IceCreamStall("Mr Whippy", "Franco Lombardo", "Bay 1");
        pinkfluff = new CandyFlossStall("Pink Fluff", "Big Davey", "Bay 2");
    }

    @Test
    public void shadytowersHasName(){
        assertEquals("Shady Towers", shadytowers.getName());
    }

    @Test
    public void canAddAttraction(){
        shadytowers.addToAttractions(nemesis);
        assertEquals(1, shadytowers.attractionsCount());
    }

    @Test
    public void canAddStall(){
        shadytowers.addToStalls(pinkfluff);
        assertEquals(1, shadytowers.stallsCount());
    }

    @Test
    public void canAddIReviewedToReviews () {
        shadytowers.addToReviews(mrwhippy);
        assertEquals(1, shadytowers.reviewsCount());
    }



}
