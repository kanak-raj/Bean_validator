package jakarta.validation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.OverridesAttribute.List;

@Documented
@Retention(RUNTIME)
@Target({ METHOD })
@Repeatable(List.class)
public @interface OverridesAttribute {

	Class<? extends Annotation> constraint();

	String name() default "";

	int constraintIndex() default -1;

	@Documented
	@Target({ METHOD })
	@Retention(RUNTIME)
	public @interface List {

		OverridesAttribute[] value();
	}
}
