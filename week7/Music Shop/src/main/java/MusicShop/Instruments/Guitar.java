package MusicShop.Instruments;

public class Guitar extends Instrument {

    private String guitartype; //e.g electric, acoustic, bass...
    private int numberofstrings;

    public Guitar(Type type, String material, String colour, String brand, Double buyPrice, Double sellPrice, String guitartype, int numberofstrings) {
        super(type, material, colour, brand, buyPrice, sellPrice);
        this.guitartype = guitartype;
        this.numberofstrings = numberofstrings;
    }

    public String getGuitartype() {
        return guitartype;
    }

    public int getNumberofstrings() {
        return numberofstrings;
    }

    public String play() {
        return "Stairway to heaven!";
    }

}
