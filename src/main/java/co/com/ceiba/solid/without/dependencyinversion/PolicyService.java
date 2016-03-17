package co.com.ceiba.solid.without.dependencyinversion;

public class PolicyService {
	HibernateDao dao = new HibernateDao();
	
	public void createPolicy(Policy policy) {
		dao.persistPolicy(policy);
	}
	
	/*PolicyService depende de una implementación de bajo nivel*/
	/*The principle states:[1]

A. High-level modules should not depend on low-level modules. Both should depend on abstractions.
B. Abstractions should not depend on details. Details should depend on abstractions.
	 * */
}
