package jakarta.validation.metadata;

import java.util.List;
import java.util.Set;

import jakarta.validation.Valid;
public interface ExecutableDescriptor extends ElementDescriptor {
	String getName();
	List<ParameterDescriptor> getParameterDescriptors();
	CrossParameterDescriptor getCrossParameterDescriptor();
	ReturnValueDescriptor getReturnValueDescriptor();
	boolean hasConstrainedParameters();
	boolean hasConstrainedReturnValue();
	@Override
	boolean hasConstraints();
	@Override
	Set<ConstraintDescriptor<?>> getConstraintDescriptors();
	@Override
	ConstraintFinder findConstraints();
}
