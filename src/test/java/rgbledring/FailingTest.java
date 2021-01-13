package rgbledring;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ThreadLocalRandom;

class FailingTest {

	@Test
	void test() {
		assertThat("foo").isEqualTo("bar");
	}
}
