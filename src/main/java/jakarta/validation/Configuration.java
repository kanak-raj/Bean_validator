package jakarta.validation;

import java.io.InputStream;

import jakarta.validation.spi.ValidationProvider;
import jakarta.validation.valueextraction.ValueExtractor;
import jakarta.validation.valueextraction.ValueExtractorDeclarationException;

public interface Configuration<T extends Configuration<T>> {

	T ignoreXmlConfiguration();

	T messageInterpolator(MessageInterpolator interpolator);

	T traversableResolver(TraversableResolver resolver);

	T constraintValidatorFactory(ConstraintValidatorFactory constraintValidatorFactory);

	T parameterNameProvider(ParameterNameProvider parameterNameProvider);

	T clockProvider(ClockProvider clockProvider);

	T addValueExtractor(ValueExtractor<?> extractor);

	T addMapping(InputStream stream);

	T addProperty(String name, String value);

	MessageInterpolator getDefaultMessageInterpolator();

	TraversableResolver getDefaultTraversableResolver();

	ConstraintValidatorFactory getDefaultConstraintValidatorFactory();

	ParameterNameProvider getDefaultParameterNameProvider();

	ClockProvider getDefaultClockProvider();

	BootstrapConfiguration getBootstrapConfiguration();

	ValidatorFactory buildValidatorFactory();
}
