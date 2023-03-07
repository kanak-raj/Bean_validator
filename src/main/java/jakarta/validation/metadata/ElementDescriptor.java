package jakarta.validation.metadata;

import java.lang.annotation.ElementType;
import java.util.Set;

import jakarta.validation.groups.Default;
public interface ElementDescriptor {
	boolean hasConstraints();
	Class<?> getElementClass();
	Set<ConstraintDescriptor<?>> getConstraintDescriptors();
	ConstraintFinder findConstraints();
	interface ConstraintFinder {
		ConstraintFinder unorderedAndMatchingGroups(Class<?>... groups);
		ConstraintFinder lookingAt(Scope scope);
		ConstraintFinder declaredOn(ElementType... types);
		Set<ConstraintDescriptor<?>> getConstraintDescriptors();
		boolean hasConstraints();
	}
}