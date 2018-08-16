import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPlayground {

    Playground kiddiepark;
    Visitor bigjamie;

    @Before
    public void setUp() throws Exception {
        kiddiepark = new Playground("Kiddie Park");
        bigjamie = new Visitor("Big Jamie", 200, 21, 60.00);
    }

    @Test
    public void parkHasName(){
        assertEquals("Kiddie Park", kiddiepark.getName());
    }


    @Test
    public void parkHasAgeLimit(){
        assertEquals(false, kiddiepark.isAllowedTo(bigjamie));
    }
}
