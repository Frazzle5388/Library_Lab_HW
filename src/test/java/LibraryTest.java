import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book;

    @Before
    public void before() {
        library = new Library("Public Library");
        book = new Book();
    }

    @Test
    public void libraryStartsEmpty(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBook(){
        library.add(book);
        assertEquals(1, library.bookCount());
    }
}
