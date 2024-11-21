package BookStore.BookStore.repository;

import BookStore.BookStore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;



public interface BookRepository extends JpaRepository<Book,Long>{
}
