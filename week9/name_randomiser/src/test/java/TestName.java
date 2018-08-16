import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestName {

    Name name;


    @Before
    public void setUp() throws Exception {
        name = new Name("Peter", "Whittle");
    }

    @Test
    public void hasFirstName() {
        assertEquals("Peter", name.getFirstName());
    }

    @Test
    public void hasLastName(){
        assertEquals("Whittle", name.getLastName());
    }

    @Test
    public void canSetFirstName(){
        name.setFirstName("Geoffrey");
        assertEquals("Geoffrey", name.getFirstName());
    }

    @Test
    public void canSetLastName(){
        name.setLastName("Peterson");
        assertEquals("Peterson", name.getLastName());
    }

    @Test
    public void canGetFullName(){
        assertEquals("Peter Whittle", name.getFullName());
    }

}
