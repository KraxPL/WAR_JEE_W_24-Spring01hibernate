package pl.coderslab.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import pl.coderslab.dao.BookDao;
import pl.coderslab.entity.Author;
import pl.coderslab.entity.Book;
import pl.coderslab.entity.Category;
import pl.coderslab.entity.Publisher;
import pl.coderslab.repository.BookRepository;
import pl.coderslab.service.AuthorService;
import pl.coderslab.service.BookService;
import pl.coderslab.service.PublisherService;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
@Primary
public class BookServiceSpringDataImpl implements BookService {

    private final BookRepository bookRepository;
    private final PublisherService publisherService;


    private final AuthorService authorService;

    @Override
    public void save(Book book) {
        bookRepository.save(book);
    }

    @Override
    public Book findById(Long id) {
     return bookRepository.findById(id).get();
//        Hibernate.initialize(book.getAuthors());
//        Hibernate.initialize(book.getPublisher());
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public List<Book> findAllByRating(int rating) {
//        return bookDao.findByRating(rating);
        return null;
    }

    @Override
    public List<Book> findByPublisherIsNotNull() {
//        return bookDao.findByPublisherIsNotNull();
        return null;
    }

    @Override
    public List<Book> findByPublisher(Publisher publisher) {
//        return bookDao.findByPublisher(publisher);
        return null;
    }

    @Override
    public List<Book> findByAuthor(Author author) {
//        return bookDao.findByAuthor(author);
        return null;
    }

    @Override
    public void update(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public List<Book> findByTitle(String title) {
        return bookRepository.findByTitle(title);
    }

    @Override
    public List<Book> findByCategory(Category category) {
        return bookRepository.findByCategory(category);
    }

    @Override
    public List<Book> findByCategory(Long id) {
        return bookRepository.findByCategoryId(id);
    }
}
