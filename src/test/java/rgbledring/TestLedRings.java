package rgbledring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class LedRingsTest {
    private boolean led1;

    @Test

    void testGivenSliderIsZero()
    {
        givenLEDRingOfSize16();
        whenLevelIsSetTo(0);
        thenLED1IsOff(led1);
    }


    private void whenLevelIsSetTo() {
    }

    private void givenLEDRingOfSize16() {
    }

    private void thenLED1IsOff(boolean led1) {
        Assertions.assertThat(led1).isTrue();
    }
}
