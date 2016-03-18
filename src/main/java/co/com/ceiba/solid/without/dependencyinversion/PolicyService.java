package co.com.ceiba.solid.without.dependencyinversion;

import co.com.ceiba.solid.without.dependencyinversion.util.HibernateDao;
import co.com.ceiba.solid.without.dependencyinversion.util.Policy;

public class PolicyService {
	HibernateDao dao = new HibernateDao();
	
	public void createPolicy(Policy policy) {
		dao.persistPolicy(policy);
	}
	
	/*PolicyService depende de una implementación de bajo nivel*/
	
/**
 * The principle states:

A. High-level modules should not depend on low-level modules. Both should depend on abstractions.
B. Abstractions should not depend on details. Details should depend on abstractions.
**/
}
