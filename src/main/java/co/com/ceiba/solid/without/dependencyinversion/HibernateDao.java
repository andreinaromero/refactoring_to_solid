package co.com.ceiba.solid.without.dependencyinversion;

import static co.com.ceiba.solid.without.dependencyinversion.Log4jLogger.*;

public class HibernateDao {

	Log4jLogger logger = new Log4jLogger();
	
	public void persistPolicy(Policy policy) {
		logger.log(DEBUG, "Se va a persistir la p�liza: " + policy.getName());
		//entityManager.persist(policy);
	}
	
	/*HibernateDao depende de una implementaci�n de bajo nivel*/


}
