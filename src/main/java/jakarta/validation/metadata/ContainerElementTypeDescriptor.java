package jakarta.validation.metadata;

import jakarta.validation.Valid;
public interface ContainerElementTypeDescriptor extends ElementDescriptor, CascadableDescriptor, ContainerDescriptor {
	Integer getTypeArgumentIndex();
	Class<?> getContainerClass();
}
