package entities;

import lombok.Data;
import models.Categories;
import models.ExemplarDto;

import javax.persistence.*;
import java.util.List;

/**
 * @author RubenEdery on 09/11/2017.
 */


@Data
@Entity(name = "book")
public class BookEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "title")
	private String title;
	
	
	@Enumerated(EnumType.STRING)
	@Column(name = "category")
	private Categories category;
	
	@Column(name = "state")
	private boolean state;
	
	@ManyToOne
	private List<ExemplarDto> exemplarDto;
	
}
