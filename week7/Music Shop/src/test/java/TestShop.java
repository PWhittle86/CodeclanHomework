import MusicShop.Instruments.Guitar;
import MusicShop.Instruments.Instrument;
import MusicShop.Instruments.Type;
import MusicShop.Shop;
import MusicShop.Stock.Stock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestShop {

    Shop shop;
    Stock drumsticks;
    Instrument guitar;

    @Before
    public void setUp() throws Exception {
        shop = new Shop();
        drumsticks = new Stock("Drumsticks", 8.00, 12.00);
        guitar = new Guitar(Type.STRING, "Wood", "Black","Epiphone", 80.00, 120.00, "Electric", 6);

    }

    @Test
    public void stocklistIsEmpty(){
        assertEquals(0, shop.getStocklistSize());
    }

    @Test
    public void canAddStockToStockList(){
        shop.addStock(drumsticks);
        assertEquals(1, shop.getStocklistSize());
    }

    @Test
    public void canAddInstrumentToStockList(){
        shop.addStock(guitar);
        assertEquals(1, shop.getStocklistSize());
    }

    @Test
    public void canRemoveItemsFromStock(){
        shop.addStock(guitar);
        shop.addStock(drumsticks);
        shop.removeStock(guitar);
        shop.removeStock(drumsticks);

        assertEquals(0, shop.getStocklistSize());
    }

    @Test
    public void canCalculateTotalProfit(){
        shop.addStock(guitar);
        shop.addStock(drumsticks);

        assertEquals(44.00, shop.calculateProfit(), 0.1);
    }

}
