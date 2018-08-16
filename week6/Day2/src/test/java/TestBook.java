import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBook {

    Book book1;
    Book book2;
    Book book3;


    @Before
    public void before(){
        book1 = new Book("Murder on the Orient Express", "Agatha Christie", "Crime");
    }


    @Test
    public void bookHasTitle() {
        assertEquals("Murder on the Orient Express", book1.getTitle());
    }

}
