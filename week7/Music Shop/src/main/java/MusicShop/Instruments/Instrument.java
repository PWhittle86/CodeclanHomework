package MusicShop.Instruments;

import MusicShop.Interfaces.IPlay;
import MusicShop.Interfaces.ISell;

public abstract class Instrument implements IPlay, ISell {

    private Type type; //e.g. String, Brass, Woodwind etc
    private String material;
    private String colour;
    private String brand;
    private Double buyPrice;
    private Double sellPrice;

    public Instrument(Type type, String material, String colour, String brand, Double buyPrice, Double sellPrice) {
        this.type = type;
        this.material = material;
        this.colour = colour;
        this.brand = brand;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getType() {
        return type.getName();
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public String getBrand() {
        return brand;
    }

    public double getBuyPrice() {
        return this.buyPrice;
    }

    public double getSellPrice(){
        return this.sellPrice;
    }

    public void setBuyPrice(Double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public void setSellPrice(Double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public double calculateMarkup() {
        double profit;
        profit = sellPrice - buyPrice;

        return profit;
    }




}
