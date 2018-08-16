import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestConferenceRoom {

    ConferenceRoom conferenceRoom1;

    @Before
    public void setUp() throws Exception {
        conferenceRoom1 = new ConferenceRoom(30, "Meeting Room", 100);
    }

    @Test
    public void roomHasCapacity(){
    assertEquals(30, conferenceRoom1.getCapacity());}

    @Test
    public void roomHasName(){
        assertEquals("Meeting Room", conferenceRoom1.getRoom_name());
    }

    @Test
    public void roomHasDailyRate(){
        assertEquals(100, conferenceRoom1.getDaily_rate());
    }

    @Test
    public void roomHasNoGuests(){
        assertEquals(0, conferenceRoom1.getGuests());
    }



}
