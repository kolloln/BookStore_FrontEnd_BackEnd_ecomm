package BookStore.BookStore.controller;

import BookStore.BookStore.model.Book;
import BookStore.BookStore.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")//Base URL for all endpoints in this controller
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) { // Constructor injection for the service
        this.bookService = bookService;
    }
    @GetMapping
    public List<Book>getAllBooks(){// Get all books
        return bookService.findAllBooks();
    }
    @PostMapping
    public Book addBook(@RequestBody Book book){// Add a new book
        return bookService.addBook(book);
    }
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id){//Delete a book by ID
        bookService.deleteBook(id);
    }

}
