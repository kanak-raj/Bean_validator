package jakarta.validation;

import jakarta.validation.valueextraction.ValueExtractor;
import jakarta.validation.valueextraction.ValueExtractorDeclarationException;

public interface ValidatorContext {

	ValidatorContext messageInterpolator(MessageInterpolator messageInterpolator);

	ValidatorContext traversableResolver(TraversableResolver traversableResolver);

	ValidatorContext constraintValidatorFactory(ConstraintValidatorFactory factory);

	ValidatorContext parameterNameProvider(ParameterNameProvider parameterNameProvider);

	ValidatorContext clockProvider(ClockProvider clockProvider);

	ValidatorContext addValueExtractor(ValueExtractor<?> extractor);

	Validator getValidator();
}
