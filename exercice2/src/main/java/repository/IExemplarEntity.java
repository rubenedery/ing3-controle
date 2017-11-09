package repository;

import entities.ExemplarEntity;
import entities.HistoricEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author RubenEdery on 09/11/2017.
 */
public interface IExemplarEntity extends CrudRepository<ExemplarEntity, Long> {
	List<ExemplarEntity> findAll();
}
