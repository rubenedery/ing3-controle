package services;

import models.BookDto;

import java.util.List;
import java.util.Optional;

/**
 * @author RubenEdery on 09/11/2017.
 */
public interface IBookService {
	
	
	List<BookDto> getAll();
	
	Optional<BookDto> getbookbyid(String id);
	
	BookDto create(BookDto bookDto) throws Exception;
	
	void delete(String id);
	
	void update(String id, BookDto bookDto);
	
	
}
