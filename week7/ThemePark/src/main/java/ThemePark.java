import java.util.ArrayList;

public class ThemePark {

    private String name;
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private ArrayList<IReviewed> reviews;


    public ThemePark(String name) {
        this.name = name;
        this.attractions = new ArrayList<Attraction>();
        this.stalls = new ArrayList<Stall>();
        this.reviews = new ArrayList<IReviewed>();
    }

    public String getName() {
        return name;
    }

    public void addToAttractions(Attraction attraction){
        attractions.add(attraction);
    }

    public int attractionsCount(){
        return attractions.size();
    }

    public void addToStalls(Stall stall){
        stalls.add(stall);
    }

    public int stallsCount(){
        return stalls.size();
    }

    public void addToReviews(IReviewed Ireviewed){
        reviews.add(Ireviewed);
    }

    public int reviewsCount(){
        return reviews.size();
    }

    public void visit(Visitor visitor, Attraction attraction){
        
    }

}
