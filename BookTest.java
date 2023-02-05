import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void bookTitleTest(){
        Book newBook = new Book("A Little Life", "9780385539258", "Yanagihara, Hanya");
        assertEquals("A Little Life", newBook.getTitle());
    }
    @Test
    void bookISBNTest(){
        Book newBook = new Book("A Little Life", "9780385539258", "Yanagihara, Hanya");
        assertEquals("9780385539258", newBook.getIsbn());
    }
    @Test
    void bookAuthorTest(){
        Book newBook = new Book("A Little Life", "9780385539258", "Yanagihara, Hanya");
        assertEquals("Yanagihara, Hanya", newBook.getAuthor());
    }
}