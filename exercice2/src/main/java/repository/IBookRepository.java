package repository;

import entities.BookEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author RubenEdery on 09/11/2017.
 */
public interface IBookRepository extends CrudRepository<BookEntity, Long> {
	List<BookEntity> findAll();
}
