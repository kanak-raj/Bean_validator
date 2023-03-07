package jakarta.validation.spi;

import jakarta.validation.Configuration;
import jakarta.validation.ValidationException;
import jakarta.validation.ValidationProviderResolver;
import jakarta.validation.ValidatorFactory;
public interface ValidationProvider<T extends Configuration<T>> {
	T createSpecializedConfiguration(BootstrapState state);
	Configuration<?> createGenericConfiguration(BootstrapState state);
	ValidatorFactory buildValidatorFactory(ConfigurationState configurationState);
}
