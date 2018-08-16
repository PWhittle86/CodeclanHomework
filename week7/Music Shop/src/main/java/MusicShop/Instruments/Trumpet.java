package MusicShop.Instruments;

public class Trumpet extends Instrument {

    public String valvetype;

    public Trumpet(Type type, String material, String colour, String brand, Double buyPrice, Double sellPrice, String valvetype) {
        super(type, material, colour, brand, buyPrice, sellPrice);
        this.valvetype = valvetype;
    }

    public String getValvetype() {
        return valvetype;
    }


    public String play() {
        return "PARP PARP PARP!";
    }


}
