package jakarta.validation.constraints;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.Pattern.List;
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
@Retention(RUNTIME)
@Repeatable(List.class)
@Documented
@Constraint(validatedBy = { })
public @interface Pattern {
	String regexp();
	Flag[] flags() default { };
	String message() default "{jakarta.validation.constraints.Pattern.message}";
	Class<?>[] groups() default { };
	Class<? extends Payload>[] payload() default { };
	public static enum Flag {
		UNIX_LINES( java.util.regex.Pattern.UNIX_LINES ),
		CASE_INSENSITIVE( java.util.regex.Pattern.CASE_INSENSITIVE ),
		COMMENTS( java.util.regex.Pattern.COMMENTS ),
		MULTILINE( java.util.regex.Pattern.MULTILINE ),
		DOTALL( java.util.regex.Pattern.DOTALL ),
		UNICODE_CASE( java.util.regex.Pattern.UNICODE_CASE ),
		CANON_EQ( java.util.regex.Pattern.CANON_EQ );
		private final int value;
		private Flag(int value) {
			this.value = value;
		}
		public int getValue() {
			return value;
		}
	}
	@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
	@Retention(RUNTIME)
	@Documented
	@interface List {

		Pattern[] value();
	}
}
