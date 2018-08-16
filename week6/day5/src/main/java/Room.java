import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;

    public Room(int capacity){
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public int getCapacity() {
        return capacity;
    }

    public int getGuests() {
        return guests.size();
    }

    public void check_in(Guest guest) {
        if (this.capacity > 0) {this.guests.add(guest);} {this.capacity -= 1;}
    }

    public void check_out(Guest guest) {
        this.guests.remove(guest);
    }

    public ArrayList<String> inhabitants(){

        ArrayList<String> output = new ArrayList<String>();
        String guestname = new String();

        for (Guest guest : this.guests)
        {guestname = guest.getName();}
        {output.add(guestname);}

        return output;
    }

}
