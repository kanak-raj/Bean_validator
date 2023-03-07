package jakarta.validation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.groups.Default;

@Target({ TYPE })
@Retention(RUNTIME)
@Documented
public @interface GroupSequence {

	Class<?>[] value();
}
