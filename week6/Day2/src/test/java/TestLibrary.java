import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLibrary {

    Library mitchell_library;

    Book hisDarkMaterials;
    Book lordOfTheRings;
    Book nineteenEightyFour;

    @Before
    public void before(){
        mitchell_library = new Library();
        hisDarkMaterials = new Book("His Dark Materials", "Philip Pullman", "Fantasy");
        lordOfTheRings = new Book("The Lord Of The Rings", "J R R Tolkien", "Fantasy");
        nineteenEightyFour = new Book("NineteenEightyFour", "George Orwell", "Sci-Fi");
    }

    @Test
    public void libraryStartsEmpty(){
        assertEquals(0, mitchell_library.bookCount());
    }

    @Test
    public void addBook(){
        mitchell_library.addBook(hisDarkMaterials);
        assertEquals(1, mitchell_library.bookCount());
    }

    @Test
    public void capacityGoesDown(){
        mitchell_library.addBook(hisDarkMaterials);
        assertEquals(9, mitchell_library.checkCapacity());
    }


}
