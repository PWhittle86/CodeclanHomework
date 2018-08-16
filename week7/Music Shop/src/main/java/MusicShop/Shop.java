package MusicShop;

import MusicShop.Interfaces.ISell;
import MusicShop.Stock.Stock;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stocklist;

    public Shop() {
        stocklist = new ArrayList<ISell>();
    }

    public int getStocklistSize() {
        return stocklist.size();
    }

    public void addStock(ISell stock) {
        this.stocklist.add(stock);
    }

    public void removeStock(ISell stock) {
        this.stocklist.remove(stock);
    }

    public Double calculateProfit(){
        Double profit = 0.00;

        for (ISell stock : stocklist){
           profit += (stock.getSellPrice() - stock.getBuyPrice());
        }
        return profit;
    }

}
