package jakarta.validation;

public class ConstraintDeclarationException extends ValidationException {

	public ConstraintDeclarationException(String message) {
		super( message );
	}

	public ConstraintDeclarationException() {
		super();
	}

	public ConstraintDeclarationException(String message, Throwable cause) {
		super( message, cause );
	}

	public ConstraintDeclarationException(Throwable cause) {
		super( cause );
	}
}
