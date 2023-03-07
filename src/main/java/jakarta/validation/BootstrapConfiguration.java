package jakarta.validation;

import java.util.Map;
import java.util.Set;

import jakarta.validation.executable.ExecutableType;
import jakarta.validation.executable.ValidateOnExecution;
import jakarta.validation.spi.ValidationProvider;
import jakarta.validation.valueextraction.ValueExtractor;

public interface BootstrapConfiguration {

	String getDefaultProviderClassName();

	String getConstraintValidatorFactoryClassName();

	String getMessageInterpolatorClassName();

	String getTraversableResolverClassName();

	String getParameterNameProviderClassName();

	String getClockProviderClassName();

	Set<String> getValueExtractorClassNames();

	Set<String> getConstraintMappingResourcePaths();

	boolean isExecutableValidationEnabled();

	Set<ExecutableType> getDefaultValidatedExecutableTypes();

	Map<String, String> getProperties();
}

