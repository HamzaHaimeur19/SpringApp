package hamza.springframework.project.repositories;

import hamza.springframework.project.entities.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRespository extends CrudRepository<Publisher, Long> {
}
