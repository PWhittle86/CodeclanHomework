public class ConferenceRoom extends Room{

    private String room_name;
    private int daily_rate;

    public ConferenceRoom(int capacity, String room_name, int daily_rate) {
        super(capacity);
        this.room_name = room_name;
        this.daily_rate = daily_rate;
    }

    public String getRoom_name() {
        return room_name;
    }

    public int getDaily_rate() {
        return daily_rate;
    }
}
