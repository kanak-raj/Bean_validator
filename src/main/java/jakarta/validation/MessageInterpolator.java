package jakarta.validation;

import java.util.Locale;

import jakarta.validation.metadata.ConstraintDescriptor;

public interface MessageInterpolator {

	String interpolate(String messageTemplate, Context context);

	String interpolate(String messageTemplate, Context context,  Locale locale);

	interface Context {
		ConstraintDescriptor<?> getConstraintDescriptor();

		Object getValidatedValue();

		<T> T unwrap(Class<T> type);
	}
}
