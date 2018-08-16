package MusicShop.Instruments;

public class Piano extends Instrument {

    public String pianotype;

    public Piano(Type type, String material, String colour, String brand, Double buyPrice, Double sellPrice, String pianotype) {
        super(type, material, colour, brand, buyPrice, sellPrice);
        this.pianotype = pianotype;
    }

    public String getPianotype() {
        return pianotype;
    }

    public String play() {
        return "Plinky plinky plonk.";
    }


}
