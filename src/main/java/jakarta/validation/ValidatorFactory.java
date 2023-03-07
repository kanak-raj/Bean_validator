package jakarta.validation;

public interface ValidatorFactory extends AutoCloseable {

	Validator getValidator();

	ValidatorContext usingContext();

	MessageInterpolator getMessageInterpolator();

	TraversableResolver getTraversableResolver();

	ConstraintValidatorFactory getConstraintValidatorFactory();

	ParameterNameProvider getParameterNameProvider();

	ClockProvider getClockProvider();

	public <T> T unwrap(Class<T> type);

	@Override
	public void close();
}
