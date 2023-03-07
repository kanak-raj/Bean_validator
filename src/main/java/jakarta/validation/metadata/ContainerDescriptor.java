package jakarta.validation.metadata;

import java.util.Set;

import jakarta.validation.Valid;
public interface ContainerDescriptor {
	Set<ContainerElementTypeDescriptor> getConstrainedContainerElementTypes();
}
