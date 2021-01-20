package rgbledring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class LedRingsTest {
	private boolean led1;

	@Test
	void testGivenRingOfSize16_whenLevelIsSetTo1_thenLED1IsOn() {
		givenLEDRingOfSize16();
		whenLevelIsSetTo(1);
		thenLED1IsOn();
	}

	@Test
	void testGivenRingOfSize16_whenLevelIsSetTo0_thenLED1IsOff() {
		givenLEDRingOfSize16();
		whenLevelIsSetTo(0);
		thenLED1IsOff();
	}
	
	@Test
	void testGivenRingOfSize2_whenLevelIsSetTo51_thenLED1IsOff() {
		givenLEDRingOfSize2();
		whenLevelIsSetTo(0);
		thenLED1IsOff();
	}

	private void thenLED1IsOff() {
		Assertions.assertThat(led1).isFalse();
	}

	private void givenLEDRingOfSize16() {
	}

	private void whenLevelIsSetTo(int level) {
		if (level == 0) {
			led1 = false;
		} else if (level == 1) {
			led1 = true;
		}
	}

	private void thenLED1IsOn() {
		Assertions.assertThat(led1).isTrue();
	}
}
