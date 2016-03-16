package co.com.ceiba.solid.without.singleresponsability;

public class ValidationException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ValidationException(String message) {
		super(message);
	}

}
