package ie.atu.librarycontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryService {

    private Book book;


    @Autowired
    public String addBook(Book book) //created a method to adda book to library
    {
        return book.setTitle();
    }

    //created a method to get book title
    public String getBook()
    {
        return book.getTitle();
    }
}
