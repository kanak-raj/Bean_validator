package jakarta.validation.executable;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PACKAGE;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.ValidationException;
@Target({ CONSTRUCTOR, METHOD, TYPE, PACKAGE })
@Retention(RUNTIME)
@Documented
public @interface ValidateOnExecution {
	ExecutableType[] type() default {ExecutableType.IMPLICIT};
}
