public abstract class Stall implements IReviewed {

    private String name;
    private String ownername;
    private String parkingspot;
    private int rating;

    public Stall(String name, String ownername, String parkingspot) {
        this.name = name;
        this.ownername = ownername;
        this.parkingspot = parkingspot;
        this.rating = 0;
    }

    public String getName() {
        return name;
    }

    public String getOwnername() {
        return ownername;
    }

    public String getParkingspot() {
        return parkingspot;
    }

    public int getRating() { return rating; }

}
