package models;

import lombok.*;

import javax.validation.constraints.Pattern;

/**
 * @author RubenEdery on 09/11/2017.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ExemplarDto {
	@Pattern(regexp = "[0-9]{1,}")
	private String id;
	private BookDto bookDto;
}
