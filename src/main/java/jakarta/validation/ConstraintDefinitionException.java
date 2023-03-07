package jakarta.validation;
public class ConstraintDefinitionException extends ValidationException {

	public ConstraintDefinitionException(String message) {
		super( message );
	}

	public ConstraintDefinitionException() {
		super();
	}

	public ConstraintDefinitionException(String message, Throwable cause) {
		super( message, cause );
	}

	public ConstraintDefinitionException(Throwable cause) {
		super( cause );
	}
}
