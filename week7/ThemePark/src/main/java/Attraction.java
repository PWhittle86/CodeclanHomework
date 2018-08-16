public abstract class Attraction implements IReviewed {

    private String name;
    private int rating;

    public Attraction(String name) {
        this.name = name;
        this.rating = 0;
    }

    public String getName() {
        return name;
    }

    public int getRating() { return rating; }

}
