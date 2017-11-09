package models;

import lombok.*;

import java.time.LocalDate;

/**
 * @author RubenEdery on 09/11/2017.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class HistoricDto {
	
	private LocalDate dateBorrow;
	private LocalDate dateReturn;
	private UserDto userDto;
	private BookDto bookDto;
	
	
}
