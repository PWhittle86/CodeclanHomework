import MusicShop.Instruments.Guitar;
import MusicShop.Instruments.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGuitar {


    Guitar guitar;


    @Before
    public void setUp() throws Exception {
        guitar = new Guitar(Type.STRING, "Wood", "Glossy Black", "Epiphone", 50.00, 80.00, "Electric",6 );
    }


    @Test
    public void canGetType(){
        assertEquals("String", guitar.getType());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void canGetBrand(){
        assertEquals("Epiphone", guitar.getBrand());
    }

    @Test
    public void canGetGuitarType(){
        assertEquals("Electric", guitar.getGuitartype());
    }

    @Test
    public void canGetNumberOfStrings(){
        assertEquals(6, guitar.getNumberofstrings());
    }

    @Test
    public void canPlay(){
        assertEquals("Stairway to heaven!", guitar.play());
    }

    @Test
    public void calculateProfit(){
        assertEquals(30, guitar.calculateMarkup(), 0.1);
    }


}
