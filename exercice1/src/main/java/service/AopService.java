package service;

import annotation.TryAgain;

import javax.transaction.Transactional;
import java.sql.SQLException;

/**
 * @author RubenEdery on 09/11/2017.
 */
public class AopService {
	
	
	@Transactional
	@TryAgain(exception = SQLException.class , retries = 2)
	public AopService test() {
		return this;
	}
	
}
