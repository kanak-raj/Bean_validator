package jakarta.validation.metadata;

import jakarta.validation.groups.ConvertGroup;
public interface GroupConversionDescriptor {
	Class<?> getFrom();
	Class<?> getTo();
}
