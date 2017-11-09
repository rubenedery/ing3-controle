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
public class UserDto {
	@Pattern(regexp = "[0-9]{1,}")
	private String id;
	private String firstName;
	private String lastName;
	private List<ExemplarDto> borrow;
}
