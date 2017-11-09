package entities;

import lombok.Data;
import models.BookDto;
import models.UserDto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

/**
 * @author RubenEdery on 09/11/2017.
 */

@Data
@Entity(name = "historic")
public class HistoricEntity {
	@Column(name = "date_borrow")
	private LocalDate dateBorrow;
	
	@Column(name = "date_return")
	private LocalDate dateReturn;
	
	@ManyToOne
	@JoinColumn(name = "user")
	private UserDto userDto;
	
	@ManyToOne
	@JoinColumn(name = "book")
	private BookDto bookDto;
	
}
