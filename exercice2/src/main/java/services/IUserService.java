package services;

import models.UserDto;

import java.util.List;
import java.util.Optional;

/**
 * @author RubenEdery on 09/11/2017.
 */

public interface IUserService {
	
	List<UserDto> getAll();
	
	Optional<UserDto> getUserById(String id);
	
	UserDto create(UserDto userDto);
	
	void delete(String id);
	
	void update(String id, UserDto userDto);
}
