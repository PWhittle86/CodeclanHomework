package MusicShop.Stock;

import MusicShop.Interfaces.ISell;

public class Stock implements ISell {

    private String name;
    private Double buyPrice;
    private Double sellPrice;

    public Stock(String name, Double buyPrice, Double sellPrice) {
        this.name = name;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getName() {
        return name;
    }

    public double calculateMarkup() {
        return sellPrice - buyPrice;
    }

    public double getBuyPrice() {
        return this.buyPrice;
    }

    public double getSellPrice() {
        return this.sellPrice;
    }

}
