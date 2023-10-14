package ie.atu.librarycontroller;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class LibraryService {
//using array List to add book
private List<Book> books = new ArrayList<>();

    public void addBook(Book book) //created a method to adda book to library
    {
        //using array list print the book title, author, isbn, publishedYr
        books.add(book);
        System.out.println("Books" + book.getTitle());
        System.out.println("Author" + book.getAuthor());
        System.out.println("Isbn" + book.getIsbn());
        System.out.println("Published Year" + book.getPublishedYr());

    }

    //created a method to get book title and return the array title
    public List<Book> getBook()
    {
        return books;
    }
}
