package jakarta.validation;

import java.util.List;

import jakarta.validation.valueextraction.ValueExtractor;

public interface Path extends Iterable<Path.Node> {

	@Override
	String toString();

	interface Node {

		String getName();

		boolean isInIterable();

		Integer getIndex();

		Object getKey();

		ElementKind getKind();

		<T extends Node> T as(Class<T> nodeType);

		@Override
		String toString();
	}

	interface MethodNode extends Node {

		List<Class<?>> getParameterTypes();
	}

	interface ConstructorNode extends Node {

		List<Class<?>> getParameterTypes();
	}

	interface ReturnValueNode extends Node {
	}

	interface ParameterNode extends Node {

		int getParameterIndex();
	}

	interface CrossParameterNode extends Node {
	}

	interface BeanNode extends Node {

		Class<?> getContainerClass();

		Integer getTypeArgumentIndex();
	}

	interface PropertyNode extends Node {

		Class<?> getContainerClass();

		Integer getTypeArgumentIndex();
	}

	interface ContainerElementNode extends Node {

		Class<?> getContainerClass();

		Integer getTypeArgumentIndex();
	}
}
