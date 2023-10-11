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
        books.add(book);
    }

    //created a method to get book title
    public List<Book> getBook()
    {
        return books;
    }
}
