package jakarta.validation;

import java.util.List;

import jakarta.validation.spi.ValidationProvider;

public interface ValidationProviderResolver {

	List<ValidationProvider<?>> getValidationProviders();
}
