import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHotel {

    Hotel fawlty_towers;

    Bedroom single_bedroom;
    Bedroom double_bedroom;
    ConferenceRoom meeting_room;

    Guest guest1;
    Guest guest2;
    Guest guest3;

    @Before
    public void setUp() throws Exception {
        single_bedroom = new Bedroom(BedroomType.SINGLE.getCapacity(), 1, BedroomType.SINGLE, 50);
        double_bedroom = new Bedroom(BedroomType.DOUBLE.getCapacity(), 2, BedroomType.DOUBLE, 100);
        meeting_room = new ConferenceRoom(50, "Meeting Room", 200);

        guest1 = new Guest("Pete");
        guest2 = new Guest("Jen");
        guest3 = new Guest("Matt");

        fawlty_towers = new Hotel();

        fawlty_towers.addBedRoomToList(single_bedroom);
        fawlty_towers.addBedRoomToList(double_bedroom);
        fawlty_towers.addConferenceRoomToList(meeting_room);

    }

    @Test
    public void hotelHasBedRooms(){
        assertEquals(2, fawlty_towers.countBedrooms());
    }

    @Test
    public void hotelHasConferenceRooms(){
        assertEquals(1, fawlty_towers.countConferencerooms());
    }

    @Test
    public void checkInGuestToRoom(){
        single_bedroom.check_in(guest1);
        assertEquals(1, single_bedroom.getGuests());
    }

    @Test
    public void checkGuestOutOfRoom(){
        double_bedroom.check_in(guest1);
        double_bedroom.check_in(guest2);

        assertEquals(2, double_bedroom.getGuests());

        double_bedroom.check_out(guest1);

        assertEquals(1, double_bedroom.getGuests());
    }

    @Test
    public void checkWhichGuestsInRoom(){
        double_bedroom.check_in(guest1);
        assertEquals("Pete", double_bedroom.inhabitants().get(0));
    }




}
