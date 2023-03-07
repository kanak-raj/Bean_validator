package jakarta.validation.examples;

import java.util.Map;

import jakarta.validation.ConstraintValidatorContext;
public class ConstraintValidationNodeBuilderTest {
	public void testGenerals() throws Exception {
		ConstraintValidatorContext context = null;
		context.buildConstraintViolationWithTemplate( "this detail is wrong" )
		            .addConstraintViolation();
		context.buildConstraintViolationWithTemplate( "this detail is wrong" )
		            .addPropertyNode( "street" )
		            .addConstraintViolation();
		context.buildConstraintViolationWithTemplate( "Incorrect home address" )
		            .addBeanNode()
		                .inIterable().atKey( "home" )
		            .addConstraintViolation();
		context.buildConstraintViolationWithTemplate( "this detail is wrong" )
		            .addPropertyNode( "addresses" )
		            .addPropertyNode( "country" )
		                .inIterable().atKey( "home" )
		            .addPropertyNode( "name" )
		            .addConstraintViolation();
	}

	public void testParameterNode() throws Exception {
		ConstraintValidatorContext context = null;
		context.buildConstraintViolationWithTemplate("Passwords do not match")
		            .addParameterNode(1)
		            .addConstraintViolation();
		context.buildConstraintViolationWithTemplate("Map entry password does not match")
		            .addParameterNode(1)
		            .addBeanNode() 
		                .inIterable().atKey("password")
		            .addConstraintViolation();

		context.buildConstraintViolationWithTemplate( "Map entry home present in both and does not match")
		            .addParameterNode(1)
		            .addBeanNode()
		                .inIterable().atKey("home")
		            .addConstraintViolation();
		context.buildConstraintViolationWithTemplate( "Map entry home present in both but city does not match")
		            .addParameterNode(1)
		            .addPropertyNode("city")
		                .inIterable().atKey("home")
		            .addConstraintViolation();
	}
	public static class User {
		public Map<String,Address> getAddresses() { return null; }
	}

	public static class Address {
		public String getStreet() { return null; }
		public Country getCountry() { return null; }
	}

	public static class Country {
		public String getName() { return null; }
	}

}
