package wolox.training.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import wolox.training.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByAuthor(String bookAuthor);
    List<Book> findByTitle(String bookTitle);
}
