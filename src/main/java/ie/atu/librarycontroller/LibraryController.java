package ie.atu.librarycontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController

public class LibraryController {
    private final LibraryService libraryService;
    @Autowired  //Using setter injection to inject an instance of library service
    public LibraryController(LibraryService libraryService)
    {
        this.libraryService = libraryService;
    }

    @GetMapping("get-books")
    public List<Book> books()
    {
    return libraryService.getBook(); //return getBook method in library Service

    }



    //implement a method to handle Post requests to add a book to the library
    @PostMapping("/confirm-book")
    public Object confirmBook(@RequestBody Book book)
    {
        libraryService.addBook(book); //using libraryService addbook method to return a book
        return "Book " + book + " Added";
    }

}
