package jakarta.validation;

import java.time.Clock;

public interface ClockProvider {

	Clock getClock();
}
