package jakarta.validation.constraintvalidation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.ConstraintValidator;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Target({ TYPE })
@Retention(RUNTIME)
public @interface SupportedValidationTarget {

	ValidationTarget[] value();
}
