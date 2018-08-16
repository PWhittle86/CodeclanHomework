package MusicShop.Instruments;

public class Flute extends Instrument {

    public String flutetype;

    public Flute(Type type, String material, String colour, String brand, Double buyPrice, Double sellPrice, String flutetype) {
        super(type, material, colour, brand, buyPrice, sellPrice);
        this.flutetype = flutetype;
    }

    public String getFlutetype() {
        return flutetype;
    }

    public String play() {
        return "Jazzy flute solo!";
    }

}
