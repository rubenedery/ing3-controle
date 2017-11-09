package repository;

import entities.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author RubenEdery on 09/11/2017.
 */
public interface IUserRepository extends CrudRepository<UserEntity, Long> {
		List<UserEntity> findAll();
}
