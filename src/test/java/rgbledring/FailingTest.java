package rgbledring;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class FailingTest {

	@Test
	void test() {
		assertThat("foo").isEqualTo("bar");
	}

	@Test
	void testAnotherThing() {
		//Sorry, second test for verifying that my git ssh setup is finally correct
		assertThat("Timo").isEqualTo("error_empire");
	}
	
	@Test
	void testAnotherBoolean() {
		//Sorry, second test for verifying that my git ssh setup is finally correct
		assertThat(true).isEqualTo(Boolean.TRUE);
	}
}
