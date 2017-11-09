package services;

import entities.UserEntity;
import models.UserDto;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.IUserRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author RubenEdery on 09/11/2017.
 */
@Service
public class UserService implements IUserService {
	/**
	 * Initialize userRepository interface
	 */
	private final IUserRepository userRepository;
	DozerBeanMapper mapper = new DozerBeanMapper();
	
	@Autowired
	public UserService(IUserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	/**
	 * This functionnality is used when you need information about the totality of users
	 *
	 * @return
	 */
	@Override
	public List<UserDto> getAll() {
		return userRepository.findAll()
					   .stream()
					   .map(
							   //This is automapper : Use to mapping different class to another one
							   //Website Source : http://www.baeldung.com/dozer
							   u -> mapper.map(u, UserDto.class)
					   )
					   .collect(Collectors.toList());
	}
	
	@Override
	public Optional<UserDto> getUserById(String id) {
		UserEntity userEntity = userRepository.findOne(Long.parseLong(id));
		return (userEntity != null) ?
					   Optional.of(
							   mapper.map(userEntity, UserDto.class)
					   )
					   : Optional.empty();
	}
	
	@Override
	public UserDto create(UserDto userDto) {
		UserEntity userEntity = userRepository.save(mapper.map(userDto,UserEntity.class));
		return mapper.map(userEntity,UserDto.class);
	}
	
	@Override
	public void delete(String id) {
		userRepository.delete(Long.parseLong(id));
	
	}
	
	@Override
	public void update(String id, UserDto userDto) {
		
	}
}
	