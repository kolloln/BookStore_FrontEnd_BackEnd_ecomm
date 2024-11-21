package BookStore.BookStore.service;

import BookStore.BookStore.model.Book;
import BookStore.BookStore.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public List<Book>findAllBooks(){//fetch all Books
        return bookRepository.findAll();
    }

    public Book addBook(Book book){//Add a new Book
        return bookRepository.save(book);
    }
    public void deleteBook(Long id){//Delete a Book By Id
        bookRepository.deleteById(id);
    }

}