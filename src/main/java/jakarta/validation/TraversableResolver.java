package jakarta.validation;

import static jakarta.validation.Path.*;

import java.lang.annotation.ElementType;

public interface TraversableResolver {
	boolean isReachable(Object traversableObject,
						Node traversableProperty,
						Class<?> rootBeanType,
						Path pathToTraversableObject,
						ElementType elementType);

	boolean isCascadable(Object traversableObject,
						 Node traversableProperty,
						 Class<?> rootBeanType,
						 Path pathToTraversableObject,
						 ElementType elementType);
}
