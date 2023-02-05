import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryDatabaseTest {
    @Test
    void libraryAddTest(){
        Book newBook1 = new Book("A Little Life", "9780385539258", "Yanagihara, Hanya");
        Book newBook2 = new Book("The Book Thief", "9780307475732", "Markus Zusak");
        Book newBook3 = new Book("Know My Name: A Memoir", "9780385539258", "Chanel Miller");
        Book newBook4 = new Book("Home Fire", "9781408886755", "Kamila Shamsie");
        Book newBook5 = new Book("The Power of Habit", "9780679603856", "Charles Duhigg");
        Book newBook6 = new Book("Kim Ji-young, Born 1982", "9783462003567", "Cho Nam-ju");
        Book newBook7 = new Book("The Catcher in the Rye", "9780316460002", "J. D. Salinger");
        Book newBook8 = new Book("First They Killed My Father", "9780060856267", "Loung Ung");

        LibraryDatabase myLibrary = new LibraryDatabase(8);
        assertEquals(newBook1,myLibrary.add(newBook1));
    }
}