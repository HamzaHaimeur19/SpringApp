package hamza.springframework.project;

import hamza.springframework.project.entities.Author;
import hamza.springframework.project.entities.Book;
import hamza.springframework.project.entities.Publisher;
import hamza.springframework.project.repositories.AuthorRepository;
import hamza.springframework.project.repositories.BookRepository;
import hamza.springframework.project.repositories.PublisherRespository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ProjectApplication implements CommandLineRunner {
    private AuthorRepository authorrepository;
    private BookRepository bookRepository;
    private PublisherRespository publisherRespository;

    public ProjectApplication(AuthorRepository authorrepository, BookRepository bookRepository, PublisherRespository publisherRespository) {
        this.authorrepository = authorrepository;
        this.bookRepository = bookRepository;
        this.publisherRespository = publisherRespository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ProjectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Publisher p = new Publisher("dzdzd", "dedede");


        Author a = new Author();
        a.setFirstname("HAMZA");
        a.setLastname("HAIMEUR");

        Book b = new Book();
        b.setIsbn("fsfs");
        b.setTitle("feffdfdf");
        b.setPublisher(p);

        publisherRespository.save(p);


        a.getBooks().add(b); // for each author add his books
        b.getAuthor().add(a); // for each book add its authors


        authorrepository.save(a); //save author to repository
        bookRepository.save(b); // save book to repository


    }
}
