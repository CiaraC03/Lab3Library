package ie.atu.librarycontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class LibraryController {
    private final LibraryService libraryService;
    @Autowired  //Using setter injection to inject an instance of library service
    public LibraryController(LibraryService libraryService)
    {
        this.libraryService = libraryService;
    }

    @GetMapping("get-books")
    public String retrieveBook(Book book)
    {
        libraryService.getBook();
        return "Book " + book + " Retrieved";
    }

    //implement a method to handle Post requests to add a book to the library
    @PostMapping("/confirm-book")
    public Object confirmBook(@RequestBody Book book)
    {
        libraryService.addBook(book);
        return "Book " + book + " Added";
    }

}
