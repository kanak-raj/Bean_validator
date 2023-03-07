package jakarta.validation.valueextraction;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;

import jakarta.validation.Path;
public interface ValueExtractor<T> {
	void extractValues(T originalValue, ValueReceiver receiver);
	interface ValueReceiver {
		void value(String nodeName, Object object);
		void iterableValue(String nodeName, Object object);
		void indexedValue(String nodeName, int i, Object object);
		void keyedValue(String nodeName, Object key, Object object);
	}
}
