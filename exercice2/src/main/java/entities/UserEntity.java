package entities;

import lombok.Data;
import models.ExemplarDto;

import javax.persistence.*;
import java.util.List;

/**
 * @author RubenEdery on 09/11/2017.
 */

@Data
@Entity(name = "user")
public class UserEntity	 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@OneToMany
	@JoinColumn(name = "exemplar")
	private List<ExemplarDto> borrow;
	
	
}
