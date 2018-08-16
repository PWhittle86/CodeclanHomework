import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBedroom {

    Bedroom bedroom1;

    @Before
    public void setUp() throws Exception {
        bedroom1 = new Bedroom(BedroomType.SINGLE.getCapacity(), 1, BedroomType.SINGLE, 50 );
    }

    @Test
    public void testRoomHasCapacity(){assertEquals(1, bedroom1.getCapacity());}

    @Test
    public void testRoomHasNoGuests(){assertEquals(0, bedroom1.getGuests());}

    @Test
    public void testRoomHasNumber(){assertEquals(1, bedroom1.getRoom_number());
    }

    @Test
    public void testRoomHasType(){assertEquals(BedroomType.SINGLE, bedroom1.getBedroomType());
    }

    @Test
    public void testRoomHasNightlyRate(){assertEquals(50, bedroom1.getNightly_rate());
    }

}
