import java.util.ArrayList;

public class Bedroom extends Room {

    private int room_number;
    private BedroomType bedroomType;
    private int nightly_rate;

    public Bedroom(int capacity, int room_number, BedroomType bedroomType, int nightly_rate){
        super(capacity);
        this.room_number = room_number;
        this.bedroomType = bedroomType;
        this.nightly_rate = nightly_rate;
    }

    public int getRoom_number() {
        return room_number;
    }

    public BedroomType getBedroomType() {
        return bedroomType;
    }

    public int getNightly_rate() {
        return nightly_rate;
    }

}
