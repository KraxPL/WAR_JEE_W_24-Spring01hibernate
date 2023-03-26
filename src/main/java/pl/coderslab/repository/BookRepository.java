package pl.coderslab.repository;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.entity.Book;
import pl.coderslab.entity.Category;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {
    @Override
    @EntityGraph(attributePaths = {"publisher", "authors", "category"})
    List<Book> findAll();

    @Override
    @EntityGraph(attributePaths = {"publisher", "authors", "category"})
    Optional<Book> findById(Long id);

    @EntityGraph(attributePaths = {"publisher", "authors", "category"})
    List<Book> findByTitle(String title);

    @EntityGraph(attributePaths = {"publisher", "authors", "category"})
    List<Book> findByCategory(Category category);

    @EntityGraph(attributePaths = {"publisher", "authors", "category"})
    List<Book> findByCategoryId(Long id);
}