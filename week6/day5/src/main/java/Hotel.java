import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> bedrooms;
    private ArrayList<Room> conferencerooms;

    public Hotel() {
        this.bedrooms = new ArrayList<Room>();
        this.conferencerooms = new ArrayList<Room>();
    }

    public int countBedrooms() {
        return bedrooms.size();
    }

    public void addBedRoomToList(Room room) {
        bedrooms.add(room);
    }

    public int countConferencerooms() {
        return conferencerooms.size();
    }

    public void addConferenceRoomToList(Room room) {
        conferencerooms.add(room);
    }
}
