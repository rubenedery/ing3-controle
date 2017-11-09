package entities;

import lombok.Data;
import models.BookDto;

import javax.persistence.*;

/**
 * @author RubenEdery on 09/11/2017.
 */

@Data
@Entity(name = "examplar")
public class ExemplarEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "book")
	private BookDto bookDto;
	
	
}
