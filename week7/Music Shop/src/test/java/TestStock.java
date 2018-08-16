import MusicShop.Stock.Stock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestStock {

    Stock stock;


    @Before
    public void setUp() throws Exception {
        stock = new Stock("Drumsticks", 8.00, 12.00);
    }


    @Test
    public void stockHasName(){
        assertEquals("Drumsticks", stock.getName());
    }

    @Test
    public void stockHasBuyPrice(){
        assertEquals(8.00, stock.getBuyPrice(), 0.1);
    }

    @Test
    public void stockHasSellPrice(){
        assertEquals(12.00, stock.getSellPrice(), 0.1);
    }


}
