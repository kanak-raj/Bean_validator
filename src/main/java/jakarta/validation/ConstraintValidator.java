package jakarta.validation;

import java.lang.annotation.Annotation;

import jakarta.validation.constraintvalidation.SupportedValidationTarget;

public interface ConstraintValidator<A extends Annotation, T> {

	default void initialize(A constraintAnnotation) {
	}

	boolean isValid(T value, ConstraintValidatorContext context);
}
