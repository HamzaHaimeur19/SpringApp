package hamza.springframework.project.repositories;

import hamza.springframework.project.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
