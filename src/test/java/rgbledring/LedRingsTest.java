package rgbledring;

import java.util.function.IntPredicate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class LedRingsTest {
	private boolean led1;
	private boolean led2;
	
	@Test
	void testGivenRingOfSize2_whenLevelIsSetTo51_thenLED1And2AreOn() {
		givenLEDRingOfSize(2);
		whenLevelIsSetTo(51);
		thenLED1IsOn();
		thenLED2IsOn();
	}

	@Test
	void testGivenRingOfSize2_whenLevelIsSetTo0_thenLED1And2AreOff() {
		givenLEDRingOfSize(2);
		whenLevelIsSetTo(0);
		thenLED1IsOff();
		thenLED2IsOff();
	}


	@Test
	void testGivenRingOfSize2_whenLevelIsSetTo0to50_thenLED1OnAndLed2Off() {
		givenLEDRingOfSize(2);
		whenLevelIsSetTo(2);
		thenLED1IsOn();
		thenLED2IsOff();
	}	

	private void thenLED1IsOn() {
		Assertions.assertThat(led1).isTrue();
	}

	private void thenLED1IsOff() {
		Assertions.assertThat(led1).isFalse();
	}

	private void thenLED2IsOn() {
		Assertions.assertThat(led2).isTrue();
	}

	private void thenLED2IsOff() {
		Assertions.assertThat(led2).isFalse();
	}	

	private void givenLEDRingOfSize(int size) {
	}

	private void whenLevelIsSetTo(int level) {
		if (level == 0) {
			led1 = false;
		}else if (level > 0) {
			led1 = true;
		}
		if (level > 50) {
			led1 = true;
			led2 = true;
		}
	}

}

