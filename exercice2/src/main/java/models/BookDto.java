package models;

import lombok.*;

import javax.validation.constraints.Pattern;
import java.util.List;

/**
 * @author RubenEdery on 09/11/2017.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookDto {
	@Pattern(regexp = "[0-9]{1,}")
	private String id;
	private String title;
	private Categories category;
	private boolean state;
	private List<ExemplarDto> exemplarDto;
	
}
