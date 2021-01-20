package rgbledring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class LedRingsTest {
	private boolean[] leds;

	@Test
	void testGivenRingOfSize2_whenLevelIsSetTo51_thenLED1And2AreOn() {
		givenLEDRingOfSize(2);
		whenLevelIsSetTo(51);
		thenLEDIsOn(0);
		thenLEDIsOn(1);
	}

	@Test
	void testGivenRingOfSize2_whenLevelIsSetTo0_thenLED1And2AreOff() {
		givenLEDRingOfSize(2);
		whenLevelIsSetTo(0);
		thenLEDisOff(0);
		thenLEDisOff(1);
	}


	@Test
	void testGivenRingOfSize2_whenLevelIsSetTo0to50_thenLED1OnAndLed2Off() {
		givenLEDRingOfSize(2);
		whenLevelIsSetTo(2);
		thenLEDIsOn(0);
		thenLEDisOff(1);
	}

	private void thenLEDIsOn(int index) {
		Assertions.assertThat(leds[index]).isTrue();
	}

	private void thenLEDisOff(int index) {
		Assertions.assertThat(leds[index]).isFalse();
	}

	private void givenLEDRingOfSize(int size) {
		leds = new boolean[size];
	}

	private void whenLevelIsSetTo(int level) {
		if (level == 0) {
			leds[0] = false;
		} else if (level > 0) {
			leds[0] = true;
		}
		if (level > 50) {
			leds[0] = true;
			leds[1] = true;
		}
	}

}

