package projects.exception;

@SuppressWarnings("serial")
public class DbException extends RuntimeException {

	public DbException() {
	
	}

	public DbException(String message) {
		super(message);
	
	}
	
	
	public DbException(Throwable cause) {
		super(cause);
	
	}

	// matching constructor along with superclass from each constructor
	public DbException(String message, Throwable cause) {
		super(message, cause);
	
	}

	

}
