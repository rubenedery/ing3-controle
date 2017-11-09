package repository;

import entities.HistoricEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author RubenEdery on 09/11/2017.
 */
public interface IHistoricRepository extends CrudRepository<HistoricEntity, Long> {
	List<HistoricEntity> findAll();
}
