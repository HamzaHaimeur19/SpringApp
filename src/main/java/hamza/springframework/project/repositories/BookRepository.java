package hamza.springframework.project.repositories;

import hamza.springframework.project.entities.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
