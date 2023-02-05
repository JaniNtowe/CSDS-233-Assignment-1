public class Book {
    public String title;
    public String isbn;
    public String author;

    Book(String title, String isbn, String author){
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }
    public String getTitle(){
        return title;
    }
    public String getIsbn(){
        return isbn;
    }
    public String getAuthor(){
        return author;
    }
}