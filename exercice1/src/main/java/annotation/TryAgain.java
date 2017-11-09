package annotation;

import java.lang.annotation.*;

/**
 * @author RubenEdery on 09/11/2017.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD) //can use in method only.
@Documented
public @interface TryAgain {
	/**
	 * Specify exception for which operation should be retried.
	 */
	Class exception() default Exception.class;
	//Class<?> myClasse() default Object.class;
	/**
	 * Sets the number of times to retry the operation. The default of -1 indicates we want to use whatever the global default is.
	 */
	int retries() default -1;
}
